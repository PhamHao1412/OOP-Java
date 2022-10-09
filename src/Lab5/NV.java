
package Buoi5;
import java.util.Scanner;
 abstract class NV {

   protected int manv;
    protected String tennv;
    protected String trinhdo;
    protected int luongcb;
    int temp;
    
    public NV(){
        manv=0;
        tennv="";
        trinhdo="";
        luongcb=0;
        
    }
    
    public NV(int manv, String tennv, String trinhdo, int luongcb) {
        this.manv = manv;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
        this.luongcb = luongcb;
    }
    
  
    public int getManv() {
        return manv;
    }

   
    public void setManv(int manv) {
        this.manv = manv;
    }

   
    public String getTennv() {
        return tennv;
    }

 
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }


    public String getTrinhdo() {
        return trinhdo;
    }

 
    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

   
    public int getLuongcb() {
        return luongcb;
    }

    
    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }
    public void nhap(){
        Scanner x =new Scanner(System.in);
        System.out.print("Nhập mã: ");
        manv = x.nextInt();
        x.nextLine();
        System.out.print("Nhập họ tên: ");
        tennv = x.nextLine();
        System.out.print("Nhập trình độ: ");
        trinhdo = x.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongcb = x.nextInt();
        
        
    }
    public void xuat(){
        System.out.print("\nMã: " + manv);
        System.out.print("\nHọ tên: " + tennv);
        System.out.print("\nTrình độ: " + trinhdo);
        System.out.print("\nLương cơ bản: " + luongcb);
        
        
    }
    public abstract  float TinhLuong();
        
    }
    
    

    

