package com.anhtester.phamvitruycap;

public class Employee {
    //Phạm vi truy cập private

    private String name = "Phương";
    private int age = 30;
    public String company = "Viettel";

    private void getInfoPrivate(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(company);
    }

    //Phạm vi truy cập protected - truy cập sang class khác nhưng phải trong cùng package
    protected void getInfoProtected(){
        System.out.println(name);
        System.out.println(age);
    }

    //Phạm vi truy cập default
    void getInfoDefault(){
        System.out.println("Đây là hàm Default");
    }

    //Phạm vi truy cập public - truy cập được ở mọi nơi (tất cả caác Class trong project này)
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }

    public void getInfoFromPrivateVariable(){
        //private String fullName = "Huyền";
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfoPrivate();
    }

}
