package com.assignment;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //LocalTime localTime = LocalTime.now();

        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(calendar.HOUR_OF_DAY);

        Random random = new Random();
        int low = 18;
        int high = 90;
        int computerAge = random.nextInt(high - low) + low;
        int comparedAge;

        System.out.print("Enter your name:");
        String name = scanner.next();


       /*if((localTime.compareTo(LocalTime.NOON)) < 0){
            System.out.println("Good morning " + name);
        }else {
            System.out.println("Good afternoon " + name);
        }*/

        if((timeOfDay >= 0 && timeOfDay <  12)){
            System.out.println("Good morning " + name);
        }else{
            System.out.println("Good afternoon " + name);
        }

        System.out.println("--------------------------------------------");

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if(age < computerAge){

            comparedAge = computerAge - age;
            System.out.println("I am " + computerAge + " years old, " + "which is " + comparedAge + " years older than you.");
        }else{

            comparedAge = age - computerAge;
            System.out.println("I am " + computerAge + " years old, " + "which is  " + comparedAge + " older than you.");
        }

        System.out.println("Twice my age would be " + computerAge * 2);

        if(computerAge % 2 == 0){
            System.out.println("My age is an Even number");
        }else {
            System.out.println("My age is an Odd number");
        }

        System.out.println("-------------------------------");
        System.exit(0);
    }
}
