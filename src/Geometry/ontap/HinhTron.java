
package ontap;

import java.util.Scanner;


public class HinhTron implements Hinh{
    private float bankinh;

    @Override
    public void nhap() {
        Scanner x =new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        bankinh = x.nextFloat();
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float TinhDienTich() {
        return pi*bankinh*bankinh;
    }
}
