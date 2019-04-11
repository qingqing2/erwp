package controller;

import model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import service.GoodsService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goodsMana")
    public String goodsMana(HttpServletRequest request) {
        List<Goods> all = goodsService.findAll();
        request.setAttribute("goodsList", all);
        return "/admin/goods/goodsMana";
    }

    @RequestMapping("/goodsDel")
    public String goodsDel(Integer id, HttpServletRequest request) {
        goodsService.updateByKey(id);
        List<Goods> all = goodsService.findAll();
        request.setAttribute("goodsList", all);
        return "/admin/goods/goodsMana";
    }

    @RequestMapping("/upload")
    public void upload(MultipartFile fujian, HttpServletRequest request) {
        String upload = request.getSession().getServletContext().getRealPath("upload");
        goodsService.upload(fujian, upload);
    }
}
