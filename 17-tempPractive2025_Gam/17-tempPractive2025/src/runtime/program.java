
package runtime;

import manager.Cabinet;
import util.Menu;

public class program {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("-----------------Menu-----------------");
        mainMenu.addNewOpt("Thêm nhân sự vào danh sách:");
        mainMenu.addNewOpt("Tìm kiếm thông tin nhân sự bằng id");
        mainMenu.addNewOpt("Cập nhật lương của nhân sự bằng id");
        mainMenu.addNewOpt("xóa thông tin nhân sự bằng id");
        mainMenu.addNewOpt("sắp xếp nhân sự theo lương tăng dần");
        mainMenu.addNewOpt("Hiển thị danh sách nhân sự theo chức danh cần tìm");
        mainMenu.addNewOpt("Quit");
        //tạo menu ở đây
       //int choice = mainMenu.getChoice();
        Cabinet cabinet = new Cabinet();
        //
         cabinet.addData();
        while(true){
            //in menu ở đây
            mainMenu.print();
            int choice = mainMenu.getChoice();
           
            switch (choice) {
                case 1: {
                    cabinet.task1();
                    break;
                }
                case 2: {
                    cabinet.task2();
                    break;
                }
                case 3: {
                    cabinet.task3();
                    break;
                }
                case 4: {
                    cabinet.task4();
                    break;
                }
                case 5: {
                    cabinet.task5();
                    break;
                }
                case 6: {
                    cabinet.task6();
                    break;
                }
                case 7: {
                    System.out.println("Pye");
                    return;
                }
            }
        }
    }    
}
/*
Menu quản lý nhân sự (Employee)
//1.Thêm nhân sự vào danh sách:
        * cấm trùng id
//2.Tìm kiếm thông tin nhân sự bằng id
//3.Cập nhật lương của nhân sự bằng id
//4.xóa thông tin nhân sự bằng id
//5.sắp xếp nhân sự theo lương tăng dần
//6.Hiển thị danh sách nhân sự theo chức danh cần tìm
mô tả nhân sự:
    Employee: id(EMPXXX trong đó X là số nguyên), name, yob(từ 2000 - 1990), salary(lương 2000), title(chức danh)
        showInfor()

*/