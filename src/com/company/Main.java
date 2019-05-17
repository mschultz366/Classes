package com.company;

public class Main extends Employee {

    public static void main(String[] args) {

        Employee person1 = new Employee("Donnie Darko", "1(888)987-0101", 2);
        Employee person2 = new Employee("Shaggy Boureguard", "815-923-9772", 3);
        Employee person3 = new Employee("Randy Marsh", "1-808-33-27263", 1);

        person1.display();
        person2.display();
        person3.display();
    }
}
