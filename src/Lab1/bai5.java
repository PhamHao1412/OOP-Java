
package Buoi1;

import java.util.Scanner;

class HOCSINH{
    int Maso;
    String Hoten;
    float Diemtb;
    public int getMaso() {
    return Maso;
    }
    public void setMaso(int ms){
        Maso=ms;
    }
    public String getHoten() {
    return Hoten;
    }
    public void setHoten(String ht){
        Hoten=ht;
    }
    public float getDiemtb() {
    return Diemtb;
    }
    public void setDiemtb(float dtb){
        Diemtb=dtb;
    }
   
    public void Input() {
    Scanner x = new Scanner(System.in);
        System.out.print("Nhap mssv: ");
        Maso = x.nextInt();
        System.out.print("Nhap diem trung binh : ");
        Diemtb = x.nextFloat();
    Scanner y = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        Hoten = y.nextLine();
        
    }
    public void Output(){
        System.out.println("MSSV: "+ Maso);
        System.out.println("Diem trung binh : "+ Diemtb);
        System.out.println("Ho ten sinh vien : "+ Hoten);
    }
 
    public void rank(){
        if(Diemtb<5){
            System.out.println("Xep loai yeu");
        }
        else 
            if(Diemtb>5&&Diemtb<7){
                System.out.println("Xep loai trung binh");
            }
            else
                System.out.println("Xep loai gioi");
    }
    
}
public class bai5 {
      public static void main(String[] args) {
        HOCSINH hs =new HOCSINH();
        hs.Input();
        hs.Output();
        hs.rank();
        System.out.println("Ho ten hoc sinh vua nhap: "+ hs.getHoten());
        String htmoi="Pham Anh Hao";
        hs.setHoten(htmoi);
        System.out.println("Ho ten hoc sinh sau khi sua:  "+ hs.getHoten());
    }
    
}



