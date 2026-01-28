
package runtime;

import data.Major;
import data.Student;
import data.MajorList;
import data.StudentList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

//    private static List<Major> majors = new ArrayList<>();
//    private static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static MajorList addMajorList() {
        //Tạo danh sách chuyên ngành
        MajorList majorList = new MajorList();
        //Tạo các chuyên ngành
        Major m1 = new Major("KDQT", "Kinh doanh quốc tế", 111);
        Major m2 = new Major("TT", "Truyền thông", 112);
        Major m3 = new Major("ATTT", "An toàn thông tin", 113);
        Major m4 = new Major("KTPM", "Kỹ thuật phần mềm", 114);
        //Thêm các chuyên ngành vào danh sách
        majorList.addMajor(m1);
        majorList.addMajor(m2);
        majorList.addMajor(m3);
        majorList.addMajor(m4);

        return majorList;
    }
    public static StudentList addStudentList() {
        //Tạo danh sách môn học
        MajorList majorList = addMajorList();
        //Lấy các môn học ra
        Major m1 = majorList.get(0);
        Major m2 = majorList.get(1);
        Major m3 = majorList.get(2);
        Major m4 = majorList.get(3);
        //Tạo danh sách sinh viên
        StudentList students = new StudentList();
        Student stu1 = new Student("SE111", "Quang","Hùng", 1999, 3.8, m4);
        Student stu2 = new Student("SE112", "Quang","Anh", 2000, 3.5, m3);
        Student stu3 = new Student("SE113", "Kim","Jennie", 2004, 4.0, m2);
        Student stu4 = new Student("SE114", "Min","Yoongi", 2006, 3.7, m1);

        students.add(stu4);
        students.add(stu3);
        students.add(stu2);
        students.add(stu1);

        return students;
    }
    public static void main(String[] args) {
        //Tạo danh sách chuyên ngành
        MajorList majors = addMajorList();
        //Tạo danh sách sinh viên
        StudentList students = addStudentList();
        int choice;
        while (true) {
            do {
                printMenu();
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: {
                        //1.Thêm chuyên ngành
                        majors.showInfor();
                        majors.addMajorByKeyboard();
                        System.out.println("Thêm chuyên ngành thành công");
                        break;
                    }
                    case 2: {
//                         majors.showInfor();
                        //2.Thêm sinh viên vào chuyên ngành
                        //2.1 hiển thị menu con các chuyên ngành có thể thêm, để chọn
                        System.out.println("Chọn chuyên ngành cho sinh viên (1-4):");
                        students.showInfor();
                        students.addStudentByKeyboard(majors);
                        System.out.println("Thêm sinh viên thành công");
                        students.showInfor();
                        break;
                    }
                    case 3: {
                        // 3.Hiển thị dách sách sinh viên của chuyên ngành nào đó
                        students.showStudentByMajor(majors);
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        System.out.println("Hen gap lai");
                        return;
                    }
                }
            } while (choice != 6);
        }
    }
    public static void printMenu(){
        System.out.println("--------------Menu--------------");
        System.out.println("1.Thêm chuyên ngành");
        System.out.println("2.Thêm sinh viên vào chuyên ngành");
        System.out.println("3.Hiển thị dách sách sinh viên của chuyên ngành nào đó");
        System.out.println("4.Hiển sinh viên viên cao điểm nhất của mỗi chuyên ngành");
        System.out.println("5.sắp xếp sinh viên theo chuyên ngành asc, và điểm desc");
        System.out.println("6.quit");
    }
