package com.company.Controller;

import com.company.ElevatorClass.PassengerElevator;
import com.company.Interface.controllerInterface;

public class Controller extends PassengerElevator implements controllerInterface {
    private PassengerElevator passengerElevator = new PassengerElevator();
    private int status = 1;

    @Override
    public void getElevator(int currentFloor) throws InterruptedException {
        if(status == currentFloor) {
            System.out.println("Лифт находится на вашем этаже");
        }
        else {
            if(status > currentFloor){
                while (status != currentFloor){
                    System.out.println("Лифт спускается с "+ status + " этажа");
                    Thread.sleep(500);
                    status--;
                }
            }
            if(status < currentFloor) {
                while (status != currentFloor) {
                    System.out.println("Лифт поднимается с " + status + " этажа");
                    Thread.sleep(500);
                    status++;
                }
            }
            System.out.println("Лифт приехал на "+ status + " этаж");
        }
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
    public void runElevator(int floorNumber) throws InterruptedException {
        if(floorNumber>status){
            while (status != floorNumber){
                passengerElevator.goUp();
                status++;
                Thread.sleep(500);
            }

        } else {
            if (floorNumber<status){
                while (status != floorNumber) {
                    passengerElevator.goDown();
                    status--;
                    Thread.sleep(500);
                }
            }
        }
    }

}
