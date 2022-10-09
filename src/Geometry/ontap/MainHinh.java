
package ontap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MainHinh {
    public static void main(String[] args) {
    int chon;
    Scanner x = new Scanner(System.in);
    ArrayList<Hinh> ds = new ArrayList();
    
       Hinh temp;
    
      
       do{
           System.out.print("\n1 . Nhập 1 hình vuông ");
           System.out.print("\n4 . Nhập 1 hình chữ nhật ");
           System.out.print("\n3 . Nhập 1 hình tròn  ");
           System.out.print("\n4 . Tính Diện tích từng hình  ");
           System.out.print("\n5 . Tìm hình có diện tích lớn nhất  ");
           System.out.print("\n6 . Tìm hình có diện tích nhỏ nhất  ");
            System.out.print("\n6 . Tổng diện tích tất cả các hình  ");
           System.out.print("\n0 . Thoát ");
           System.out.print("\nChọn chức năng: ");
           chon= x.nextInt();
           switch(chon){
               case 1 : 
                   temp = new HinhVuong();
                   temp.nhap();
                   ds.add(temp);
                   break;
               case 2 :   
                temp = new HinhChuNhat();
                   temp.nhap();
                   ds.add(temp);
                   break;
               case 3 :
                  temp = new HinhTron();
                   temp.nhap();
                  ds.add(temp);
                   break;
               case 4 :
                   System.out.print("\n-----Diện tích từng hình-------\n");
                   for(int i=0;i<ds.size();i++){
                       String h = "Hình tròn";
                       if(ds.get(i)instanceof HinhVuong)
                            h="Hình vuông";
                       else if(ds.get(i)instanceof HinhChuNhat)
                            h="Hình chữ nhật";
                       
                       System.out.printf("\n -Hình thứ %d, là hình %s , có diện tích là %f "
                               ,(i+1),h,ds.get(i).TinhDienTich());
                   }
                   break;
               case 5 :
                        float max =0;
                        int vt1=0;
                         String h1="";
                     for(int i=0;i<ds.size();i++){
                         if(ds.get(i).TinhDienTich()>max){
                             max  = ds.get(i).TinhDienTich();
                                vt1 = i;
                               if(ds.get(i)instanceof HinhTron)
                                   h1= " Hình tròn";
                               else if(ds.get(i)instanceof HinhVuong)
                                    h1="Hình vuông";
                               else if(ds.get(i)instanceof HinhChuNhat)
                                    h1="Hình chữ nhật";
                                 }
                        
                             
                     }
                    System.out.printf("\n -Hình thứ %d  là hình %s  có diện tích lớn nhất %f ",
                            (vt1+1),h1,max);
                    break;
               case 6 :  
                        float min = ds.get(0).TinhDienTich();
                        int vt2=0;
                         String h2="";
                     for(int i=0;i<ds.size();i++){
                         if(ds.get(i).TinhDienTich()<min){
                             min =ds.get(i).TinhDienTich() ;
                                vt2 = i;
                               if(ds.get(i)instanceof HinhTron)
                                   h2= " Hình tròn";
                               else if(ds.get(i)instanceof HinhVuong)
                                    h2="Hình vuông";
                               else if(ds.get(i)instanceof HinhChuNhat)
                                    h2="Hình chữ nhật";
                                 }      
                             
                     }
                    System.out.printf("\n -Hình thứ %d  là hình %s có diện tích nhỏ nhất là %f ",
                            (vt2+1),h2,min);
                        break;
               case 7 : 
                 
                   float tongluong=0;
                   for(int i=0;i<ds.size();i++)
                   tongluong += ds.get(i).TinhDienTich();
                   System.out.print("\nTổng diện tích tất cả các hình: " + tongluong);
                             break;
                             
               default : 
                   chon = 0;
                   break;    
           }

       }while(chon !=0);
    }
}
