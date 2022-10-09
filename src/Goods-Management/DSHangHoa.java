
package DSHH;
import java.io.*;
import java.util.*;
public class DSHangHoa {
    public static int THUC_PHAM=0;
    public static int DIEN_MAY = 1;
    
    private HangHoa ds[];
    private int sl;
    
    public DSHangHoa(){
       ds = new HangHoa[50];
       sl =0;
    }
    public void ThemHH(HangHoa h){
        ds[sl]=h;
        sl++;
    }
    public void xuatDStheoloai(byte loai){
        if(loai ==DSHangHoa.DIEN_MAY){
            
            for(HangHoa hh : this.ds){
                if(hh instanceof HangDM){
                    hh.xuat();
                }
              }
           }
        else{
            for(HangHoa hh : this.ds){
                if(hh instanceof HangTP){
                    hh.xuat();
                }       
        
            }
        }
    }
}
