package com.company.ElevatorClass;

import com.company.Interface.passengerElevatorInterface;

public class PassengerElevator implements passengerElevatorInterface {

    @Override
    public void goUp() {
        System.out.println("Пассажирский лифт едет вверх");
    }

    @Override
    public void goDown() {
        System.out.println("Пассажирский лифт едет вниз");
    }
}
