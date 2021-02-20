package com.tts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);

            int a[] = new int[5];

        int i, sum=0, product=1, small=5, large=0;
        System.out.println("Please enter 5 numbers between 1 and 100");

        try {
            for (i = 0; i < 5; i++) {
                a[i] = scan.nextInt();
            }

        for(i = 0; i < 5; i++){
            sum=sum+a[i];
        }
        System.out.println("sum: " +sum);

        for(i = 0; i < 5; i++) {
            product = product * a[i];
        }
        System.out.println("product: " +product);

        for (i = 0; i < 5; i++) {
            if (large < a[i])
                large = a[i];
        }
        System.out.println("max: " + large);

        for (i = 0; i < 5; i++) {
            if (small > a[i])
                small = a[i];
        }
        System.out.println("min: " + small);

        } catch (Exception e) {
            System.out.println("Sorry, please only enter number values");
        }


    }
    
}

