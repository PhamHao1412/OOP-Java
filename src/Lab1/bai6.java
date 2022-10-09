
package Buoi1;
import java.io.*;
import java.util.*;
class Mang{
    private int a[];
    private int sopt;
    private int size;
  
    public Mang(){
}
    public int getSoPT(){
        return sopt;
    }
    public void setSoPT(int newSoPT){
        sopt=newSoPT;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int newSize){
        size=newSize;
    }
    
    
    public void Input(){
        Scanner x = new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang: ");
        sopt=x.nextInt();
        a = new int[sopt];
        for(int i=0;i<sopt;i++){
            System.out.printf("a[%d]= ",i);
            a[i]=x.nextInt();
        }
        
        
    }
    public void Output(){
        System.out.printf("\nXuat mang: ");
        for(int i=0;i<sopt;i++){
        System.out.printf(a[i] + " ");
        }
    }
    public void TTB(){
        float tong=0;
        int dem=0;
        for(int i=0;i<sopt;i++){
            if(a[i]%2!=0){
                tong=tong+a[i];
                dem++;
            }
            
        }
        float tb=tong/dem;
        System.out.printf("\nTri trung binh cac so le cua mang: "+tb);
    }
    public void Max(){
        int max=a[0];
        for(int i=0;i<sopt;i++){
            if(max<a[i]){
                max=a[i];
            }
            
        }
        System.out.printf("\nPhan tu lon nhat trong mang: "+max);
    }
    public void SapXep(){
        System.out.printf("\nMang theo thu tu tang dan: ");
        for(int i=0;i<sopt;i++){
            for(int j=i+1;j<sopt;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<sopt;i++){
            System.out.printf(a[i]+" ");
        }
    }
}





public class bai6 {
    public static void main(String[] args) {
        Mang mang = new Mang();
        mang.Input();
        mang.Output();
        mang.TTB();
        mang.Max();
        mang.SapXep();
    }
}
