
package Buoi3;
import java.util.Scanner;

class HangTP extends HangHoa {

    private int ngaysanxuat;
    private int ngayhethandung;

    public HangTP() {
        super();
        ngaysanxuat = 0;
        ngayhethandung = 0;
    }

    public HangTP(String mh, String th, long dg, int ngaysx, int ngayhhd) {
        super(mh, th, dg);
        ngaysanxuat = ngaysx;
        ngayhethandung = ngayhhd;
    }

    @Override
    public void nhapHangHoa() {
        System.out.println("----------HANG THUC PHAM-----------");
        Scanner x = new Scanner(System.in);
        super.nhapHangHoa();
        System.out.println("Nhap ngay san xuat :");
        ngaysanxuat = x.nextInt();
        System.out.println("Nhap ngay het han dung : ");
        ngayhethandung = x.nextInt();
    }

    @Override
    public void xuatHangHoa() {
        super.xuatHangHoa();
        System.out.println("Ngay san xuat : " + ngaysanxuat);
        System.out.println("Ngay het han dung " + ngayhethandung);
    }
}
