package javacode.test;


public class DanhSachGV {

    private GiaoVien gv[];
    private  int n;       
    
    public DanhSachGV(){
        gv = new GiaoVien[50];
        n = 0;
    }
    
    public DanhSachGV(GiaoVien[] gv, int n) {
        this.gv = gv;
        this.n = n;
    }
    public void ThemGV(GiaoVien g){
        gv[n]=g;
        n++;
    }
    public void xuat(){
        for(int i=0;i<n;i++)
            gv[i].xuat();
    }
    
    
}

