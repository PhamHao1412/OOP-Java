
package Buoi4;

import java.util.Date;
import java.util.Scanner;
public class NVQuanLy extends NhanVienclCao{
    private int phucapcv;
    
    public NVQuanLy(){
        
        phucapcv = 0;
    }
    public NVQuanLy(int phucapcv,int trinhdo,String nganh,String noidaotao,int luong,Date ngaynhanviec,PhongBanKhoa Pbk,String hoten,int namsinh ){
        super(trinhdo,nganh,noidaotao,luong,ngaynhanviec,Pbk,hoten,namsinh);
        this.phucapcv= phucapcv;
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
