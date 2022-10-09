
package ontap;

import java.util.Scanner;


public class HinhChuNhat implements Hinh {
    
    private float dai;
    private float rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    @Override
    public void nhap() {
       Scanner x  = new Scanner(System.in);
       System.out.print("Nhập chiều dài: ");
       dai=x.nextFloat();
       System.out.print("Nhập chiều rộng: ");
       rong=x.nextFloat();
       
    }

    @Override
    public void xuat() {
        
    }
    @Override
    public float TinhDienTich() {
       return dai*rong;
    }
    
}
