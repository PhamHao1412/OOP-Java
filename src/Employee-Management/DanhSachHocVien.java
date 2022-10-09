package javacode.test;


import java.util.Scanner;


 class DanhSachHocVien {
    private HocVien hv[];
    private int n;
    
    public DanhSachHocVien(){
        
        hv = new HocVien[50];
        n=0;
    }
     public DanhSachHocVien(HocVien[] hv, int n) {
        this.hv = hv;
        this.n = n;
    }
     public void ThemHV(HocVien h){
         hv[n] = h;
         n++;
         
     }
     public void xuat(){
         for(int i=0;i<n;i++){
             hv[i].xuat();
         }
     }
    
}
