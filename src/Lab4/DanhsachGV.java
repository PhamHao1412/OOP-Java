
package Buoi4;

public class DanhsachGV {

    private GiaoVien gv[];
    private  int n;       
    
    public DanhsachGV(){
        gv = new GiaoVien[50];
        n = 0;
    }
    
    public DanhsachGV(GiaoVien[] gv, int n) {
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
