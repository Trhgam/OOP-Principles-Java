package data;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList extends ArrayList<Student> {
    public void addStudent(Student student) {
        this.add(student);
    }

    public void showInfor() {
        System.out.println("|SID       |FirstName |LastName|YOB  |GPA   |Major     |");
        for (Student student : this) {
            student.showInfor();
        }
    }

    //create a method to add new student by enter from keyboard
    public void addStudentByKeyboard(MajorList majorList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter SID: ");
        String SID = scanner.nextLine();
        System.out.print("Enter FirstName: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter LastName: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter YOB: ");
        int yob = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());
        System.out.println("Choose Major: ");
        majorList.showInfor();
        System.out.print("Enter Major orders: ");
        int order = Integer.parseInt(scanner.nextLine());
        Major major = null;
        this.addStudent(new Student(SID, firstName, lastName, yob, gpa, majorList.get(order - 1)));
    }

    //create method to display student by major
    public void showStudentByMajor(MajorList majorList) {
        //Chọn chuyên ngành theo sô thứ tự
        System.out.println("Choose Major: ");
        majorList.showInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Major orders: ");
        int order = Integer.parseInt(scanner.nextLine());
        Major major = majorList.get(order - 1);
        //In ra danh sách sinh viên theo chuyên ngành
        System.out.println("|SID       |FirstName |LastName|YOB  |GPA   |Major     |");
        for (Student student : this) {
            if (student.getMajor().getMId().equals(major.getMId())) {
                student.showInfor();
            }
        }
    }

}
