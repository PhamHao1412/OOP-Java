package javacode.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NhanVien extends ConNguoi {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private int luong;
    private PhongBanKhoa Pbk;
    private Date ngaynhanviec;
    
    public NhanVien(){
        super();
        luong =0;
        Pbk = new PhongBanKhoa();
        ngaynhanviec = new Date();
        
    }
      public NhanVien(String hoten,int namsinh,int luong, PhongBanKhoa Pbk, Date ngaynhanviec) {
        super(hoten,namsinh);  
        this.luong = luong;
        this.Pbk = Pbk;
        this.ngaynhanviec = ngaynhanviec;
    }
    @Override
      public void nhap(){
          super.nhap();
          Scanner x = new Scanner(System.in);
          System.out.print("Nhập lương: ");
          luong = x.nextInt();
          x.nextLine();
          System.out.print("Nhập ngày nhận việc(" + NhanVien.DATE_FORMAT + "): ");
          SimpleDateFormat df = new SimpleDateFormat(NhanVien.DATE_FORMAT);
          try{
              ngaynhanviec=df.parse(x.nextLine());
              
          }catch(ParseException ex ){
              Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE,null,ex);
              
          }
          Pbk.nhap();;
      }
    @Override
      public void xuat(){
          super.xuat();
          System.out.print("\nLương: " + luong);
          SimpleDateFormat df = new SimpleDateFormat(NhanVien.DATE_FORMAT);
          System.out.print("\nNgày nhận việc: " + df.format(ngaynhanviec));
          Pbk.xuat();
      }
    
    
    
}
