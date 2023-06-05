package com.anhtester.tinhtruutuong;

abstract class Person {

    protected String ten;
    protected int tuoi;
    protected String cmnd;

    //Anh Tester
    abstract public void showInfo(); //Hển thị thông tin một người cơ bản
    abstract public String getTen();
    abstract public String getCmnd();
    abstract public int getTuoi();
    //abstract public String getGioiTinh();
    abstract public String getTrinhDo();
}
