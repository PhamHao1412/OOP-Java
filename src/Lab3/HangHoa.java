
package Buoi3;

import java.io.*;
import java.util.*;

class HangHoa {

    private String maHang;
    private String tenHang;
    private long donGia;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public HangHoa() {
        maHang = "";
        tenHang = "";
        donGia = 0;
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void nhapHangHoa() {
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ma hang :");
        maHang = x.nextLine();
        System.out.println("Nhap ten hang :");
        tenHang = x.nextLine();
        System.out.println("Nhap don gia :");
        donGia = x.nextInt();
    }

    public void xuatHangHoa() {
        System.out.println("Ma hang : " + maHang);
        System.out.println("Ten hang : " + tenHang);
        System.out.println("Don gia : " + donGia);
    }
}
