
package Buoi5;

import java.util.Scanner;

public class NVQL extends NV{
    private String chuyenmon;
    private int phucapcv;
    
    public NVQL(){
        super();
        chuyenmon ="";
        phucapcv=0;
    }
    
    public NVQL(String chuyenmon, int phucapcv, int manv, String tennv, String trinhdo, int luongcb) {
        super(manv, tennv, trinhdo, luongcb);
        this.chuyenmon = chuyenmon;
        this.phucapcv = phucapcv;
    }
 
    @Override
    public void nhap(){
       super.nhap();
       Scanner x = new Scanner(System.in);
       System.out.print("Nhập chuyên môn: ");
       chuyenmon=x.nextLine();
       System.out.print("Nhập phụ cấp chức vụ: ");
       phucapcv=x.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("\nChuyên môn: " + chuyenmon);
        System.out.print("\nPhụ cấp chức vụ: " + phucapcv);
    }
    @Override
   public float TinhLuong(){
        
        return super.luongcb + phucapcv;
    }
}
