package com.anhtester.thongtin;

import com.anhtester.phamvitruycap.Employee;

public class ThongTinNhanVien extends Employee{

    public void XuLyPhatLuong(){
        getInfoProtected();

    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
