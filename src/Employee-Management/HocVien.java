package javacode.test;


import java.util.Scanner;


public class HocVien extends ConNguoi{


    private float diem1;
    private float diem2;
    private float diem3;
    
    public HocVien(){
       diem1=0;
       diem2=0;
       diem3=0;
    }
        public HocVien(String hoten,int namsinh,float diem1, float diem2, float diem3) {
        super(hoten,namsinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    @Override
      public void nhap(){
          super.nhap();
          Scanner x = new Scanner(System.in);
          System.out.print("Nhập điểm thứ 1: ");
          diem1=x.nextFloat();
          System.out.print("Nhập điểm thứ 2: ");
          diem2=x.nextFloat();
          System.out.print("Nhập điểm thứ 2: ");
          diem3=x.nextFloat();
          
      }  
    @Override
      public void xuat(){
          super.xuat();
          System.out.print("\nĐiểm thứ 1: " + diem1);
          System.out.print("\nĐiểm thứ 2: " + diem2);
          System.out.print("\nĐiểm thứ 3: " + diem3);
      }
}
