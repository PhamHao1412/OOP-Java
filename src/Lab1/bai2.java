

package Buoi1;
import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        String mssv = x.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        String hoten = x.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        int age = x.nextInt();
        System.out.print("Nhap nam sinh sinh vien: ");
        int ns = x.nextInt();
        System.out.print("Nhap diem trung binh sinh vien: ");
        float dtb = x.nextFloat();
        System.out.println("---------THONG TIN SINH VIEN--------- ");
        System.out.println("Ma  so sinh vien: "+mssv);
        System.out.println("Ho ten sinh vien: "+hoten);
        System.out.println("Tuoi sinh vien: "+age);
        System.out.println("Nam sinh sinh vien: "+ns);
        System.out.println("Diem trung binh: "+dtb);
          
    }
    
}