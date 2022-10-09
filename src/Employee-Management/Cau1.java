package javacode.test;


import java.util.Scanner;


public class Cau1 {
    public static void main(String[] args) {
    HocVien hv = new HocVien();
    System.out.println("Học viên ");
    hv.nhap();
    hv.xuat();
    NhanVien nv = new NhanVien();
    System.out.println("\nNhân viên ");
    nv.nhap();
    nv.xuat();

    
    }
}
