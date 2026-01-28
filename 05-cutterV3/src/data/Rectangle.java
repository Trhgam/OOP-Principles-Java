
package data;


public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, String owner, double width, double height) {
        super(color, owner);
        this.width = width;
        this.height = height;
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

    public String getOwner() {
        return owner;
    }
    
    
    @Override
    public double getPeriMeter() {
        return 2*(width + height);
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public void paint() {
        String str = String.format("Rectangle|%-10s|%-10s|%5.2f|%5.2f|%5.2f|%5.2f|",
                                    owner,color, width, height,
                                    getPeriMeter(),getArea());
        System.out.println(str);
    }
    
    
}
