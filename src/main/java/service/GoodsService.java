package service;


import model.Goods;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface GoodsService {
    List<Goods> findAll();

    void updateByKey(Integer id);

    void upload(MultipartFile file, String uploadPath);
}
