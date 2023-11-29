package com.acessspecifier.demo;

public class Vehicle {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car(10);
        Car car2=new Car(40);
        car.ride();
        car.carry();
        car.run();
    }

}
