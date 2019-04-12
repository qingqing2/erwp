package service;

import model.Huiyuan;

import java.util.List;

public interface HuiyuanService {
    List<Huiyuan> findAll();

    void updateByKey(Integer id);
}
