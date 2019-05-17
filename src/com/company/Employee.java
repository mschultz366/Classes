package com.company;

public class Employee {
    
    String name;
    String number;
    int shift;

    public Employee() {}

    public Employee(String name, String number, int shift) {
        setName(name);
        setNumber(number);
        setShift(shift);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void display() {
        System.out.println("Name: " + getName() + "\nNumber: " + getNumber() + "\nWork shift: " + getShift() + "\n");
    }
}