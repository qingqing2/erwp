package service.impl;

import dao.LeibieMapper;
import model.Leibie;
import model.LeibieExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LeibieService;

import java.util.List;
@Service
public class LeibieServiceImpl implements LeibieService {

    @Autowired
    private LeibieMapper leibieMapper;

    @Override
    public List<Leibie> findAll() {
        LeibieExample example = new LeibieExample();
        example.createCriteria().andDelEqualTo("no");
        List<Leibie> leibies = leibieMapper.selectByExample(example);
        return leibies;
    }

    @Override
    public void updateLeibieByKey(Integer id) {
        Leibie leibie = new Leibie();
        leibie.setId(id);
        leibie.setDel("yes");
        leibieMapper.updateByPrimaryKeySelective(leibie);
    }

    @Override
    public void addLeibie(Leibie leibie) {
        leibieMapper.insertSelective(leibie);
    }
}
