package org.example.model;
import java.util.Date;

public class Rental {

    private long id;

    private Date startDate;

    private Date endDate;

    private Car car;

    private Client client;


    public Rental (long id, Date startDate, Date endDate, Car car, Client client){
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
        this.client = client;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }


}