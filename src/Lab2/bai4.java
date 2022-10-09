
package Buoi2;

import java.io.*;
import java.util.*;

class NhanVien {

    private String maso, hoten;
    private int luong;
    private float heso;
    private int soluong;

    public NhanVien() {
        maso = hoten = null;
        luong = soluong = 0;
        heso = 0f;
    }

    public NhanVien(String maso, String hoten, int luong, float heso, int soluong) {
        this.maso = maso;
        this.hoten = hoten;
        this.luong = luong;
        this.heso = heso;
        this.soluong = soluong;
    }

    public NhanVien(NhanVien p) {
        this.maso = p.maso;
        this.hoten = p.hoten;
        this.luong = p.luong;
        this.heso = p.heso;
        this.soluong = p.soluong;
    }

    public void setMaSo(String maso) {
        this.maso = maso;
    }

    public String getMaSo() {
        return maso;
    }

    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }

    public String getHoTen() {
        return hoten;
    }

    public void setHeSo(float heso) {
        this.heso = heso;
    }

    public float getHeSo() {
        return heso;
    }

    public void NhapNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        //sc.nextLine();
        maso = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        //sc.nextLine();
        hoten = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextInt();
        System.out.print("Nhap he so luong: ");
        heso = sc.nextFloat();
        System.out.print("Nhap so luong: ");
        soluong = sc.nextInt();
    }

    public void XuatNV() {
        System.out.println(maso + "\t" + hoten + "\t" + luong + "\t" + heso + "\t" + soluong);
    }

    public float TinhLuong() {
        return (luong * heso);
    }

    public void XuatSoLuong() {
        System.out.println("So luong: " + soluong);
    }
}

class bai4 {

    public static void main(String agrs[]) {
        NhanVien p1 = new NhanVien();
        NhanVien p2 = new NhanVien("0093", "Long", 1000, 0.3f, 5);
        NhanVien p3 = new NhanVien(p2);
        System.out.println("Thong tin khoi tao:");
        p1.XuatNV();
        p2.XuatNV();
        p3.XuatNV();
        System.out.println("-------------------");
        System.out.println("Nhap thong tin cho p1:");
        p1.NhapNV();
        System.out.print("Thong tin cua p1: ");
        p1.XuatNV();
        System.out.println("-------------------");
        System.out.print("Nhap ten NV moi cho p3: ");
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        String tmp = sc.nextLine();
        p3.setHoTen(tmp);
        System.out.print("Thong tin cua p3: ");
        p3.XuatNV();
        System.out.println("-------------------");
        float temp = p1.getHeSo();
        if (temp < p2.getHeSo()) {
            temp = p2.getHeSo();
        }
        if (temp < p3.getHeSo()) {
            temp = p3.getHeSo();
        }
        System.out.println("He so luong cao nhat: " + temp);
    }
}
