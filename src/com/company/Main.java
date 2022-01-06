package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String answer1;
        String answer2;
        String answer3;
        String answer4;


        Scanner sc = new Scanner(System.in);




        System.out.println("1,024 Gigabytes is equal to one what?");
       answer1 = sc.nextLine();


        System.out.println("In our solar system which is the only planet that rotates clockwise?");
        answer2 = sc.nextLine();


        System.out.println("The largest volcano ever discovered in our solar system is located on which planet?");
        answer3 = sc.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere?");
        answer4 = sc.nextLine();



        System.out.println("Wow, 1024 Gigabytes is a " + answer1);

        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer3);

        System.out.println("That's amazing that " + answer4 + " is the most abundant element in the atmosphere.");

        System.out.println(answer2 + " is the only planet that rotates clockwise, neat!");





    }
}
