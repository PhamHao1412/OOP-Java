package javacode.test;


import java.util.Scanner;


public class PhongBanKhoa {

    

    private int ma;
    private String ten;
    
    public PhongBanKhoa(){
        ma=0;
        ten="";
    }
    
    public PhongBanKhoa(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void nhap(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập mã phòng ban: ");
        ma=x.nextInt();
        x.nextLine();
        System.out.print("Nhập tên phòng ban: ");
        ten=x.nextLine();
        
    }
    public void xuat(){
        System.out.print("\nMã phòng ban: " + ma);
        System.out.print("\nTên phòng ban: " + ten);
        
    }
    
}
