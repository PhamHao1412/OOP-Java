package javacode.test;


import java.util.Scanner;


public class Cau2 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    DanhSachHocVien dshv = new DanhSachHocVien();
    DanhSachNhanVien dsnv = new DanhSachNhanVien();
    int chon;
    do{
        System.out.print("\n1 . Nhập 1 học viên ");
        System.out.print("\n2 . Nhập 1 nhân viên ");
        System.out.print("\n3 . Xuất thông tin học viên ");
        System.out.print("\n4 . Xuất thông tin nhân viên ");
        System.out.print("\n5 . Thoát ");
        System.out.print("\nChọn chức năng: ");
        chon=x.nextInt();
        switch(chon){
            case 1 : 
                HocVien hv = new HocVien();
                hv.nhap();
                dshv.ThemHV(hv);
                break;
            case 2 : 
                NhanVien nv = new NhanVien();
                nv.nhap();
                dsnv.ThemNV(nv);
                break;
            case 3 :
                dshv.xuat();
                break;
            case 4 :
                dsnv.xuat();
                break;
            default : 
                chon = 5;
                break;
        }
    }while(chon!=5);
    }
    
}
