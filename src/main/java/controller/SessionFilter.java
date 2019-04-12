package controller;

import model.Admin;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionFilter implements Filter {

        public void init(FilterConfig filterConfig) throws ServletException {

        }

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            res.addHeader("Access-Control-Allow-Origin", "*");
            String uri = req.getRequestURI();
            if (uri.indexOf("login") != -1 || uri.indexOf("Login") != -1) {
                chain.doFilter(req, res);
            } else if ((uri.contains(".css") || uri.contains(".js") || uri.contains(".jpg") || uri.contains(".png")
                    || uri.contains(".jpng") || uri.contains("site/")) && (!uri.contains(".jsp") || uri.contains("site/"))){
                req.getSession().setAttribute("userType", 0);
                chain.doFilter(req, res);
            } else {
                HttpSession session = req.getSession();
                Admin user = (Admin) session.getAttribute("admin");
                String username = "";
                if (user != null && !user.equals("")) {
                    username = user.getUsername();
                }
                if (!"".equals(username) && username != null) {
                    chain.doFilter(req, res);
                } else {
                    session.invalidate();
                    res.setContentType("text/html;charset=utf-8");
                    PrintWriter out = res.getWriter();
                    out.println("<script language='javascript' type='text/javascript'>");
                    out.println("window.top.location.href='" + req.getContextPath() + "/login.jsp'");
                    out.println("</script>");
                }
            }

            if (uri.indexOf("redirect") != -1) {
                if (null != request.getParameter("userimg")) {
                    chain.doFilter(req, res);
                }
            }
        }

        public void destroy() {

        }
    }
