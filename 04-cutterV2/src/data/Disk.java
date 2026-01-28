
package data;


public class Disk {
    //A I C D
    private double radius;
    private String color;
    public final static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getPeriMeter() {
        return 2*PI*radius;
    }
    
    public double getArea() {
        return PI*radius*radius;
    }
    
     public void paint() {
        String str = String.format("Disk   |%11.2f|%-10s|%5.2f|%5.2f|",
                                    radius, color,
                                    getPeriMeter(),getArea());
        System.out.println(str);
    }
}
