package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = 0;

        System.out.println("Enter a number: ");
        N = scan.nextInt();
        scan.nextLine();

        for (int x = 1; x <= N; x++){
            if(x % 2 == 0){
                System.out.println("Not Weird");
                if (x % 2 ==0 && x > 2 && x < 5){
                    System.out.println("Not Weird");
                } else if (x % 2 == 0 && x > 6 && x < 20){
                    System.out.println("Weird");
                }
            } else {
                System.out.println("Weird");
            }
        }
    }
}
