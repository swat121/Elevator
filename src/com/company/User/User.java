package com.company.User;

import com.company.Controller.Controller;

import java.util.Scanner;


public class User {

    public static void main(String[] args) throws InterruptedException {
        int counter;
        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ваш текущий этаж: ");
            counter = in.nextInt();
            controller.getElevator(counter);
            System.out.print("Введите нужный этаж: ");
            counter = in.nextInt();
            controller.runElevator(counter);
        }

    }
}
