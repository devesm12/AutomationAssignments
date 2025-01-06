package com.creatio.crm.language.basics;

class Employee {
    String name;
    double baseSalary;
    int experience;
    float rating;
    double hikePercentage;

    public void calcHike() {
        double variablePayPercentage = 0;
        double bonus = 0;
        double reward = 0;

        // Determine variable pay percentage and bonus based on year-end rating
        if (rating >= 4) {
            variablePayPercentage = 0.15;
            bonus = 1500;
        } else if (rating >= 3) {
            variablePayPercentage = 0.10;
            bonus = 1200;
        } else {
            variablePayPercentage = 0.03;
            bonus = 300;
        }

        // Determine reward based on experience
        if (experience >= 5) {
            reward = 5000;
        }

        // Calculate hike
        double hike = (baseSalary * variablePayPercentage) + bonus + reward;
        hikePercentage = (hike / baseSalary) * 100;
    }
}
