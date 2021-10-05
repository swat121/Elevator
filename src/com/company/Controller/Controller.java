package com.company.Controller;

import com.company.ElevatorClass.PassengerElevator;
import com.company.Interface.controllerInterface;

public class Controller extends PassengerElevator implements controllerInterface {
    PassengerElevator passengerElevator = new PassengerElevator();
    private int status = 0;
    

    @Override
    public void getElevator(int currentFloor) {
        if(status == currentFloor) {
            System.out.println("Лифт находится на вашем этаже");
        }
        else {
            System.out.println("Лифт едет с "+ status + " єтажа");
        }
        status = currentFloor;
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
