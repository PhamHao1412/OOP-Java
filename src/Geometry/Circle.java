
package LTHDT;


public class Circle extends Shape{

   
    private double bankinh;
    
    public Circle(){
        
    }
     public Circle(double bankinh) {
        this.bankinh = bankinh;
    }
     public double ChuVi(){
         return 2*Math.PI*this.bankinh;
     }
     public double area(){
         
         return Math.PI*this.bankinh*this.bankinh;
     }
    
    
}
