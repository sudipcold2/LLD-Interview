package com.sudipcold.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Client {

    public void main(DroneProxy droneProxy) {
        // perpetual loop that received pilot actions
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            switch (action) {
                case "left": {
                    droneProxy.turnLeft();
                    break;
                }

                case "right": {
                    droneProxy.turnRight();
                    break;
                }

                case "fire": {
                    droneProxy.firstMissile();
                    break;
                }

                default:
                    log.info("Invalid Action");
            }
        }
    }
}
