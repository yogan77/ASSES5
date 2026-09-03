package com.voting;

import java.util.ArrayList;
import java.util.List;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public List<String> evaluateEligibility() {
        List<String> reasons = new ArrayList<>();
        
        if (age < 18) {
            reasons.add("Underage (must be at least 18 years old)");
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            reasons.add("Not a citizen (must be an Indian citizen)");
        }
        if (voterId == null || voterId.trim().isEmpty() || !isIdValid) {
            reasons.add("Invalid Voter ID status");
        }
        
        return reasons;
    }

    public void displayReport() {
        List<String> issues = evaluateEligibility();
        System.out.println("---------------------------------------------");
        System.out.println("Voter Name: " + name);
        if (issues.isEmpty()) {
            System.out.println("Status: ELIGIBLE TO VOTE");
        } else {
            System.out.println("Status: INELIGIBLE TO VOTE");
            System.out.println("Reasons:");
            for (String issue : issues) {
                System.out.println(" - " + issue);
            }
        }
    }
}
