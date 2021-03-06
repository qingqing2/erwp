package controller;

import model.Goods;
import model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/uploadF")
    @ResponseBody
    public String upload(MultipartFile fujian, HttpServletRequest request) {
        String upload = request.getSession().getServletContext().getRealPath("upload");
        goodsService.upload(fujian, upload);
        return "上传成功";
    }

    @RequestMapping("/goodsAdd")
    public String goodsAdd(Goods goods, HttpServletRequest request) {
        goods.setFujian("/upload/" + goods.getFujian());
        goods.setDel("no");
        goods.setTejia(goods.getJiage());
        goods.setShifoutejia("no");
        goodsService.addGoods(goods);
        List<Goods> all = goodsService.findAll();
        request.setAttribute("goodsList", all);
        return "/admin/goods/goodsMana";
    }

    @RequestMapping("/site/goodsRes")
    public String goodsRes(Integer index, String mingcheng, HttpServletRequest request) {
        if (index == null) {
            index = 0;
        }
        Page<List<Goods>> page = goodsService.findByMingcheng(index, mingcheng);
        request.setAttribute("page", page);
        request.setAttribute("mingcheng", mingcheng);
        return "/site/goods/goodsRes";
    }

    @RequestMapping("/site/goodsDetailQian")
    public String goodsDetailQian(Integer id, HttpServletRequest request) {
        Goods goods = goodsService.selectByKey(id);
        request.setAttribute("goods", goods);
        return "/site/goods/goodsDetailQian";
    }
}
