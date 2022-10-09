package Buoi1;
import java.io.*;
import java.util.*;

public class bai9 {
public static void main(String[] args) {
int a[][], m, n;
Scanner x = new Scanner(System.in);


System.out.printf("Nhập số dòng: ");
m = x.nextInt();
System.out.printf("Nhập số cột: ");
n = x.nextInt();
a = new int [m][n];
for(int i = 0; i < m; i++) {
for(int j = 0; j < n; j++) {
System.out.printf("a[%d][%d] = ",i,j);
a[i][j] = x.nextInt();
}
}


System.out.println("Ma trận :");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
             System.out.print(a[i][j] + "\t");
	}
            System.out.println("\n");
              }

System.out.printf("\nNhập hàng thứ k: ");
int k = x.nextInt();
int Tong = 0;
for(int j = 0; j < n; j++) {
Tong = Tong + a[k-1][j];
}
System.out.printf("Tổng các phần tử hàng thứ %d là: %d", k, Tong);
}
}
