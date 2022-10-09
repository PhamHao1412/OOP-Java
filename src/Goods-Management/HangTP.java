
package DSHH;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HangTP extends HangHoa{
    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private Date ngaysanxuat;
    private Date ngayhethandung;
    public HangTP(){
        super();
        ngaysanxuat= new Date();
        ngayhethandung = new Date();
    }
     public HangTP(Date ngaysanxuat, Date ngayhethandung, String mahang, String tenhang, long dongia) {
        super(mahang, tenhang, dongia);
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethandung = ngayhethandung;
        }
    @Override
     public void nhap(){
         System.out.print("\n---------HANG THUC PHAM-----------\n");
         Scanner x =new Scanner(System.in);
          super.nhap();
         SimpleDateFormat df = new SimpleDateFormat(HangTP.DATE_FORMAT);
         System.out.print("Ngày sản xuất("+ HangTP.DATE_FORMAT +"):");      
         try{
             ngaysanxuat = df.parse(x.nextLine());
             
         }catch (ParseException ex ){
             Logger.getLogger(HangTP.class.getName()).log(Level.SEVERE,null,ex);
         }
         System.out.print("Ngày hết hạn dùng("+ HangTP.DATE_FORMAT +"):");
         try{
            
             ngayhethandung = df.parse(x.nextLine());
         }catch (ParseException ex ){
             Logger.getLogger(HangTP.class.getName()).log(Level.SEVERE,null,ex);
         }
     }
    @Override
     public void xuat(){
         super.xuat();
         SimpleDateFormat df = new SimpleDateFormat(HangTP.DATE_FORMAT);
         System.out.print("\nNgày sản xuất: " + df.format(ngaysanxuat));
         System.out.print("\nNgày hết hạng dùng: " + df.format(ngayhethandung));
         
     }
}
