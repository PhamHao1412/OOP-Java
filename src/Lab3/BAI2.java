
package Buoi3;
import java.io.*;
import java.util.*;

class BAI2 {

    public static void main(String args[]) {
        byte chon, loai;
        Scanner doc = new Scanner(System.in);
        DSHangHoa dshh = new DSHangHoa();
        HangHoa h;
        do {
            System.out.println("1 . Them mot mat hang vao danh sach");
            System.out.println("2 . Xuat mat hang theo loai");
            System.out.println("0 . Thoat ");
            System.out.println("Chon chuc nang : ");
            chon = doc.nextByte();
            switch (chon) {
                case 1:
                    System.out.println("1 : Hang dien may \n2 : Hang thuc pham . \nHay chon loai mat hang :");
                    loai = doc.nextByte();
                    if (loai == 1) {
                        h = new HangDM();
                    } else {
                        h = new HangTP();
                    }
                    h.nhapHangHoa();
                    dshh.themMH(h);
                    break;
                case 2:
                    System.out.println("Xuat danh sach mat hang nao (DM(1)/TP(2)):");
                    loai = doc.nextByte();
                    dshh.xuatDSTheoLoai(loai);
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);

    }
}

