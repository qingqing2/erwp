package controller;

import model.Huiyuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.HuiyuanService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HuiyuanController {

    @Autowired
    private HuiyuanService huiyuanService;

    @RequestMapping("/huiyuanMana")
    public String huiyuanMana(HttpServletRequest request) {
        List<Huiyuan> all = huiyuanService.findAll();
        request.setAttribute("huiyuanList", all);
        return "/admin/huiyuan/huiyuanMana";
    }

    @RequestMapping("/huiyuanDel")
    public String huiyuanDel(Integer id, HttpServletRequest request) {
        huiyuanService.updateByKey(id);
        List<Huiyuan> all = huiyuanService.findAll();
        request.setAttribute("huiyuanList", all);
        return "/admin/huiyuan/huiyuanMana";
    }
}
