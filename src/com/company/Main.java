package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How old are you? ");
        int age = input.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        if(age + 10 >= 50) {
            System.out.println("In 10 years you will be old");
        }
        else {
            System.out.println("You will still be young in 10 years");
        }

        int day = 10;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }


        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----");
        boolean running = true;
        while(running) {
            System.out.print("Enter a value: ");
            int value = input.nextInt();
            if(value == 0) {
                running = false;
            }
            age += value;
            System.out.println("You are now " + age);
        }

        running = true;
        do{
            System.out.print("Enter a value: ");
            int value = input.nextInt();
            if(value == 0) {
                running = false;
            }
            age += value;
            System.out.println("You are now " + age);
        }while(running);
    }
}
