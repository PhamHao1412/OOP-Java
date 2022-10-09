/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;
import java.util.Scanner;
class HOCSINH{
    
        int Mssv;
        String Hoten;
        float Diemtb;
        
        public int getmssv(){
            return Mssv;
            
        }
        public void setmssv(int ms){
            
            Mssv=ms;
        }
        public String getHoten(){
            return Hoten;
        }
        public void setHoten(String ht){
            
            Hoten=ht;
        }
        public float getDiemtb(){
            return Diemtb;
        }
        public void setDiemtb(float dtb){
            Diemtb=dtb;
        }
    
        public void Input(){
            Scanner x = new Scanner(System.in);
            System.out.print("Nhap ma so sinh vien: ");
             Mssv = x.nextInt();
           
           
             Scanner y = new Scanner(System.in);
            System.out.print("Nhap ho ten sinh vien: ");
             Hoten = y.nextLine();
             System.out.print("Nhap diem trung binh: ");
            Diemtb = x.nextFloat();
            
            
        }
         public void Output(){
        System.out.println("Ma so sinh vien: "+ Mssv);
        System.out.println("Ho ten sinh vien : "+ Hoten);
        System.out.println("Diem trung binh : "+ Diemtb);
       
    }
         public void rank(){
             if(Diemtb<5){
                 System.out.println("Xep loai yeu");
             }
             else{
                 if(Diemtb>5&&Diemtb<7)
                     System.out.println("Xep loai trung binh");
                 else
                       System.out.println("Xep loai Gioi");
             }
         }
    
}
public class demo1 {
        public static void main(String[] args) {
         HOCSINH hs = new HOCSINH();
         hs.Input();
         hs.Output();
         hs.rank();
        System.out.println("Ho ten hoc sinh vua nhap: " + hs.getHoten());
        String htmoi = " Le Quang Duy";
         System.out.println("Ho ten sinh sau khi sua:" + htmoi);
        
    }
}
