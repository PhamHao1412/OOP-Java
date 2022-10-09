
package Buoi5;

import java.util.Scanner;
import java.util.ArrayList;

public class Cau2 {
    public static void main(String[] args) {
    int chon;
    Scanner x = new Scanner(System.in);
    ArrayList<NV> ds = new ArrayList();
    
       NV temp;
       
       
       do{
           System.out.print("\n1 . Nhập 1 nhân viên quản lý ");
           System.out.print("\n4 . Nhập 1 nhân viên nghiên cứu ");
           System.out.print("\n3 . Nhập 1 nhân viên phục vụ ");
           System.out.print("\n4 . Tính tổng lương các nhân viên ");
           System.out.print("\n5 . Xuất thông tin nhân viên quản lý");
            System.out.print("\n5 . Xuất thông tin nhân viên nghiên cứu ");
             System.out.print("\n5 . Xuất thông tin nhân viên phục vụ ");
           System.out.print("\n0 . Thoát ");
           System.out.print("\nChọn chức năng: ");
           chon= x.nextInt();
           switch(chon){
               case 1 : 
                   temp = new NVQL();
                   temp.nhap();
                   ds.add(temp);
                   break;
               case 2 :   
                temp = new NVNC();
                   temp.nhap();
                   ds.add(temp);
                   break;
               case 3 :
                  temp = new NVPV();
                   temp.nhap();
                  ds.add(temp);
                   break;
                   
                   
               case 4 : 
                   float tongluong=0;
                   for(int i=0;i<ds.size();i++)
                   tongluong += ds.get(i).TinhLuong();
                   System.out.print("\nTổng lương tất cả nhân viên: " + tongluong);
                   
               case 5 :
                 temp = new NVQL();
                   int s;
                    for(int i=0;i<ds.size();i++){
                          
                        if( ds.get(i) instanceof NVQL ){
                            ds.get(i).xuat();
                    }
                    }
                    break;     
                    case 6 :
                 temp = new NVNC();
                   
                    for(int i=0;i<ds.size();i++){
                          
                        if( ds.get(i) instanceof NVNC ){
                            ds.get(i).xuat();
                    }
                    }
                    break; 
                     case 7 :
                 temp = new NVPV();
                  
                    for(int i=0;i<ds.size();i++){
                          
                        if( ds.get(i) instanceof NVPV ){
                            ds.get(i).xuat();
                    }
                    }
                    break; 
               
               default : 
                   chon = 0;
                   break;
                   
                   
           }
           
           
           
       }while(chon !=0);
    }
}
