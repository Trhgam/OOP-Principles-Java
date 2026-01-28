
package util;
// là cái khuôn chuyên tạo Menu , cần tạo menu thì gọi khuôn ra đúc 

import java.util.ArrayList;

public class Menu<E> {
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
        return Inputer.getAnInteger("Nhập lựa chọn của bạn: ", "Lựa chọn phải từ 1 đến : " + 
                this.optionList.size(), 1, this.optionList.size());
    }
    public  E ref_getChoice(ArrayList<E> options){
        //hiển thị optionsList như 1 menu
        // options trong trg hợp này là brandList => E là Brand 
        int seq = 1;
        for (E option : options) {
            System.out.println(seq + "." + option.toString());
            seq++;
        }
        int choice = Inputer.getAnInteger("Input your choice: ", 
                " Your choice must be between 1 and " + options.size(), 
                1, options.size());
        return options.get(choice - 1);//txt - 1 so với option
    }
}
