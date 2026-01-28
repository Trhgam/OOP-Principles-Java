package data;

import java.util.*;

public class MajorList extends ArrayList<Major> {
    public void addMajor(Major major) {
        this.add(major);
    }
    public void showInfor() {
        System.out.println("|MId       |Name          |Room |");
        for (Major major : this) {
            major.showInfor();
        }
    }
    //create a method to add new major by enter from keyboard
    public void addMajorByKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MId: ");
        String MId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Room: ");
        int room = scanner.nextInt();
        Major major = new Major(MId, name, room);
        this.add(major);
    }
}
