
package DSHH;
import java.io.*;
import java.util.*;
public class Cau2 {
    public static void main(String[] args) {
       byte chon,loai;
       Scanner x = new Scanner(System.in);
       DSHangHoa dshh = new DSHangHoa();
       HangHoa h;
       do{
            System.out.print("\n1 . Them mot mat hang vao danh sach");
            System.out.print("\n2 . Xuat mat hang theo loai");
            System.out.print("\n0 . Thoat ");
            System.out.print("\nChon chuc nang : ");
            chon = x.nextByte();
            switch(chon){
                case 1 :
                 System.out.print("\n1 : Hang dien may \n2 : Hang thuc pham . \nHay chon loai mat hang :");
                    loai = x.nextByte();
                    if(loai==1){
                        h = new HangDM();
                        
                    }else{
                        h = new HangTP();
                    }
                    h.nhap();
                    dshh.ThemHH(h);
                    break;
                case 2 :
                    System.out.println("Xuat danh sach mat hang nao (DM(1)/TP(2)):");
                    loai = x.nextByte();
                    dshh.xuatDStheoloai(loai);
                    break;
                default :
                    chon =0;
                    break;
            }
        }while(chon!=0);
    }
}

