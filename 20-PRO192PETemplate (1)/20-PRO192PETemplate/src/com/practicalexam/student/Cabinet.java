package com.practicalexam.student;

import com.practicalexam.student.data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import jdk.internal.util.xml.impl.Input;
import util.Inputer;

/**
 *
 * @author FPT University - HCMC
 * Java OOP Practical Exam Template
 */




public class Cabinet {

    //StartList - do not remove this comment!!!
	   ArrayList<Student> stuList = new ArrayList<>();
    

    // Declare ArrayList or Array here
    
    //EndList - do not remove this comment!!!
    
    public void add() {
        // Print the object details after adding
        // tạo sinh viên xin và đúc
        String SId ;
        while(true){
            SId = Inputer.getAString("Nhap ma sinh vien moi: ", 
                                            "Ma sinh vien khong hop le!!!","^[A-Z]{2}\\d{3}$");
            if(checkDuplicatedId(SId)){
                System.out.println("Ma sinh vien da co nguoi su dung");
            }else{
                break;
            }
        }
        String name = Inputer.getAString("Nhap ten sinh vien moi: ",
                                        "Ten sinh vien khong duoc bo trong!!");
        int point = Inputer.getAnInteger("Nhap diem sinh vien: ", 
                                        "Diem phai lon hon  Va nho hon 10!!!"
                                         ,0,10);
        Student newStu = new Student(SId, name, point);
        stuList.add(newStu);
    	   for (Student student : stuList) {
            student.Show();
        }
    }

    public boolean checkDuplicatedId(String id) {
        // Your code here
        for (Student student : stuList) {
            if(student.getId().equals(id)) return true;  
        }
        return false;
    }

    public void update() {
        // Print the object details after updating name/model and point
        String SId = Inputer.getAString("Nhap ma sinh vien muốn update: ", 
                                            "Ma sinh vien khong bo trong!!!" );
        Student stu = findStudentById(SId);
        if(stu == null){
            System.out.println("Không tìm thấy sinh viên");
            return;
        }
        //xử lý 
        System.out.println("Thông tin sinh viên tìm được nè: ");
        stu.Show();
        String name = Inputer.getAString("Nhập tên mới cho sinh vien : ",
                                        "Ten sinh vien khong duoc bo trong!!");
        int point = Inputer.getAnInteger("Nhap diem mới  cho sinh vien: ", 
                                        "Diem phai lon hon  Va nho hon 10!!!"
                                         ,0,10);
        
        stu.setName(name);
        stu.setPoint(point);
        stu.Show();
    }

    public void search() {
        // Print the object details after searching
        String SId = Inputer.getAString("Nhap ma sinh vien can tim: ", 
                                            "Ma sinh vien khong bo trong!!!" );
        Student stu = findStudentById(SId);
        if(stu == null){
            System.out.println("Không tìm thấy sinh viên");
            return;
        }
        System.out.println("Thông tin sinh viên tìm được");
        stu.Show();
    }
    
    
    public void remove() {
        // Print the list after removing
         String SId = Inputer.getAString("Nhap ma sinh vien can xoa: ", 
                                            "Ma sinh vien khong bo trong!!!" );
        Student stu = findStudentById(SId);
        if(stu == null){
            System.out.println("Không tìm thấy sinh viên để xóa");
            return;
        }
        System.out.println("Đã xóa được sinh viên");
        stu.Show();
        stuList.remove(stu);

    }
    public Student findStudentById(String id){
        for (Student student : stuList) {
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public void sort() {
        // Print the object details after sorting
        Comparator<Student> orderByPointAsc = new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu1.getPoint() - stu2.getPoint();
            }
        };
        //reverse = 2 tip , rever hoặc *-1
        Collections.sort(stuList, orderByPointAsc);
        for (Student student : stuList) {
            student.Show();
        }

    }
}
