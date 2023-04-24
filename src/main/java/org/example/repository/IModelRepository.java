package org.example.repository;
import org.example.model.Model;
import java.util.ArrayList;

public interface IModelRepository {

    void add(Model model);
    void deleteById(Long id);
    ArrayList findAll();
    public Long nextIdAvaliable();
    Model findById(Long id);
    void update(Model model);

}