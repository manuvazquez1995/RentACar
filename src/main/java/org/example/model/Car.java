package org.example.model;

public class Car {

    private long id;

    private String licensePlate;

    private Model model;


    public Car(long id, String licensePlate, Model model){
        this.id = id;
        this.licensePlate = licensePlate;
        this.model = model;
    }


    public Car(String licensePlate, Model model){
        this.licensePlate = licensePlate;
        this.model = model;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public Model getModel(){
        return model;
    }

    public void setModel(Model model){
        this.model = model;
    }




}