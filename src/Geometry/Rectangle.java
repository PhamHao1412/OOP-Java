
package LTHDT;

public class Rectangle extends Shape {

        private  double d;
        private double r;
        
        public Rectangle(){
       }
        
    public Rectangle(double d, double r) {
        this.d = d;
        this.r = r;
    }
    public double ChuVi(){
        
        return(this.d+this.r) * 2;
    }
    public double area(){
        return  this.d * this.r;
    }
        
}
