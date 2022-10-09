
package Buoi1;

import static java.lang.Double.sum;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Nhap số dòng: ");
		int n = sc.nextInt();
                System.out.print("nhap số cột: ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
                int sum = 0;
//                System.out.println("Nh?p các ph?n t? cho ma tr?n A:");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//                            System.out.print("A[" + i + "," + j + "] = ");
//				a[i][j] = sc.nextInt();
//			}
//		}
                for(int i=0;i<n;i++){
                    for (int j = 0; j < m; j++){
                        a[i][j]=(int)(Math.random()*50);
                    }
                }
		System.out.println("Ma tran :");
             for (int i = 0; i < n; i++) {
                   for (int j = 0; j < m; j++) {
                     System.out.print(a[i][j] + "\t");
			}
                      System.out.println("\n");
                    }
             
                     for(int i=0;i<n;i++){
                         for (int j = 0; j < m; j++){
                             sum=sum+a[i][j];
                         } 
                     }
                     System.out.printf("Tong cac phan tu cua ma tran la:%d ",sum);
		}
               
	}



