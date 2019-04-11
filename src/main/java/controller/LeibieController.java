package controller;

import model.Leibie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LeibieService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LeibieController {

    @Autowired
    private LeibieService leibieService;

    @RequestMapping("/leibieMana")
    public String leibieMana(HttpServletRequest request) {
        List<Leibie> all = leibieService.findAll();
        request.setAttribute("leibieList", all);
        return "/admin/leibie/leibieMana";
    }

    @RequestMapping("/leibieSelect")
    @ResponseBody
    public List<Leibie> leibieSelect() {
        List<Leibie> all = leibieService.findAll();
        return all;
    }

    @RequestMapping("/leibieDel")
    public String leibieMana(Integer id, HttpServletRequest request) {
        leibieService.updateLeibieByKey(id);
        List<Leibie> all = leibieService.findAll();
        request.setAttribute("leibieList", all);
        return "/admin/leibie/leibieMana";
    }

    @RequestMapping("/leibieAdd")
    public String leibieAdd(Leibie leibie, HttpServletRequest request) {
        leibie.setDel("no");
        leibieService.addLeibie(leibie);
        List<Leibie> all = leibieService.findAll();
        request.setAttribute("leibieList", all);
        return "/admin/leibie/leibieMana";
    }


}
