package com.anhtester.tinhdahinh;

public class GhiDe extends ActionKeyword {

    //Xảy ra kế thừa class Cha và class Con
    //Hàm của class Con giống với tên hàm của class Cha

    @Override
    public void clickElement() {
        System.out.println("Click on button Login");
    }

    public void login(){
        System.out.println("https://anhtester.com");
        System.out.println("Emai: abc@email.com");
        System.out.println("Password: 13456");
        clickElement();
    }

    public static void main(String[] args) {
        GhiDe ghiDe = new GhiDe();
        ghiDe.login();
    }
}
