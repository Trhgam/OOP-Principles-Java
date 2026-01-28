
package data;


public class Disk extends Shape{
    private double radius;
    public final static double PI = 3.14;

    public Disk(String color,String owner,double radius) {
        super(color, owner);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

   
    
    @Override
    public double getPeriMeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
       return PI*radius*radius;
    }

    @Override
    public void paint() {
        String str = String.format("Disk     |%-10s|%-10s|%5.2f|%5.2f|%5.2f|",
                                    owner,color, radius,
                                    getPeriMeter(),getArea());
        System.out.println(str);
    }
    
    
}
