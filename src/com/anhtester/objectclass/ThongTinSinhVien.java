package com.anhtester.objectclass;

public class ThongTinSinhVien {
    public static void main(String[] args) {

        //Khai báo đối tượng class để truy xuất thông tin trong một class
        SinhVien sv1 = new SinhVien(); //tương ứng với hàm xây dựng ko có tham số

        //Gọi thành phần trong class thông qua đối tượng
        System.out.println(sv1.getName());
        System.out.println(sv1.getAge());
        System.out.println(sv1.getAddress());
        System.out.println(sv1.getClassName());

        //Khởi tạo đối tượng cho class SinhVien nhưng với cấu trúc hàm xây dựng có tham số
        SinhVien sv2 = new SinhVien("Huyền", 30, "Hà Nội", "Java OOP");
        System.out.println("================");
        System.out.println(sv2.getName());
        System.out.println(sv2.getAge());
        System.out.println(sv2.getAddress());
        System.out.println(sv2.getClassName());

        SinhVien sv3 = new SinhVien("Lan Anh", 40, "Hà Nội", "Java OOP");
        System.out.println("================");
        System.out.println(sv3.getName());
        System.out.println(sv3.getAge());
        System.out.println(sv3.getAddress());
        System.out.println(sv3.getClassName());

        //Truy xuất thông tin class thông qua khởi tạo đối tượng Annonymous (không có tên đối tượng)
        System.out.println("================");
        System.out.println(new SinhVien().getName());
        System.out.println(new SinhVien().getAddress());
    }
}
