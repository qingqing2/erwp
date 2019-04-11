package service.impl;

import dao.GoodsMapper;
import model.Goods;
import model.GoodsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import service.GoodsService;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> findAll() {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andDelEqualTo("no");
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }

    @Override
    public void updateByKey(Integer id) {
        Goods goods = new Goods();
        goods.setDel("yes");
        goods.setId(id);
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void upload(MultipartFile file, String uploadPath){
        InputStream inputStream = null;
        FileOutputStream fos = null;
        try {

            inputStream = file.getInputStream();
            fos = new FileOutputStream(uploadPath);
            byte[] bytes = new byte[10];
            int byteread = 0;
            while ((byteread = inputStream.read(bytes)) != -1) {
                fos.write(bytes, 0, byteread);
            }
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
