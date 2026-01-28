
package util;

import java.util.Scanner;
//Inputter là cái khuôn nhưng ko dùng để đúc Object 
//mà dùng để chứa các hàm (method)công cụ đế giúp việc nhập dễ hơn
//


public class Inputer {
    private static Scanner sc = new Scanner(System.in);
    // hàm ép nhập số nguyên 
    public static int getAnInteger(String inputMsg, String errMsg){
        while(true){
            try{
                System.out.println(inputMsg);
                int value = Integer.parseInt(sc.nextLine());
                return value;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    //hàm nhập số nguyên và mời + chửi + giới hạn
    public static int getAnInteger(String inputMsg, String errMsg,
            int lowerBound, int upperBound){
        while(true){
            try{
                System.out.println(inputMsg);
                int value = Integer.parseInt(sc.nextLine());
                if(value < lowerBound || value > upperBound){
                    throw new Exception();
                }
                return value;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
     // hàm ép nhập số thuc
    public static double getAnDouble(String inputMsg, String errMsg
                            ,double lowerBound, double upperBound){
        while(true){
            try{
                System.out.println(inputMsg);
                double value = Double.parseDouble(sc.nextLine());
                if(value < lowerBound || value > upperBound){
                    throw new Exception();
                }
                return value;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
     public static double getAnDouble(String inputMsg, String errMsg  ){
        while(true){
            try{
                System.out.println(inputMsg);
                double value = Double.parseDouble(sc.nextLine());
                return value;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    
  
    
    // hàm ép nhập chuỗi ko bỏ trống
    public static String getAString(String inputMsg, String errMsg){
        while(true){
            try{
                System.out.println(inputMsg);
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    // hàm ép nhập chuỗi ko bỏ trống theo định dạng
    public static String getAString(String inputMsg, String errMsg,
            String regex){
        while(true){
            try{
                System.out.println(inputMsg);
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
     
}
