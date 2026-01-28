/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.logging.Logger;

/**
 *
 * @author TranHongGam
 */
public class Major {
    private String MId;
    private String name;
    private String room;

    public Major(String MId, String name, String room) {
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

    public String getRoom() {
        return room;
    }
  
    public void showInfor(){
        String str = String.format("%2s|%-20s|%4s",MId,name,room);
        System.out.println(str);
    }

    @Override
    public String toString() {
        return String.format("%2s|%-20s|%4s",MId,name,room);
    }
    
}
/*
Major
  MId, name, room
  phễu rỗng, phễu full
  getter
  showInfor
*/