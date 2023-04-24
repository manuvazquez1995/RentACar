package org.example.repository;
import org.example.model.Model;
import java.util.ArrayList;

public class ModelRepository implements IModelRepository{

    private final ArrayList<Model> models;

    public ModelRepository(){models = new ArrayList<>();}


    @Override
    public void add(Model model){
        model.setId(nextIdAvaliable());
        models.add(model);
    }

    @Override
    public Long nextIdAvaliable(){
        if(!models.isEmpty()){
            return models.get(models.size()-1).getId()+1;
        }else{
            return (long)1;
        }
    }

    @Override
    public void deleteById(Long id){
        for(Model model : models){
            if(model.getId() == id){
                models.remove(model);
                break;
            }
        }
    }

    @Override
    public Model findById(Long id){
        for(Model model : models){
            if(model.getId() == id){
                return model;
            }
        }
        return null;
    }

    @Override
    public ArrayList findAll(){return models;}

    @Override
    public void update(Model model){
        Model modelToUpdate = findById(model.getId());
        if(modelToUpdate != null){
            modelToUpdate.setName(model.getName());
            modelToUpdate.setPricePerDay(model.getPricePerDay());
        }
    }





}