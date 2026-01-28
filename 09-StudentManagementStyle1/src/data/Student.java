
package data;

import java.util.Scanner;


public class Student extends Person{
    //prop
    private String id;
    private double gpa;
    private String email;
    //constructor

    public Student(String name, String gender, int yob, String id, double gpa, String email) {
        super(name, gender, yob);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

   

    public Student() {
    }
    
    public boolean hasScholarship(){
        return this.gpa >= 8;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    public boolean setId(String id) {
        boolean isValid = id.matches("^SA\\d{3}$");
            if(!isValid){
                System.out.println("ID Invalid");
            }else{
                this.id = id;
            }
            return isValid;
    }

    public boolean setGpa(double gpa) {
        boolean isValid = gpa >= 0 && gpa <= 10;
        if(!isValid){
            System.out.println("Score must be from 0 to 10");
        }else{
             this.gpa = gpa;
        }
        return isValid;
    }

    public boolean setEmail(String email) {
        boolean isValid = email.length() > 0 &&
                          email.contains("@") 
                          && email.contains(".");
        if(isValid){
            this.email = email;
        }else{
            System.out.println("Invalid email");
        }
        return isValid;
    }

    
    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        super.inputInfor();
        String id;
        System.out.println("Enter id(SAXXX):");
//        while(true){
//            id = sc.nextLine();
//            boolean isValid = setId(id);//check
//            if(isValid){
//                break;
//            }
//        }
        while(!setId(sc.nextLine()));//đảo ngược kết quả của hàm set trả ra 
        //nhap gpa 
        System.out.println("Enter gpa");
        while(!setGpa(Double.parseDouble(sc.nextLine())));
        
        System.out.println("Enter email");
        while(!setEmail(sc.nextLine()));
        
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.printf("|%s|%f|%s\n", id, gpa, email);
    }
    
}
/*
tạo class Student kế thừa Person
    sẽ có id, gpa, email
    tạo constructor có đối số và constructor không đối số
    tạo getter
    làm method showInfor
    làm method inputInfor
*/