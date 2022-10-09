
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
public class HangDM extends HangHoa{
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private Date thoigianbh;
    private int dienap;
    private int congsuat;
    
    public HangDM(){
        super();
        thoigianbh = new Date();
        dienap = 0;
        congsuat=0;
    } 
     public HangDM(Date thoigianbh, int dienap, int congsuat, String mahang, String tenhang, long dongia) {
        super(mahang, tenhang, dongia);
        this.thoigianbh = thoigianbh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }
    @Override
     public void nhap(){
         
         System.out.print("\n---------HÀNG ĐIỆN MÁY------------\n");
         Scanner x = new Scanner(System.in);
         super.nhap();
            System.out.print("Nhập điện áp: ");
         dienap= x.nextInt();
         System.out.print("Nhập công suất: ");
         congsuat= x.nextInt();   
         x.nextLine();
         System.out.print("Nhập thời gian bảo hành("+ HangDM.DATE_FORMAT+"):");
          SimpleDateFormat df = new SimpleDateFormat(HangDM.DATE_FORMAT);
         try{
             thoigianbh = df.parse(x.nextLine());
         }catch (ParseException ex ){
             Logger.getLogger(HangTP.class.getName()).log(Level.SEVERE,null,ex);
         }
      
     }
     public void xuat(){
         super.xuat();
         SimpleDateFormat df = new SimpleDateFormat(HangDM.DATE_FORMAT);
         System.out.print("\nThời gian bảo hành: "+df.format(thoigianbh));
         System.out.print("\nĐiện áp: "+ dienap);
         System.out.print("\nCông suất: "+congsuat);
     }
    
}
