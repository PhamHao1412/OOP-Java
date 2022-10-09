
package Buoi4;

import java.util.Scanner;


public class Cau3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        DanhSachHocVien dshv = new DanhSachHocVien();
        DanhSachNVQL dsnvql = new DanhSachNVQL();
        DanhsachGV dsgv = new DanhsachGV();
        int chon;
        do{
             System.out.print("\n1 . Nhập 1 học viên ");
             System.out.print("\n2 . Nhập 1 nhân viên quản lý ");
             System.out.print("\n3 . Nhập 1 giáo viên ");
             System.out.print("\n4 . Xuất thông tin danh sách học viên ");
             System.out.print("\n5 . Xuất thông tin danh sách nhân viên quản lý ");
             System.out.print("\n6 . Xuất thông tin danh sách giáo viên  ");
             System.out.print("\n0 . Thoát");
             System.out.print("\nChọn chức năng: ");
             chon =x.nextInt();
             switch (chon){
                 case 1 : 
                     HocVien hv = new HocVien();
                     hv.nhap();
                     dshv.themHV(hv);
                     break;
                 case 2 :
                     NVQuanLy nvql = new NVQuanLy();
                     nvql.nhap();
                     dsnvql.themNVQL(nvql);
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
                     chon =0;
                     break;
             }
        }while(chon!=0);
        
    }
}
