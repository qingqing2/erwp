package service.impl;

import dao.AdminMapper;
import model.Admin;
import model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findUser(Admin user) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername()).andUserpwEqualTo(user.getUserpw());
        List<Admin> admins = adminMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(admins)) {
            return null;
        }
        return admins.get(0);
    }
}
