package Buoi2;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
 class Coondiate {

    private int x;
    private int y;

    public Coondiate() {
        x = y = 0;
    }

    public Coondiate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coondiate tong(Coondiate p) {
        return new Coondiate(this.x + p.x, this.y + p.y);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coondiate doiXung() {
        Coondiate tmp = new Coondiate();
        tmp.x = -this.x;
        tmp.y = -this.y;
        return tmp;
    }

    public void xuat() {
        System.out.println("(" + x + ";" + y + ")");
    }
}

class DemoCoondiate {

    public static void main(String agrs[]) {
        Coondiate p1 = new Coondiate();
        System.out.print("Ket qua khoi tao chuan p1: ");
        p1.xuat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do: ");
        int a = sc.nextInt();
        System.out.print("Nhap tung do: ");
        int b = sc.nextInt();
        Coondiate p2 = new Coondiate(a, b);
        System.out.print("Ket qua khoi tao p2: ");
        p2.xuat();
        System.out.println("Ket qua cong toa do p1 + p2: " + p1.tong(p2));
        System.out.println("----------------");
        Coondiate tmp = new Coondiate();
        System.out.print("Ket qua diem doi xung cua p2: ");
        tmp = p2.doiXung();
        tmp.xuat();
    }
}