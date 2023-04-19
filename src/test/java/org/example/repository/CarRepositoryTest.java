package org.example.repository;
import org.example.model.Car;
import org.example.model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarRepositoryTest {

    CarRepository repository;

    @BeforeEach
    void setUp(){
        repository = new CarRepository();
        Car car1 = new Car("B1", new Model("Audi", 30));
        Car car2 = new Car("B1", new Model("BMW", 50));
        repository.add(car1);
        repository.add(car2);
    }


    @Test
    void add(){
        Car car3 = new Car("B1", new Model("Renault", 20));
        repository.add(car3);
        Assertions.assertEquals(car3, repository.findById(3L));
        Car car4 = new Car("B1", new Model("Peugeot", 25));
        repository.add(car4);
        Assertions.assertEquals(car4, repository.findById(4L));
    }


    @Test
    void findAll(){
        Assertions.assertEquals(2, repository.findAll().size());
        Car car = new Car("B1", new Model("Dacia", 20));
        repository.add(car);
        Assertions.assertEquals(3, repository.findAll().size());
        repository.deleteById(2L);
        Assertions.assertEquals(2, repository.findAll().size());
    }








}