package javacode.test;

import java.util.Date;
import java.util.Scanner;
public class NVQuanLy extends NhanVienclCao{

    private int phucapcv;
    
    public NVQuanLy(){
        phucapcv=0;
    }
    public NVQuanLy(int phucapcv) {
        this.phucapcv = phucapcv;
    }

    public NVQuanLy(int phucapcv, int trinhdo, String nganh, String noidaotao, String hoten, int namsinh, int luong, PhongBanKhoa Pbk, Date ngaynhanviec) {
        super(trinhdo, nganh, noidaotao, hoten, namsinh, luong, Pbk, ngaynhanviec);
        this.phucapcv = phucapcv;
    }
    @Override
    public void nhap(){
     super.nhap();
     Scanner x = new Scanner(System.in);
     System.out.print("Nhập phụ cấp công việc: ");
     phucapcv = x.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("\nPhụ cấp công việc: " + phucapcv);  
    }
}