//    public static void addMajor() {
//        boolean isFind = false;
//        String MId;
//        String name;
//        int room;
//
//        do {
//            System.out.println("Nhập MID: ");
//            MId = sc.nextLine();
//            if(MId.matches("(?i)^S(E|S|Q)$")){
//                break;
//            }
//        } while (isFind);
//
//        do {
//            System.out.println("Nhập name major: ");
//            name = sc.nextLine();
//            if(majors.isEmpty()){
//                break;
//            }
//            for (Major ma : majors) {
//                if (ma.getName().equalsIgnoreCase(name)) {
//                    isFind = true;
//                    break;
//                }
//            }
//            if(isFind ){
//                System.out.println("Tên ngành đã tồn tại");
//            }else{
//                break;
//            }
//        } while (true);
//
//        do {
//            System.out.println("Nhập phòng: ");
//            room = Integer.parseInt(sc.nextLine());
//            if(majors.isEmpty()){
//                break;
//            }
//            for (Major ma : majors) {
//                if (ma.getRoom() == room) {
//
//                    isFind = true;
//                }
//            }
//            if(isFind){
//               System.out.println("Phòng đã có lớp");
//            }else{
//                break;
//            }
//        } while (true);
//        Major newMajor = new Major(MId, name, room);
//        majors.add(newMajor);
//        System.out.println("Addition successfully");
//    }
//    public static void printMenuMajor(){
//        System.out.println("Danh sách các chuyên ngành đang có");
//        int i = 1;
//        for (Major major : majors) {
//            System.out.printf("\n%d.Ngành %s\n",i, major.getName());
//            i++;
//        }
//        System.out.println("--------------------------------");
//    }
//    public static void addStudentbaseMajor(){
//        int chooseTmp ;
//        while(true){
//            try {
//                do {
//                    System.out.print("\nEnter:  ");
//                    chooseTmp = Integer.parseInt(sc.nextLine());
//                    switch (chooseTmp) {
//                        case 1:{
//                            Major maTMp = new Major("SS", "Kinh doanh quốc tế", 111);
//                            addStudent(maTMp);
//                            return;
//                        }
//                        case 2:{
//                            Major maTMp = new Major("SS", "Truyền thông", 112);
//                            addStudent(maTMp);
//                            return;
//                        }
//                        case 3:{
//                            Major maTMp = new Major("SE", "An toàn thông tin", 113);
//                            addStudent(maTMp);
//                            return;
//                        }
//                        case 4:{
//                            Major maTMp = new Major("SE", "Kỹ thuật phần mềm", 114);
//                            addStudent(maTMp);
//                            return;
//                        }
//                        default:
//                            throw new AssertionError();
//                    }
//                } while (chooseTmp >= majors.size());
//            } catch (Exception e) {
//                System.out.println("Nhap lai di!! cho ham addstudentbasemajor");
//            }
//        }
//    }
//    public static boolean checkStudent(String Id){
//        for (Student student : students) {
//            if(student.getSID().equalsIgnoreCase(Id)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void addStudent(Major ma){
//        String SId;
//        String firstName;
//        String lasttName;
//        int yob;
//        double gpa;
//        boolean isTrue = false;
//        //nhap ID SId.matches("(?i)^(SE|SS|SQ)\\d+$")
//        do {
//            System.out.printf("\nNhập Sid: ");
//            SId = sc.nextLine();
//            if(!checkStudent(SId) && SId.matches("(?i)^(SE|SS|SQ)\\d+$") ){
//                    isTrue = true;
//                }else{
//                    System.out.println("Vui lòng nhập lại");
//                }
//        } while (!isTrue);
//        //nhap name
//        do {
//            isTrue = false;
//            System.out.printf("\nNhập first name: ");
//            firstName=sc.nextLine();
//            if(firstName.matches("^[a-zA-Z]+$")){
//                isTrue = true;
//            }else{
//                System.out.println("Vui lòng nhập lại");
//            }
//        } while (!isTrue);
//        //nhap last name
//        do {
//            isTrue = false;
//            System.out.printf("\nNhập last name: ");
//            lasttName=sc.nextLine();
//            if(lasttName.matches("^[a-zA-Z]+$")){
//                isTrue = true;
//            }else{
//                System.out.println("Vui lòng nhập lại");
//            }
//        } while (!isTrue);
//        // nhap yob
//        do {
//            isTrue = false;
//            System.out.printf("\nNhập yob: ");
//            yob = Integer.parseInt(sc.nextLine());
//            if(yob > 1997 && yob < 2007){
//                isTrue = true;
//            }else{
//                System.out.println("Vui lòng nhập lại");
//            }
//        } while (!isTrue);
//        //nhap gpa
//        do {
//            isTrue = false;
//            System.out.printf("\nNhập gpa: ");
//            gpa = Double.parseDouble(sc.nextLine());
//            if(gpa > 0.0 && gpa <= 4.0){
//                isTrue = true;
//            }
//        } while (!isTrue);
//
//        Student stu = new Student(SId, firstName, lasttName, yob, gpa, ma);
//        students.add(stu);
//        System.out.println("Addition Successfully");
//    }
    public static void printListBaseMajor(){
//        int choice = ;
//        if(choice == 1){
//            
//        }
    }
    
}
/*for (Student stu : students) {
                         if (stu.getMajor().getName().equalsIgnoreCase("Kỹ thuật phần mềm")) {
                             stu.showInfor();
                         }
                     }
                     break;*/
/*
Quản lý sinh viên và cách chuyên ngành sinh viên theo học
Student
  Sid, firstName, lastName, yob, Gpa,MId
  phểu rỗng, phễu có full đối số, phễu chỉ có MId
  getter
  showInfor
Major
  MId, name, room
  phễu rỗng, phễu full
  getter
  showInfor

Menu
 1.Thêm chuyên ngành
 2.Thêm sinh viên vào chuyên ngành
    2.1 hiển thị menu con các chuyên ngành có thể thêm, để chọn
    2.2 tạo sinh viên dựa vào chuyên ngành đã chọn
 3.Hiển thị dách sách sinh viên của chuyên ngành nào đó
 4.Hiển sinh viên viên cao điểm nhất của mỗi chuyên ngành
 5.sắp xếp sinh viên theo chuyên ngành asc, và điểm desc
 6.quit
*/