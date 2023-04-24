package org.example.repository;
import org.example.model.Rental;

import java.util.ArrayList;

public class RentalRepository implements IRentalRepository{

    private final ArrayList<Rental> rentals;

    public RentalRepository(){rentals = new ArrayList<>();}

    @Override
    public void add(Rental rental){
        rental.setId(nextIdAvaliable());
        rentals.add(rental);
    }

    @Override
    public Long nextIdAvaliable(){
        if(!rentals.isEmpty()){
            return rentals.get(rentals.size()-1).getId()+1;
        }else{
            return (long)1;
        }
    }

    @Override
    public void deleteById(Long id){
        for(Rental rental : rentals){
            if(rental.getId() == id){
                rentals.remove(rental);
                break;
            }
        }
    }

    @Override
    public Rental findById(Long id){
        for(Rental rental : rentals){
            if(rental.getId() == id){
                return rental;
            }
        }
        return null;
    }

    @Override
    public ArrayList findAll(){return rentals;}


    @Override
    public void update(Rental rental){
        Rental rentalToUpdate = findById(rental.getId());
        if(rentalToUpdate != null){
            rentalToUpdate.setCar(rental.getCar());
            rentalToUpdate.setClient(rental.getClient());
            rentalToUpdate.setStartDate(rental.getStartDate());
            rentalToUpdate.setEndDate(rental.getEndDate());
            rentalToUpdate.setClient(rental.getClient());
        }
    }





}