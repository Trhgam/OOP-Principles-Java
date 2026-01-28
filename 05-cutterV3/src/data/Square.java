
package data;

public class Square extends Rectangle{

    public Square(String color, String owner, double edge) {
        super(color, owner, edge, edge);
    }

    @Override
    public void paint() {
       String str = String.format("Square   |%-10s|%-10s|%5.2f|%5.2f|%5.2f|",
                                    owner, color, getWidth(),
                                    getPeriMeter(),getArea());
        System.out.println(str);
    }
    
   //tron tam giac tam giac vuong
    
}
