
package runtime;

import data.Major;
import data.Student;
import data.MajorsList;
import data.StudentsList;

import java.util.Scanner;


public class Program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        MajorsList majorList = new MajorsList();
        //add student vào list student để dùng trong main
        StudentsList studentList = addStudentToMain();
        majorList = addMajorToMain();// add list de dung 
        while (true) {
            int choice = myChoice();
            switch (choice) {
                case 1:{//1.Thêm chuyên ngành
                    majorList.displayAll();
                    majorList.addMajorByKeyBoard();
                    // add tu ban phim vao list
                    break;
                }
                case 2:{//2.Thêm sinh viên vào chuyên ngành
                    //2.1 hiển thị menu con các chuyên ngành có thể thêm, để chọn
                    majorList.displayAll();
                    //2.2 tạo sinh viên dựa vào chuyên ngành đã chọn
                    studentList.addNewStudentFromKeyBoard(majorList);
                    studentList.displayAll();
                    break;
                }
                case 3:{//3.Hiển thị dách sách sinh viên của chuyên ngành nào đó
                    majorList.displayAll();//show để chọn
                    studentList.diplayStudentByMID(majorList);
                    break;
                }
                case 4:{//4.Hiển sinh viên viên cao điểm nhất của mỗi chuyên ngành
                    
                    break;
                }
                case 5:{//5.Sắp xếp sinh viên theo chuyên ngành asc, và điểm desc
                    break;
                }
                case 6: {
                    System.out.println("Pyeeeeee");
                    return;
                }
            }

        }
        
    }
    public static StudentsList addStudentToMain(){
        //Tạo danh sách môn học
        MajorsList majorList = addMajorToMain();
        //Lấy các môn học ra
        Major m1 = majorList.get(0);
        Major m2 = majorList.get(1);
        Major m3 = majorList.get(2);
        Major m4 = majorList.get(3);
        //Tạo danh sách sinh viên
        StudentsList students = new StudentsList();
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
    public static MajorsList addMajorToMain(){
        //Tạo danh sách chuyên ngành
        MajorsList majorList = new MajorsList();
        //Tạo các chuyên ngành
        Major m1 = new Major("KDQT", "Kinh doanh quốc tế", 111);
        Major m2 = new Major("TT", "Truyền thông", 112);
        Major m3 = new Major("ATTT", "An toàn thông tin", 113);
        Major m4 = new Major("KTPM", "Kỹ thuật phần mềm", 114);
        //Thêm các chuyên ngành vào danh sách
        majorList.addNewMajor(m1);
        majorList.addNewMajor(m2);
        majorList.addNewMajor(m3);
        majorList.addNewMajor(m4);
        return majorList;
    }
    public static int myChoice() {
        System.out.println("------------------------MENU-----------------------");
        System.out.println("1.Thêm chuyên ngành");
        System.out.println("2.Thêm sinh viên vào chuyên ngành");
        System.out.println("3.Hiển thị dách sách sinh viên của chuyên ngành nào đó");
        System.out.println("4.Hiển sinh viên viên cao điểm nhất của mỗi chuyên ngành");
        System.out.println("5.Sắp xếp sinh viên theo chuyên ngành asc, và điểm desc");
        System.out.println("6.Quit");
        System.out.print("\nEnter your choice: ");

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 6) {
                    throw new Exception();
                }
                break;
            }   catch (Exception e) {
                System.out.print("Not true format Number! Enter a Integer again: ");
            }
        }
        return choice;
    }
    
}
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