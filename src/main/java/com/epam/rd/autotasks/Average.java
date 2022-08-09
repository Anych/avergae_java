package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] ints = input.split(" ");
        int sum = 0;
        
        for (String anInt : ints) {
            int num = Integer.parseInt(anInt);
            sum += num;
        }
        
        int result = sum / (ints.length - 1);
        System.out.println(result);
    }

}
