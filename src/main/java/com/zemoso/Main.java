package com.zemoso;

import java.util.Scanner;

public class Main {
    //The program depends on the contains method for time complexity. Generally O(n).
    // Space complexity is O(n) since I am using no other DS's in the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check for");
        String checkStringForAllChars = scanner.next();
//        System.out.println((char)(97+25));
        boolean hasAllChars=true;
        //program utilizes advantage of int to char conversion
        for (int i = 97; i < 97+25; i++) {
            if (!checkStringForAllChars.contains(Character.toString((char) i))) {
                hasAllChars=false;
            }
        }
        if (hasAllChars){
            System.out.println("Yes Input String has all chars");
        }else{
            System.out.println("Input string does not have all chars");
        }
    }
}
