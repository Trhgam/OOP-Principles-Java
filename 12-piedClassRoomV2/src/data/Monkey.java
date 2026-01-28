
package data;

import java.util.Random;

public class Monkey extends Herbivote{
    //bắt chước nên 70
   public static final double RECEPTIVE = 70; //final thì phải viết biến in hoa 

    public Monkey(String name, int yob, double weight) {
        super(name, yob, weight);
    }

   
   
    //new cha : super 

    @Override
    public double study() {
        Random rd = new Random();// độ ẩm của testsalt        
        return rd.nextDouble()*RECEPTIVE;
        //rd.nextDouble() random từ 0.0 - 1.0
    }

    @Override
    public void showInfor() {
        String str = String .format("MONKEY |%-15s|%4d|%-6.2f|%5.2f|",
                        name, yob, weight, study());
        System.out.println(str);
    }
    
    
}
