package javacode.test;

import java.util.Date;
import java.util.Scanner;
public class GiaoVien extends NhanVienclCao{
     private int thulaogd ;
   
    public GiaoVien(){
        
        thulaogd =0;
    }
     public GiaoVien(int thulaogd) {
        this.thulaogd = thulaogd;
    }

    public GiaoVien(int thulaogd, int trinhdo, String nganh, String noidaotao, String hoten, int namsinh, int luong, PhongBanKhoa Pbk, Date ngaynhanviec) {
        super(trinhdo, nganh, noidaotao, hoten, namsinh, luong, Pbk, ngaynhanviec);
        this.thulaogd = thulaogd;
    }
     @Override
    public void nhap(){
        super.nhap();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập thù lao giảng dạy: ");
        thulaogd = x.nextInt();
        
        
    }
     @Override
    public void xuat(){
        super.xuat();
        System.out.print("\nThù lao giảng dạy: " + thulaogd);
    }
    
    
}
