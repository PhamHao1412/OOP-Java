
package Buoi4;

    class DanhSachHocVien {

    private HocVien hv[];
    private int sl;

    public DanhSachHocVien() {
        hv = new HocVien[50];
        sl = 0;
    }

    public DanhSachHocVien(HocVien[] hv, int sl) {
        this.hv = hv;
        this.sl = sl;
    }

    public void themHV(HocVien h) {
        hv[sl] = h;
        sl++;
    }

    public void xuat() {
        for (int i = 0; i < sl; i++) {
            hv[i].xuat();
        }
    }

}

