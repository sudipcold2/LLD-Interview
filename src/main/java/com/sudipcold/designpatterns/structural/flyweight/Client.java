package com.sudipcold.designpatterns.structural.flyweight;

public class Client {

    public static void main(String args[]) {

        F16 flyweightF16 = new F16();

        int[][] coordsF16 = new int[3][2];
        for (int i = 0; i < coordsF16.length; i++) {
            int currX = coordsF16[i][0];
            int currY = coordsF16[i][1];

            // We are passing in the extrinsic state to the flyweight object. Note we are storing the
            // extrinsic state of the airborne f16s in a 2-dimensional array.
            System.out.println("time to destination = " +
                    flyweightF16.getTimeToDestination(currX, currY, 10, 10, 200));
        }

    }
}
