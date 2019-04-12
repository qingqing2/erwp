package service.impl;

import dao.HuiyuanMapper;
import model.Huiyuan;
import model.HuiyuanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.HuiyuanService;

import java.util.List;
@Service
public class HuiyuanServiceImpl implements HuiyuanService {

    @Autowired
    private HuiyuanMapper huiyuanMapper;

    @Override
    public List<Huiyuan> findAll() {
        HuiyuanExample example = new HuiyuanExample();
        example.createCriteria().andDelEqualTo("no");
        List<Huiyuan> huiyuans = huiyuanMapper.selectByExample(example);
        return huiyuans;
    }

    @Override
    public void updateByKey(Integer id) {
        Huiyuan huiyuan = new Huiyuan();
        huiyuan.setId(id);
        huiyuan.setDel("yes");
        huiyuanMapper.updateByPrimaryKeySelective(huiyuan);
    }
}
