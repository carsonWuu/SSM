package com.sp.practice.car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class CarFactory {
    
    @Autowired
    @Qualifier("bmwCar")
    private ICar car;
    
    public String toString(){
        return car.getCarName();
    }
    
}