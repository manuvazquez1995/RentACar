package org.example.repository;
import org.example.model.Car;
import java.util.ArrayList;

public class CarRepository implements ICarRepository {

    private final ArrayList<Car> cars;

    public CarRepository(){cars = new ArrayList<>(); }

    @Override
    public void add(Car car) {
        car.setId(nextIdAvailable());
        cars.add(car);
    }

    @Override
    public void deleteById(Long id) {
        for(Car car : cars){
            if(car.getId() == id){
                cars.remove(car);
                break;
            }
        }
    }

    @Override
    public ArrayList findAll() {
        return cars;
    }

    @Override
    public Long nextIdAvailable() {
        if(!cars.isEmpty()){
            return cars.get(cars.size()-1).getId()+1;
        }else{
            return (long)1;
        }
    }

    @Override
    public Car findById(Long id) {
        for(Car car : cars){
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    @Override
    public void update(Car car) {
        Car carToUpdate = findById(car.getId());
        if(carToUpdate != null){
            carToUpdate.setLicensePlate(car.getLicensePlate());
            carToUpdate.setModel(car.getModel());
        }
    }

}