
package runtime;

import list.Cabinet;
import util.Menu;


public class Program {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu quản lý thú cưng");
        mainMenu.addNewOpt("Thêm mới 1 con cún");
        mainMenu.addNewOpt("Thêm mới 1 con mèo");
        mainMenu.addNewOpt("In ra danh sách thú cưng");
        mainMenu.addNewOpt("Tìm kiếm thú cưng theo tên");
        mainMenu.addNewOpt("Update thú cưng theo id");
        mainMenu.addNewOpt("Remove thú cưng theo id");
        mainMenu.addNewOpt("Sắp xếp thú cưng theo trọng lượng");
        mainMenu.addNewOpt("Save to file and Quiz");
        Cabinet cabinet = new Cabinet();
        cabinet.loadFromFile();
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
                    cabinet.task7();
                    break;
                }
                case 8: {
                    cabinet.saveToFile();
                    System.out.println("Pyeeeee");
                    return;
                }

            }
        }
    }
}
/*
1 xóa danh sách
2 đưa url về file
3 biến line thành object

*/
/*
Viết 1 chương trình quản lý thú cưng (DOG | CAT)
    1. Thêm mới 1 con cún
    2. Thêm mới 1 con mèo
    3. in ra danh sách thú cưng
    4. tìm kiếm thú cưng theo tên
    5. update thú cưng theo id
    6. remove thú cưng theo id
    7. sắp xếp thú cưng theo trọng lượng
    8. save file and quit

    khi thêm mới id của pet k được trùng với id ở trong danh sách
    id của pet phải thỏa theo format "D001| C001"
    
    một con Pet có nhửng thuộc tính id, owner , color, weight , method showInfor
    Dog: necklace
    Cat: ribbon
    yêu cầu chung: nhập chuẩn | nhập bậy bạ là chữi

*/