
package runtime;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choice = 0;//nhap so phai can than
        Scanner sc = new Scanner(System.in);
        do{
            printMenu();
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: {
                    Student newst = new Student();
                    newst.inputInfor();
                    studentList.add(newst);
                    System.out.println("Add succesfully");
                    break;
                }
                case 2: {
                    System.out.println("Enter ID");
                    for (Student st : studentList) {
                        st.showInfor();
                    }
                    if(studentList.isEmpty()){
                        System.out.println("Empty");
                    }
                    break;
                }
                case 3: {
                    if(studentList.isEmpty()){
                        System.out.println("Empty");
                    }
                    double maxPoint = studentList.get(0).getGpa();
                    double minPoint = studentList.get(0).getGpa();
                    for (Student st : studentList) {
                        if(st.getGpa() > maxPoint){
                            maxPoint = st.getGpa();
                        }
                        if(st.getGpa() < minPoint){
                            minPoint = st.getGpa();
                        }
                    }
                    System.out.println("Dsach svien co diem lon nhat ");
                    for (Student student : studentList) {
                        if(student.getGpa() == maxPoint){
                            student.showInfor();
                        }
                    }
                    System.out.println("Danh sach sinh vien co diem nho nhat");
                    for (Student student : studentList) {
                        if(student.getGpa() == minPoint){
                            student.showInfor();
                        }
                    }
                    break;
                }
                case 4: {
                    //4.Tìm kiếm theo mã sinh viên 
                    // xin id của sinh viên mà người dùng cần tìm 
                    //duyệt theo danh sách tìm sv có mã trùng với id vừa nhập 
                    // tìm được thì show 
                    // ko được phải thông báo 
                    if(studentList.isEmpty()){
                        System.out.println("Empty");
                    }
                    String tmpID;
                    System.out.println("Nhap ma sinh vien can tim: ");
                    tmpID = sc.nextLine();
                    boolean check = false;
                    for (Student st: studentList) {
                        if(st.getId().equalsIgnoreCase(tmpID)){
                            st.showInfor();
                            check = true;
                        }
                    }
                    if(!check){
                        System.out.println("Not exist");
                    }
                    break;
                }
                case 5: {
                    //5.Sắp xếp sinh viên theo tên abc và hiển thị
                    if(studentList.isEmpty()){
                        System.out.println("Ko co gi trong danh sach");
                        break;
                    }
                    //Sắp xếp sinh viên theo tên 
                    //tạo ra anh trọng tài 
                    //t == teneric 
                    // method Compare(T o1, T o2);
                    Comparator<Student> trongTai = new Comparator<Student>() {
                        @Override
                        public int compare(Student stu1, Student stu2) {
                            return stu1.getName().compareTo(stu2.getName());
                        }
                    };
                    //Alolymus               
                    //nhờ anh trọng tài sắp xếp theo yêu cầu đưa ra 
                    //StudentList là ArrayList , ArrayList là 1 Collection 
                    //Vậy nên StudentList được xài bộ tool có tên là Collections 
                    Collections.sort(studentList, trongTai);
                    //hiển thị sinh viên
                    for (Student student : studentList) {
                        student.showInfor();
                    }
                    break;
                }
                case 6: {
                    //6.In ra sinh viên có học bổng(gpa >= 8) và hiển thị theo ds
                    //có 2 hướng : h1 tạo 1 mạng mới tốn 
                    //h2 xóa trộn mảng
                    Comparator<Student> orderByGPADesc = new Comparator<Student>() {
                        @Override
                        public int compare(Student stu1, Student stu2) {
                            if(stu1.getGpa() < stu2.getGpa()){
                                return 1;
                            }else{
                                return -1;
                            }
                        }
                    };
                    Collections.sort(studentList, orderByGPADesc);
                    for (Student student : studentList) {
                        if(student.hasScholarship()){
                            student.showInfor();
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Pyeee");
                    break;
                }
                default:{
                    System.out.println("Choice 1-7");
                    break;
                }
            }
        }while( choice != 7);
    }
    public static void printMenu(){
        System.out.println("---------------Menu---------------");
        System.out.println("1.Thêm mới 1 sinh viên");
        System.out.println("2.Hiển thị thông tin sinh viên");
        System.out.println("3.Hiển thị max min theo điểm trung bình");
        System.out.println("4.Tìm kiếm theo mã sinh viên");
        System.out.println("5.Sắp xếp sinh viên theo tên asc và hiển thị");
        System.out.println("6.In ra sinh viên có học bổng và hiển thị theo ds");
        System.out.println("7.Exit");
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

tạo class Student kế thừa Person
    sẽ có id, gpa, email
    tạo constructor có đối số và constructor không đối số
    tạo getter
    làm method showInfor
    làm method inputInfor

Menu sẽ gồm các chức năng sau
1.Thêm mới 1 sinh viên
2.Hiển thị thông tin sinh viên
3.Hiển thị max min theo điểm trung bình
4.Tìm kiếm theo mã sinh viên
5.Sắp xếp sinh viên theo tên abc và hiển thị
6.In ra sinh viên có học bổng và hiển thị theo ds
7.Thoát
*/
/*
overloang và override đều thể hiện tính đa hình trong java 
override :  chỉ xuất hiện trong mối qan hệ cha con mà thôi
            khi thằng con muốn độ lại method của cha (cùng tên)
            cùng parameter 

overload : diễn ra ở mọi nơi, 2 hàm cùng tên và phải khác parameter 
            => khác cách xài 


*/
