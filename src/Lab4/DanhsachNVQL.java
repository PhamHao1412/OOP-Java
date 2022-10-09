package Buoi4;

class DanhSachNVQL {

    private NVQuanLy nvql[];
    private int sl;

    public DanhSachNVQL() {
        nvql = new NVQuanLy[50];
        sl = 0;
    }

    public DanhSachNVQL(NVQuanLy[] nvql, int sl) {
        this.nvql = nvql;
        this.sl = sl;
    }

    public void themNVQL(NVQuanLy n) {
        nvql[sl] = n;
        sl++;
    }

    public void xuat() {
        for (int i = 0; i < sl; i++) {
            nvql[i].xuat();
        }
    }

}