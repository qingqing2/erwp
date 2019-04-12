package service.impl;

import dao.LiuyuanMapper;
import model.Liuyuan;
import model.LiuyuanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LiuyanService;

import java.util.List;
@Service
public class LiuyanServiceImpl implements LiuyanService {

    @Autowired
    private LiuyuanMapper liuyuanMapper;

    @Override
    public List<Liuyuan> findAll() {
        LiuyuanExample example = new LiuyuanExample();
        List<Liuyuan> liuyuans = liuyuanMapper.selectByExample(example);
        return liuyuans;
    }

    @Override
    public void liuyanDel(Integer id) {
        liuyuanMapper.deleteByKey(id);
    }
}
