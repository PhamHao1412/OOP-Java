
package Buoi4;



import java.util.Scanner;

class HocVien extends ConNguoi {

    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
        super();
        diem1 = 0;
        diem2 = 0;
        diem3 = 0;
    }

    public HocVien(String ten, int nam, float diem1, float diem2, float diem3) {
        super(ten, nam);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập điểm thứ nhất : ");
        diem1 = sc.nextFloat();
        System.out.print("Nhập điểm thứ hai : ");
        diem2 = sc.nextFloat();
        System.out.print("Nhập điểm thứ ba : ");
        diem3 = sc.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\nĐiểm thứ nhất : " + diem1);
        System.out.print("\nĐiểm thứ hai : " + diem2);
        System.out.print("\nĐiểm thứ ba : " + diem3);
    }
}
