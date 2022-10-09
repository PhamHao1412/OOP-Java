package javacode.test;

import java.util.Scanner;
public class Cau3 {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        DanhSachHocVien dshv = new DanhSachHocVien();
        DanhSachGV dsgv = new DanhSachGV();
        DanhSachNVQL dsnvql = new DanhSachNVQL();
        int chon;
        do{
            System.out.print("\n1 . Nhập 1 học viên ");
            System.out.print("\n2 . Nhập 1 nhân viên quản lý ");
            System.out.print("\n3 . Nhập 1 Giáo viên ");
            System.out.print("\n4 . Xuất 1 học viên ");
            System.out.print("\n5 . Xuất 1 nhân viên quản lý ");
            System.out.print("\n6 . Xuất 1 giáo viên ");
            System.out.print("\n0 . Thoát ");
            System.out.print("\nChọn chức năng:  ");
            chon =x.nextInt();
            switch(chon){
                case 1 : 
                    HocVien hv = new HocVien();
                    hv.nhap();
                    dshv.ThemHV(hv);
                    break;
                case 2 :
                    NVQuanLy nvql = new NVQuanLy();
                    nvql.nhap();
                    dsnvql.ThemNVQL(nvql);
                    break;
                case 3 :
                     GiaoVien gv = new GiaoVien();
                     gv.nhap();
                     dsgv.ThemGV(gv);
                     break;
               
                case 4 :
                    dshv.xuat();
                    break;
                case 5 : 
                    dsnvql.xuat();
                    break;
                case 6 :
                     dsgv.xuat();
                     break;
                
                default :
                    chon = 0;
            }
        }while(chon!=0);
        
    }
}
