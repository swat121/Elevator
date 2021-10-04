package com.company.Controller;

import com.company.ElevatorClass.PassengerElevator;
import com.company.Interface.controllerInterface;

public class Controller extends PassengerElevator implements controllerInterface {
    PassengerElevator passengerElevator = new PassengerElevator();
    private int status = 0;
    private int weight;

    public Controller(int weight) {
        this.weight = weight;
    }

    @Override
    public void getElevator() {
        System.out.println("Лифт спускается с "+ status + " єтажа");
        status = 0;
    }

    @Override
    public void callDispatcher() {
        System.out.println("Вызов диспетчера");
    }

    @Override
    public void stopButton() {
        System.out.println("Остановка лифта");
    }

    @Override
    public void runElevator(int floorNumber) {
        if(floorNumber>status){
            passengerElevator.goUp();
        } else {
            if (floorNumber<status){
                passengerElevator.goDown();
            }
        }
        status = floorNumber;
    }

}
