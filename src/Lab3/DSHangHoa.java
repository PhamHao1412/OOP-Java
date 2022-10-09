/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;
import java.io.*;
import java.util.*;

class DSHangHoa {

    public static int THUC_PHAM = 0;
    public static int DIEN_MAY = 1;
    
    private HangHoa ds[];
    private int sl;

    public DSHangHoa() {
        sl = 0;
        ds=new HangHoa[50];
    }

    public void themMH(HangHoa h) {
        ds[sl]=h;
        sl++;
    }

    public void xuatDSTheoLoai(byte loai) {
        if(loai == DSHangHoa.DIEN_MAY){
//            for(int i = 0; i<sl ;i++){
//                if (ds[i] instanceof HangDM ) {
//                    ds[i].xuatHangHoa();
//                }
//            }
            for (HangHoa hh : this.ds) {
                if (hh instanceof HangDM) {
                    hh.xuatHangHoa();
                }
            }
        }
        else{
//            for(int i = 0; i<sl ;i++){
//                if (ds[i] instanceof HangTP ) {
//                    ds[i].xuatHangHoa();
//                }
//            }
            for (HangHoa hh : this.ds) {
                if (hh instanceof HangTP) {
                    hh.xuatHangHoa();
                }
            }
        }
    }
}
