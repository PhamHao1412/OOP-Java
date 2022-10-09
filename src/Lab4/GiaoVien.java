package Buoi4;

import java.util.Date;
import java.util.Scanner;
class GiaoVien extends NhanVienclCao{
    private int thulaogd;
    public GiaoVien(){
        
        thulaogd=0;
    }
    public GiaoVien(int thulaogd,int trinhdo,String nganh,String noidaotao,int luong,Date ngaynhanviec,PhongBanKhoa Pbk,String hoten,int namsinh){
        
    
            super(trinhdo,nganh,noidaotao,luong,ngaynhanviec,Pbk,hoten,namsinh);
            this.thulaogd= thulaogd;
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
        System.out.print("\n Thù lao giảng dạy: " + thulaogd);
        
    }
    
}



