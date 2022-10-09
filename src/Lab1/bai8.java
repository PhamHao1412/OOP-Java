 package Buoi1;
import java.io.*;
import java.util.*;

public class bai8 {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.printf("Nhập mảng: ");
String mang = x.nextLine();
String []arr = mang.split(" ");
int a[] = new int[arr.length];

System.out.printf("Xuất mảng: ");
for(int i=0; i<arr.length; i++)
{
a[i] =  Integer.parseInt(arr[i]);
System.out.printf(a[i] + " ");
}

System.out.printf("\nXuất mảng tăng dần: ");
Arrays.sort(a);
for(int j=0; j<arr.length; j++) {
System.out.printf(a[j] + " ");
}

}
}
