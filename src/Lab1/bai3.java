
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai3 {
   

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
               System.out.print("Nhap n so nguyen: ");
		int n = sc.nextInt();
                
		int[] a = new int[n];
                System.out.print("Nhap ca phan tu cua mang: \n");
		for (int i = 0; i < n; i++) {
                    System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
                     
		}
                 System.out.printf("\nXuat mang: ");
                 for(int i=0;i<n;i++){
                    System.out.printf(a[i] + " ");
                 }
		int maxValue = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}

		System.out.print("\nGia tri lon nhat trong mang la: "+maxValue);
	}
}