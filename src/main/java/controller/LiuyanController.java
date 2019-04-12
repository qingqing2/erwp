package controller;

import model.Liuyuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.LiuyanService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LiuyanController {

    @Autowired
    private LiuyanService liuyanService;

    @RequestMapping("/liuyanMana")
    public String liuyanMana(HttpServletRequest request) {
        List<Liuyuan> all = liuyanService.findAll();
        request.setAttribute("liuyanList", all);
        return "/admin/liuyan/liuyanMana";
    }

    @RequestMapping("/liuyanDel")
    public String liuyanDel(Integer id, HttpServletRequest request) {
        liuyanService.liuyanDel(id);
        List<Liuyuan> all = liuyanService.findAll();
        request.setAttribute("liuyanList", all);
        return "/admin/liuyan/liuyanMana";
    }
}
