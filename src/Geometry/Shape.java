
package LTHDT;


public abstract class Shape {
    // Phương thức trừu tượng tính diện tích
    public abstract double area();
    
    //Phương thức hiện thị thông tin
    public String  toString(){
        return "Dien tich la: " + area();
        
    }
}
