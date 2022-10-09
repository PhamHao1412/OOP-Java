
package Buoi2;
import java.util.*;
import java.io.*;
class DSHS{
    private HOCSINH ds[];
    private int n;
    
    public void Nhapds(){
        Scanner x = new Scanner(System.in);
       System.out.print("Nhap so luong sinh vien: ");
       n = x.nextInt();
       
       ds = new HOCSINH[n];    
       for(int i=0;i<n;i++){
        System.out.printf("\nNhap sinh vien thu %d",i+1);
        System.out.printf("\n");
           ds[i]=new HOCSINH();
           ds[i].Input();
         System.out.printf("\n");
       }   
    }
    public void Xuatds(){
        for(int i=0;i<n;i++){
        System.out.printf("\nSinh vien thu %d",i+1);
        System.out.printf("\n");
           ds[i].Output(); 
           
        }
            
        
        
    }
    
   public void SapXep(){
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(ds[i].getDiemtb()>ds[j].getDiemtb()){
                   HOCSINH temp=ds[i];
                   ds[i]=ds[j];
                   ds[j]=temp;
                   }
             }
        }
   }
 
}
public class bai1 {
    public static void main(String[] args) {
        DSHS danhsach = new DSHS();
        danhsach.Nhapds();
        System.out.print("\n--------THONG TIN SINH VIEN--------\n");
        danhsach.Xuatds();
         System.out.print("\n--------DANH SACH SAU KHI SAP XEP--------\n");
         danhsach.SapXep();
         danhsach.Xuatds();
    }
}