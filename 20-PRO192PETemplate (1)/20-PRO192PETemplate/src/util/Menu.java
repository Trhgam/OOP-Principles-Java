
package util;
// là cái khuôn chuyên tạo Menu , cần tạo menu thì gọi khuôn ra đúc 

import java.util.ArrayList;

public class Menu {
    private String title;
    private ArrayList<String> optionList;

    public Menu(String title) {
        this.title = title;
        optionList = new ArrayList<>();
    }
    //
    public void addNewOpt(String newOtp){
        this.optionList.add(newOtp);
    }
    //
    public void print(){
        System.out.println(this.title);
        int count = 1;
        for (String opt : optionList) {
            System.out.println(count + "." + opt);
            count++;
        }
    }
    //
   
    public  int getChoice(){
        return Inputer.getAnInteger("Nhập lựa chọn của bạn", "Lua chon phai tu 1 den : " + 
                this.optionList.size(), 1, this.optionList.size());
    }
    
}
