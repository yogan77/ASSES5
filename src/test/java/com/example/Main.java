package com.voting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of voters to evaluate: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Voter #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Citizenship (e.g., Indian): ");
            String citizenship = scanner.nextLine();

            System.out.print("Voter ID: ");
            String voterId = scanner.nextLine();

            System.out.print("Is Voter ID Valid? (true/false): ");
            boolean isIdValid = scanner.nextBoolean();
            scanner.nextLine(); 

            Voter voter = new Voter(name, age, citizenship, voterId, isIdValid);
            voter.displayReport();
        }
        scanner.close();
    }
}
