package com.anhtester.objectclass;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private String className;


    public SinhVien(String a, int b, String c){

    }


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

    public SinhVien(int name, int age){

    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(className);
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
