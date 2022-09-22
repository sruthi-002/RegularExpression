package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the phone number : ");
        Scanner in = new Scanner(System.in);
        String phone = in.next();
        boolean S = Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", phone);
        if(S)
            System.out.println("Thank you ...");
        else
            System.out.println("Please Enter a valid Number ...");
    }
}
