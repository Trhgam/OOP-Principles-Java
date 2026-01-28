
package data;

public class Rectangle {
    //prop
    protected double width;
    private double height;
    protected String color;
    
    //method
    //constructer : phếu dùng giá trị để đúc

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    
    public double getPerimeter() {
        return ( height + width ) * 2;
    }
    
    public double getArea() {
        return ( height + width ) ;
    }
    
    public void paint(){
        String str = String.format("Rectangle|%5.2f|%5.2f|%-10s|%5.2f|%5.2f|",
                                    width, height, color,
                                    getPerimeter(),getArea());
        System.out.println(str);
        }
    
}
