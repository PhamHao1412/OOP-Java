
package Buoi4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class NhanVien extends ConNguoi {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private int luong;
    private Date ngaynhanviec;
    private PhongBanKhoa pbk;

    public NhanVien() {
        super();
        luong = 0;
        ngaynhanviec = new Date();
        pbk = new PhongBanKhoa();
    }

    public NhanVien(int luong, Date ngaynhanviec, PhongBanKhoa Pbk, String hoten, int namsinh) {
        super(hoten, namsinh);
        this.luong = luong;
        this.ngaynhanviec = ngaynhanviec;
        this.pbk = Pbk;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương : ");
        luong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập ngày nhận việc (" + NhanVien.DATE_FORMAT + "):");
        SimpleDateFormat df = new SimpleDateFormat(NhanVien.DATE_FORMAT);
        try {
            ngaynhanviec = df.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        pbk.nhap();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("\nLương : "+luong);
        SimpleDateFormat df = new SimpleDateFormat(NhanVien.DATE_FORMAT);
        System.out.print("\nNgày nhận việc : "+ df.format(ngaynhanviec));
        pbk.xuat();
    }        
}