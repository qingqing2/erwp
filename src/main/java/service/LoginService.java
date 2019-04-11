package service;

import model.Admin;

public interface LoginService {
    Admin findUser(Admin user);

    void updateUser(Admin user);
}
