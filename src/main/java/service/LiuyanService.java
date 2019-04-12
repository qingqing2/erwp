package service;

import model.Liuyuan;

import java.util.List;

public interface LiuyanService {
    List<Liuyuan> findAll();

    void liuyanDel(Integer id);
}
