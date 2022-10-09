
package Buoi4;
import java.util.Scanner;

class PhongBanKhoa {
    
    private int ma;
    private String ten;
    
    public PhongBanKhoa() {
        ma = 0;
        ten = "";
    }
    
    public PhongBanKhoa(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public int getMa() {
        return ma;
    }
    
    public void setMa(int ma) {
        this.ma = ma;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng ban : ");
        ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên phòng ban : ");
        ten = sc.nextLine();
    }
    
    public void xuat() {
        System.out.print("\nMã phòng ban : " + ma);
        System.out.print("\nTên phòng ban : " + ten);
    }
    
}
