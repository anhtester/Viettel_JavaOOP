package com.anhtester.tinhdonggoi;

public class Information {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Hoa");
        student.setAge(30);
        student.setAddress("Hà Nội");
        student.setGender("Nữ");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Gender: " + student.getGender());

        student.setName("Phương");
        System.out.println("Name: " + student.getName());

        Student student2 = new Student();
        student2.setName("Huyền");
        System.out.println("Name: " + student2.getName());

    }

}
