package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList();
        Car c1=new Car("Mercedes", "ML", 2017);
        Car c2=new Car("Volkswagen", "Golf4", 2009);
        Car c3=new Car("Pegaut", "308", 2015);
        Car c4=new Car("BMW", "M4", 2020);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        Collections.sort(cars);
        for(int i=0;i<4;i++){
            System.out.println( cars.get(i).toString());
        }

    }
}
