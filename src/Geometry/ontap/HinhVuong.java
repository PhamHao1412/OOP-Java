
package ontap;

import java.util.Scanner;

public class HinhVuong implements Hinh {

    
    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
    private float canh;
    @Override
    public void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        canh = x.nextFloat();
        
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float TinhDienTich() {
       return canh*canh;

    }

        
    
    
}
