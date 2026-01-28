
package data;

import java.util.Random;

public class Hunter {
    private String name;
    private int yob;
    private double weight;
    private String gear;
    //bác thợ săn học mà cứ nhìn phò mã nên học 50 
    public static final double RECEPTIVE = 50; //final thì phải viết biến in hoa 

    public Hunter(String name, int yob, double weight, String gear) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.gear = gear;
    }
    
    //new cha : super 

    public double study() {
        Random rd = new Random();// độ ẩm của testsalt        
        return rd.nextDouble()*RECEPTIVE;
        //rd.nextDouble() random từ 0.0 - 1.0
    }

    public void showInfor() {
        String str = String .format("HUNTER |%-15s|%4d|%-6.2f|%5.2f|%s|",
                        name, yob, weight, study() ,gear);
        System.out.println(str);
    }
    
}
