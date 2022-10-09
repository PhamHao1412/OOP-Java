package javacode.test;


public class DanhSachNVQL {
    private NVQuanLy nvql[];
    private int n;
    
    public DanhSachNVQL(){
        
        nvql = new NVQuanLy[50];
        n=0;
    }
      public DanhSachNVQL(NVQuanLy[] nvql, int n) {
        this.nvql = nvql;
        this.n = n;
    }
      public void ThemNVQL(NVQuanLy ql){
          nvql[n]=ql;
          n++;
          
      }
      public void xuat(){
          for(int i=0;i<n;i++){
              nvql[i].xuat();
          }
      }
    
}
