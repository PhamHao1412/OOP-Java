
package Buoi3;
import java.io.*;
import java.util.*;

class HangDM extends HangHoa {

    private int thoigianbh;
    private int dienap;
    private int congsuat;

    public HangDM() {
        super();
        thoigianbh = 0;
        dienap = 0;
        congsuat = 0;
    }

    public HangDM(String mh, String th, long dg, int tg, int da, int cs) {
        super(mh, th, dg);
        thoigianbh = tg;
        dienap = da;
        congsuat = cs;
    }

    @Override
    public void nhapHangHoa() {
        System.out.println("----------HANG DIEN MAY-----------");
        super.nhapHangHoa();
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh :");
        thoigianbh = x.nextInt();
        System.out.println("Nhap dien ap :");
        dienap = x.nextInt();
        System.out.println("Nhap cong suat : ");
        congsuat = x.nextInt();
    }

    @Override
    public void xuatHangHoa() {
        super.xuatHangHoa();
        System.out.println("Thoi gian bao hanh : " + thoigianbh);
        System.out.println("Dien ap : " + dienap);
        System.out.println("Cong suat : " + congsuat);
    }
}

