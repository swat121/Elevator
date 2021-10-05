package com.company.Interface;

public interface controllerInterface {
    void getElevator(int currentFloor) throws InterruptedException;
    void callDispatcher();
    void stopButton();
    void runElevator(int status) throws InterruptedException;
}
