package javacode.test;


 class DanhSachNhanVien {

    private NhanVien nv[];
    private int n;
    
    public DanhSachNhanVien(){
        
        nv = new NhanVien[50];
        n=0;
    }
    
    public DanhSachNhanVien(NhanVien[] nv, int n) {
        this.nv = nv;
        this.n = n;
    }
    public void ThemNV(NhanVien v){
        nv[n]=v;
        n++;
    }
    public void xuat(){
        for(int i=0;i<n;i++){
            nv[i].xuat();
        }
    }
    
}
