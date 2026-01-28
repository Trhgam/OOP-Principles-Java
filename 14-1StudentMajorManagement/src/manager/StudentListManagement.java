
package manager;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import util.Inputer;


public class StudentListManagement {
    private ArrayList<Student> studentList = new ArrayList<>();
    public void iniData(){
        this.studentList.add(new Student ("SE001", "Hehe", "He", 2005, 5, "SE"));
        this.studentList.add(new Student ("SE002", "Hyhy", "Hy", 2005, 3, "AI"));
        this.studentList.add(new Student ("SE003", "Haha", "Ha", 2005, 6, "ES"));
        this.studentList.add(new Student ("SE004", "Hihi", "Hi", 2005, 5, "SE"));
        this.studentList.add(new Student ("SE005", "Hoho", "Ho", 2005, 10, "SE"));
    }
    public void addNewStudentWithMId(String mId){
//        có mid sẵn rồi
//        mình chỉ xin
//        sid : có regex, unique , duy nhất 
           String sid;
           while(true){
               sid = mId + Inputer.getAString("Nhập mã sinh viên: ",
                            "Mã sinh viên không đúng định dạng: ",
                            "^\\d{3}$");//002
               if(findStudentBySId(sid)){
                   System.out.println("Max sinh viên bị trùng");
               }else{
                   break;
               }
        }

//        fname
        String fisrtName = Inputer.getAString("Nhập ten cua sinh viên: ",
                 "Ten sinh vien khong bo trong");
//        lname
        String lastName = Inputer.getAString("Nhập ho cua sinh viên: ",
                 "Ho sinh vien khong bo trong");
        //        yob
        int yob = Inputer.getAnInteger("Nhap tuoi: ", " Tuoi khong bo trong!!");
//        gpa
        double gpa = Inputer.getAnDouble("Nhap gpa: ", 
                         "Diem phai tu 1 den 10",1,10);
//        tạo NewStudent vào danh sách
        Student newStudent = new Student(sid, fisrtName, lastName, yob, gpa, mId);
//        thông báo hoàn thành 
          studentList.add(newStudent);
          System.out.println("Addition Successfully!!");
    }
    //check xem trùng ko
    public boolean findStudentBySId(String sid){
        for (Student student : studentList) {
            if(student.getsId().equals(sid)){
                return true;
            }
        }
        return false;
    }
    //
    public void showtudentListByMId(){
        String mid = Inputer.getAString("Nhap ma chuyen nganh can tim:",
                "Ma chuyen nganh can tim khong bo trong");
        //
        boolean isFind = false;
        //
        for (Student student : studentList) {
            if(student.getmId().equals(mid)){
                student.showInfor();
                isFind = true;
            }
                
        }
        //neu khong tim thay ai 
        if(!isFind){
            System.out.println("Khong co sinh vien nao");
        }
    }
    //
    public void showStudentListOrderByMajorAscAndGpaDesc(){
        Comparator<Student> orderByMajorAsc = new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
               return stu1.getmId().compareTo(stu2.getmId());
            }
        };
        Collections.sort(studentList, orderByMajorAsc);
        
        Comparator<Student> sameMidOrderByGpaDesc = new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                if(stu1.getmId().equals(stu2.getmId())){
                    return stu1.getGpa() < stu2.getGpa()?1:-1; 
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(studentList, sameMidOrderByGpaDesc);
        for (Student student : studentList) {
            student.showInfor();
        }
    }
    //
    
    
    public void getHighestGpaStudentGroupByMajor() {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i <= this.studentList.size() - 1; i++) {
            boolean isFind = false;
            for (int j = 0; j <= result.size() - 1; j++) {
                if (studentList.get(i).getmId().equals(result.get(j).getmId())) {
                    isFind = true;
                    if (studentList.get(i).getGpa() == result.get(j).getGpa()) {
                        isFind = false;
                        break;
                    }
                    if (studentList.get(i).getGpa() > result.get(j).getGpa()) {
                        result.remove(result.get(j));
                        isFind = false;
                        break;
                    }
                }
            }
            if (!isFind) {
                result.add(studentList.get(i));
            }
        }
    }

    
    

    
    
    
    

}
