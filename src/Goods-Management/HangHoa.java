
package DSHH;

import java.io.*;
import java.util.*;

public class HangHoa {

 
    private String mahang;
    private String tenhang;
    private long dongia;
    
    public HangHoa() {
        mahang = "";
        tenhang = "";
        dongia = 0;
    }
    
    public HangHoa(String mahang, String tenhang, long dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
    }
    
    public String getMahang() {
        return mahang;
    }

   
    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

   
    public String getTenhang() {
        return tenhang;
    }


    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

   
    public long getDongia() {
        return dongia;
    }

  
    public void setDongia(long dongia) {
        this.dongia = dongia;
    }
    public void nhap(){
        Scanner x = new Scanner (System.in);
        System.out.print("Nhập mã hàng: ");
        mahang= x.nextLine();
        //x.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenhang= x.nextLine();
        System.out.print("Nhập đơn giá: ");
        dongia= x.nextInt();
        
    }
    public void xuat(){
        System.out.print("\nMã hàng: " + mahang);
        System.out.print("\nTên hàng: " + tenhang);
        System.out.print("\nĐơn giá: " + dongia);
    }
}
