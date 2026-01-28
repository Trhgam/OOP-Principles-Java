package com.practicalexam;

import java.util.Scanner;

import com.practicalexam.student.TemplateQuestion;
import util.Menu;

/**
 *
 * @author FPT University - HCMC
 * Java OOP Practical Exam Template
 */

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu here (if needed)
        Menu mainMenu = new Menu("Menu quản lí sinh viên");
        mainMenu.addNewOpt("Thêm sinh viên mới");
        mainMenu.addNewOpt("Cập nhật thông tin sinh viên dựa vào id");
        mainMenu.addNewOpt("Tìm kiếm thông tin sinh viên dựa vào id");
        mainMenu.addNewOpt("Xóa thông tin sinh viên dựa vào id");
        mainMenu.addNewOpt("Sắp xếp thông tin sinh viên dựa vào điểm tăng dần");
        mainMenu.addNewOpt("Thoát");

    	TemplateQuestion hello = new TemplateQuestion();
        // Your code here
    	int choice = 0;
        do {
            mainMenu.print();
            // Menu here (if needed)
            // Your code here
            choice = mainMenu.getChoice();
          
            switch (choice) {
                case 1: {
                    hello.insert();
                    break;
                }
                case 2: {
                    hello.update();
                    break;
                }
                case 3: {
                    hello.search();
                    break;
                }
                case 4: {
                    hello.remove();
                    break;
                }
                case 5: {
                    hello.sort();
                    break;
                }
                case 6: {
                    System.out.println("Pyeeeee");
                    return;
                }
                
                // Other case here!!!
            }
        } while (true);  // Modify the condition to exit the loop!!!
    }
    
}
