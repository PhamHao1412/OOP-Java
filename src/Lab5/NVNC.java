
package Buoi5;

import java.util.Scanner;

public class NVNC extends NV{
    private String chuyenmon;
    private int phucapdh;
    
    public NVNC(){
        super();
        chuyenmon ="";
        phucapdh=0;
    }
    
    public NVNC(String chuyenmon, int phucapdh, int manv, String tennv, String trinhdo, int luongcb) {
        super(manv, tennv, trinhdo, luongcb);
        this.chuyenmon = chuyenmon;
        this.phucapdh = phucapdh;
    }

    @Override
    public void nhap(){
       super.nhap();
       Scanner x = new Scanner(System.in);
       System.out.print("Nhập chuyên môn: ");
       chuyenmon=x.nextLine();
       System.out.print("Nhập phụ cấp độc hại: ");
       phucapdh=x.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("\nChuyên môn: " + chuyenmon);
        System.out.print("\nPhụ cấp độc hại: " + phucapdh);
    }
    @Override
    public float TinhLuong(){
        return super.luongcb+phucapdh;
    }
}

