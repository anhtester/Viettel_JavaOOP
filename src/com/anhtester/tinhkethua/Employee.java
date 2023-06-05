package com.anhtester.tinhkethua;

public class Employee extends Person{
    public Employee(String name, int age, float height){
        //super(name, age, height);
        super();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Hùng", 25, 70);
        employee.getInfo();
    }
}
