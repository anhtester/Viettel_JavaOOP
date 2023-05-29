package com.anhtester.tinhkethua;

public class Student extends Person {

    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height); //Đảm bảo đúng cấu trúc từ hàm xây dựng của class Person
        this.universityName = universityName;
    }

    //Ghi đè phương thức
    public void getInfo() {
        super.getInfo();
        System.out.println("University Name: " + universityName);
    }

    public void getInfoStudent(){
        super.getInfo();
        System.out.println("University Name: " + universityName);
    }

    public static void main(String[] args) {
        Student student = new Student("Huyền", 30, 50, "Bách khoa Hà Nội");
        student.getInfo(); //Hàm getInfo này thuộc về class Student. Không phải từ class Person nữa
        student.getInfoStudent();
    }
}
