package com.anhtester.objectclass;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private String className;

    //Hàm xây dựng không có tham số
    public SinhVien(){
        name = "Phương";
        age = 32;
        address = "Hà Nội";
        className = "Java Basic";
    }

    //Hàm xây dựng có tham số
    public SinhVien(String name, int age, String address, String className){
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    public SinhVien(String name, int age){

    }

    public void printInfo(){
        System.out.println("ABC");
    }

    //Các hàm truy xuất thông tin
    public String getName(){
        return name;
    }

    public String getClassName(){
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
