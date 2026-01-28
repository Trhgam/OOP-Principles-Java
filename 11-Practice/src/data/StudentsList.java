
package data;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentsList extends ArrayList<Student>{
    Scanner sc = new Scanner(System.in);
    //Them sinh vien co san tham so - su dung constructer full
    public void addNewStudent(Student newStudent){
        this.add(newStudent);
        System.out.println("Addition Successfully!!");
    }
    
    public void diplayStudentByMID(MajorsList majorList){
        String choice = sc.nextLine();
        for (Student student : this) {
            if(student.getMajor().getMId().equals(choice)) {
                student.showInfor();
            }
        }
    }
    
    
    public void displayAll(){
        for (Student item : this) {
            item.showInfor();
        }
    }
    //Them sinh vien ko co tham so / su dung constructer rong
    public void addNewStudentFromKeyBoard(MajorsList majorList){
        System.out.println("Nhập mã sinh viên: ");
        String SID = sc.nextLine();
        System.out.println("Nhập họ: ");
        String firstName = sc.nextLine();
        System.out.println("Nhập tên: ");
        String lastName = sc.nextLine();
        System.out.println("Nhập điểm: ");
        double Gpa = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập năm sinh: ");
        int yob = Integer.parseInt(sc.nextLine());
        majorList.displayAll();
        System.out.println("Nhập lựa chọn là số: ");
        int choice = Integer.parseInt(sc.nextLine());
        Major m1 = majorList.get(choice - 1);
        this.add(new Student(SID, firstName, lastName, yob, Gpa, m1));
        System.out.println("Addition Successfully!!");
    }
    
    
}
