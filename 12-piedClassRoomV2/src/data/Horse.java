
package data;
//Ngựa là con của herdibivote nó chỉ chứa những điểm của riêng nó 
//có những cái chung nó sẽ kế thừa và kphuc lại

import java.util.Random;


public class Horse extends Herbivote implements StudyEnthusiasts{
    private String colorSaddle;
    public static final double RECEPTIVE = 30; //final thì phải viết biến in hoa 
    public Horse(String name, int yob, double weight,String colorSaddle) {
        super(name, yob, weight);
        this.colorSaddle = colorSaddle;
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
        String str = String .format("HORSE |%-15s|%4d|%-6.2f|%5.2f|%s|",
                        name, yob, weight, study() ,colorSaddle);
        System.out.println(str);
    }

    @Override
    public double studyHard() {
       return study()*1.5;
    }
    @Override
    public void showHard() {
         String str = String .format("HORSE |%-15s|%4d|%-6.2f|%5.2f|%s|",
                        name, yob, weight, studyHard() ,colorSaddle);
        System.out.println(str);
    }
    
}
