/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.pkg1studentmajormanagement;

import manager.Cabinet;
import util.Menu;

/**
 *
 * @author TranHongGam
 */
public class Program {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet();
        cabinet.iniData();
        Menu mainMenu = new Menu("Menu quan ly sinh vien");
        mainMenu.addNewOpt("Thêm chuyên ngành");
        mainMenu.addNewOpt("Thêm sinh viên vào chuyên ngành");
        mainMenu.addNewOpt("Hiển thị dách sách sinh viên của chuyên ngành nào đó");
        mainMenu.addNewOpt("Hiển sinh viên viên cao điểm nhất của mỗi chuyên ngành");
        mainMenu.addNewOpt("sắp xếp sinh viên theo chuyên ngành asc, và điểm desc");
        mainMenu.addNewOpt("quit");
        //inmenu
        while(true){
            mainMenu.print();
            //xin choice
            int choice = mainMenu.getChoice();
            //xử lý choice 
            switch (choice) {
                case 1:{
                    cabinet.task1();
                    
                    break;
                }
                case 2:{
                    cabinet.task2();
                    break;
                }
                case 3:{
                    cabinet.task3();
                    break;
                }
                case 4:{
                    cabinet.task4();
                    break;
                }
                case 5:{
                    cabinet.task5();
                    break;
                }
                case 6:{
                    System.out.println("Pyeeeee");
                    return;
                }
                
            }
        }
    }
}
