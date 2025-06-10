package com.douglasva.employee.entities;

public class Employee {

    public String name;
    public double tax;
    public double grossSalary;

    public String toString () {
        return name + ", $ " + String.format("%.2f", netSalary());
    }

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

}