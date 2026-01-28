
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TranHongGam
 */
public class MajorsList extends ArrayList<Major>{
    Scanner sc = new Scanner(System.in);
    public void displayAll(){
        for (Major thi : this) {
            thi.showInfor();
        }
    }
    //add Major
    public void addNewMajor(Major newMajor){
        this.add(newMajor);
    }
    //add Major by keyboard
    public void addMajorByKeyBoard(){
        String mID;
        String name;
        int room;
        System.out.println("Nhập mã ngành: ");
        mID= sc.nextLine();
        System.out.println("Nhập tên chuyên ngành:");
        name = sc.nextLine();
        System.out.println("Nhập số phòng học:");
        room = Integer.parseInt(sc.nextLine());
        Major newMajor = new Major(mID, name, room);
        this.add(newMajor);
        System.out.println("Addition Successfully!!!");
    }
}
