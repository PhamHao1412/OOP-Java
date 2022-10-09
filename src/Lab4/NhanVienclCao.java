
package Buoi4;
import java.util.Scanner;
import java.util.Date;
class NhanVienclCao extends NhanVien {

    private int trinhdo;
    private String nganh;
    private  String noidaotao;
    
    public NhanVienclCao(){
        trinhdo=0;
        nganh="";
        noidaotao="";
    }
    
    public NhanVienclCao(int trinhdo, String nganh, String noidaotao, int luong, Date ngaynhanviec, PhongBanKhoa Pbk, String hoten, int namsinh){
        super(luong, ngaynhanviec, Pbk, hoten, namsinh);
        this.trinhdo = trinhdo;
        this.nganh = nganh;
        this.noidaotao = noidaotao;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập trình độ: ");
        trinhdo=x.nextInt();
         x.nextLine();
        System.out.print("Nhập ngành: ");
        nganh=x.nextLine();
        System.out.print("Nhập nơi đào tạo: ");
        noidaotao=x.nextLine();
    }
    @Override
      public void xuat(){
        super.xuat();
        System.out.print("\nTrình độ : "+trinhdo);
        System.out.print("\nNhập ngành : "+nganh);
        System.out.print("\nNhập nơi đào tạo : "+noidaotao);
    }

 }
    
    

