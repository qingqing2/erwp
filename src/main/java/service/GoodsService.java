package service;


import model.Goods;
import model.Page;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface GoodsService {
    List<Goods> findAll();

    void updateByKey(Integer id);

    void upload(MultipartFile file, String uploadPath);

    void addGoods(Goods goods);

    Page<List<Goods>> findByMingcheng(int index, String mingcheng);
    Goods selectByKey(Integer id);
}
