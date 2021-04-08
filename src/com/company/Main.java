package com.company;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException { //This throws phrase tells the program to thro
        //an exception if something goes wrong when the thread sleeps for the 1 second between counting down.



	// printing out 3,2,1, then capture the reaction time from Go until the users clicks enter.

        System.out.println("3");
        Thread.sleep(1000);  //Adds 1 second between each number.  1000 millis = 1 second
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!!!!!");

        long starTime = System.currentTimeMillis();  //Gets current time in millis right after Go....


        Scanner scanner = new Scanner(System.in);  //creates a scanner instance
        scanner.next(); //picks up what user types in until they hit enter.
        long stopTime = System.currentTimeMillis();  //gets timestamp at the moment the user hits enter

        long reactionTime = stopTime - starTime;  //calculates total reaction time.

        System.out.println(reactionTime); //prints reaction time.
    }
}
