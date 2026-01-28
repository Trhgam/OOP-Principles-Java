
package data;


public class Major {
    private String MId;
    private String name;
    private int room;

    public Major() {
    }

    public Major(String MId, String name, int room) {
        this.MId = MId;
        this.name = name;
        this.room = room;
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
        String str = String.format("|%-12s|%16s|%4d|",getMId(),
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