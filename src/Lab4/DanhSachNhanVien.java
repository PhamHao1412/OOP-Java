package Buoi4;

class DanhSachNhanVien {

    private NhanVien nv[];
    private int sl;

    public DanhSachNhanVien() {
        nv = new NhanVien[50];
        sl = 0;
    }

    public DanhSachNhanVien(NhanVien[] nv, int sl) {
        this.nv = nv;
        this.sl = sl;
    }

    public void themNV(NhanVien n) {
        nv[sl] = n;
        sl++;
    }

    public void xuat() {
        for (int i = 0; i < sl; i++) {
            nv[i].xuat();
        }
    }

}