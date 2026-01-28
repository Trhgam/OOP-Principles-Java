
package data;

import java.util.Scanner;


public class Person {
    //prop
    private String name;
    private String gender;
    private int yob;
    //constructer

    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYob() {
        return yob;
    }

   
    public void showInfor(){
        System.out.printf("%s|%s|%d",name,gender, yob);
    }
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter name: ");
        this.name = sc.nextLine();
        System.out.printf("Enter gender: ");
        this.gender = sc.nextLine();
        System.out.printf("Enter yob: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
}
/*
Viết phần mềm quản lý sinh viên gồm các mô tả sau
tạo class Person gồm name, gender, yob
    tạo constructor có đối số
        và constructor không đối số
    làm bộ getter
    làm method showInfor: giúp show thông tin của person
    làm method inputInfor: có nhiệm vụ xin thông tin của người dùng muốn tạo
        person và lưu
*/