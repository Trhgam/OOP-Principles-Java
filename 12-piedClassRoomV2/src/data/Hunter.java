
package data;

import java.util.Random;
//Hunter vào lớp , chỉ tập trunghojc 
//dù có biết nbao nhiều món ăn quanh mình
//học quên ăn=> Hunter rất ham học => thuộc ham học
public class Hunter implements StudyEnthusiasts{
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

    @Override
    public double studyHard() {
        return study()*1.5;
    }

    @Override
    public void showHard() {
        String str = String .format("HUNTER |%-15s|%4d|%-6.2f|%5.2f|%s|",
                        name, yob, weight, studyHard() ,gear);
        System.out.println(str);
    }
    
}
