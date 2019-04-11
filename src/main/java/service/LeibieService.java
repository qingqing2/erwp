package service;

import model.Leibie;

import java.util.List;

public interface LeibieService {
    List<Leibie> findAll();

    void updateLeibieByKey(Integer id);

    void addLeibie(Leibie leibie);
}
