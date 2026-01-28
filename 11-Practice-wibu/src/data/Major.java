
package data;

import java.util.Scanner;

public class Major {
    private String MId;
    private String name;
    private int room;
    

    public Major(String MId, String name, int room) {
        this.MId = MId;
        this.name = name;
        this.room = room;
    }

    public Major() {
    }

    public String getMId() {
        return MId;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }
    
    public void showInfor(){
        String str = String.format("|%-10s|%-10s|%4d|",getMId(), 
                                    getName(), getRoom());
        System.out.println(str);
    }

}
/*
Major
  MId, name, room
  phễu rỗng, phễu full
  getter
  showInfor
*/