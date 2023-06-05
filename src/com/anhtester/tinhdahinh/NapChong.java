package com.anhtester.tinhdahinh;

public class NapChong {

    //Khai báo nhiều hàm tên giống nhau NHƯNG phải khác nhau về tham số

    public void getInfo() {
        System.out.println("Hàm getInfo không có tham số");
    }

    public void getInfo(String name) {
        System.out.println("Name: " + name);
        System.out.println("Address: Hà Nội");
    }

    public void getInfo(String name, String address) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public void getInfo(String name, int address) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public void login(String url, String email, String password) {
        //Login bình thường
    }

    public void login(String url, String email, String password, String role) {
        //Kiểm tra account đó thuộc role nào
    }

    public void login(String url, String email, String password, String role, String message) {
        //Kiểm tra account đó thuộc role nào
        //Kiểm tra text của message sau khi login (message của pass và fail)
    }

    public static void main(String[] args) {
        NapChong napChong = new NapChong();
        napChong.getInfo();
    }

}
