
package runtime;

import data.Herbivote;
import data.Horse;
import data.Hunter;
import data.Monkey;
import java.util.ArrayList;

/*
Anh Điệp dạy kèm ngkh lấy 10 điểm thấy chán quá 
nên muốn tăng độ khó hơn nữa ,
anh quyết định vào rừng mở lớp dạy khỉ,ngựa 
học lập trình và chinh phục 10 điểm 
quản lí danh sách học sinh tỏnh lớp thú này 

khôi phục lại trạng thái trc khi nhận cha 
nếu ko thì k thể đưa về cung 1 tập hợp;

*/
public class Program {

    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("Abu", 1994, 30);
        Horse h1 = new Horse("Rarity", 2015, 9, "none");
        Herbivote h2 = new Horse("Roach", 2019, 170, "Grey");
        ArrayList<Herbivote> stuList = new ArrayList<>();
        stuList.add(m1);
        stuList.add(m2);
        stuList.add(h1);
        stuList.add(h2);
        // trời vào cuối năm  trở lạnh
        // có 1 con vật j đó ko biết 
        // nhỏ bé mắc đồ ksin mít ,chui vào lớp xin học
        // mình cho nó học, những mà nó mặc đò kín mít 
        // ko biết nó là con gì , chỉ biết là nó ăn cỏ thôi
        // làm gì để lưu được nó đây
        // dùng anonymous vừa rót giá trị vừa vá 
        Herbivote xxx = new Herbivote("XXX", 2025, 4) {
            @Override
            public double study() {
                return 80;
            }
            
            @Override
            public void showInfor() {
                String str = String.format("XXXXXX |%-15s|%4d|%-6.2f|%5.2f|",
                        name, yob, weight, study());
                System.out.println(str);
            }
        };
        stuList.add(xxx);
        //lớp lại có thêm  1 bạn mới vào lớp 
        //bạn này làm lơp snhoosn nháo , sôi động
        //bác thợ săn
        Hunter hu1 = new Hunter("Thợ săn vượn", 1999, 70, "Nỏ");
        Hunter hu2 = new Hunter("Mắt diều hâu", 1999, 50, "Cung");
        // không thể nhét hunter vào dsach được vì nó quá khác  về mặt sinh học 
        //nhưng mk phải tìm cách nhét vô vì mình cần lưu trữ 
        
        
        
    }
    
}
