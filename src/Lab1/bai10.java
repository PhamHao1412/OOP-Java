
package Buoi1;
import java.io.*;
import java.util.*;

class PS {
    private int tuso;
    private int mauso;
    
    public PS() {
    } 
    public int getTuSo() {
        return tuso;
    }
    public void setTuSo(int newTuSo) {
        tuso = newTuSo;
    }
    public int getMauSo() {
        return mauso;
    }
    public void setMauSo(int newMauSo) {
        mauso = newMauSo;
    }
       public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.printf("nhap tu so: ");
        tuso = x.nextInt();
        System.out.printf("Nhap mau so: ");
        mauso = x.nextInt();
    }
    
   
    public void Output() {
        System.out.printf("Phan so: %d / %d", tuso, mauso);
    }
    
    
    public float UCLN() {
        float num1 = tuso, num2 = mauso;
        while (num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num2;
    }
    
    
    public void RutGon() {
        float ucln = UCLN();
        float ts = tuso/ucln;
        float ms = mauso/ucln;
        
        if (ms != 1) {
            if (ms < 0){
                ms = ms * (-1);
                ts = ts * (-1);
            }
            System.out.printf("%.1f / %.1f", ts, ms);
        } else {
            System.out.printf("%.1f", ts);
        }
    }
}

public class bai10 {
    public static void main(String[] args) {
        System.out.println("Phan so thu 1:");
        PS ps1 = new PS();
        ps1.Input();
        ps1.Output();

        System.out.println("\n");

        System.out.println("Phan so thu 2:");
        PS ps2 = new PS();
        ps2.Input();
        ps2.Output();
        
        System.out.printf("\n\nPhan so thu 1 sau khi rut gon: ");
        ps1.RutGon();
        System.out.printf("\nPhan so thu 2 sau khi rut gon: ");
        ps2.RutGon();
        
        float ts = (ps1.getTuSo() * ps2.getMauSo()) + (ps1.getMauSo() * ps2.getTuSo());
        float ms = ps1.getMauSo() * ps2.getMauSo();
        System.out.printf("\nTong 2 phan so la: %.1f / %.1f", ts, ms);
    }
}