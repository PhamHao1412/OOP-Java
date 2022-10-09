package javacode.test;


import java.util.Scanner;


 class ConNguoi {

  
    
    private String hoten;
    private int namsinh;
    
    public ConNguoi(){
        hoten="";
        namsinh=0;   
    }
    public ConNguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void nhap(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoten = x.nextLine();
        System.out.print("Nhập năm sinh: ");
        namsinh = x.nextInt();
        
    }
    public void xuat(){
        System.out.print("\nHọ tên: " + hoten);
        System.out.print("\nNăm sinh: " + namsinh);
        
    }
    
}
