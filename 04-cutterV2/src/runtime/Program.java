
package runtime;

import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) {
        Rectangle rel = new Rectangle(2,5,"Tím");
        Square sq1 = new Square(3, "Đỏ");
        //khai cha new con 
        Rectangle sq2 = new Square(5, "Cam");
        //rel ko hehe
        //sq1 dung dc hehe
        //sq2 ko dung hehe 
         //khai cha new con  thi object do co the truy cap nhu 
         //thang cha 
         //va các method bị override 
        //drifting pointer     keo con tro xuong 
        ((Square)sq2).hehe();
        // lưu 
        Rectangle ds[] = new Rectangle[3];
        ds[0] = rel;
        ds[1] = sq1;
        ds[2] = sq2;//sq2 dxem la hcn
        //for each : mỗi | Iterator : thằng khả lập
        for (Rectangle item : ds) {
            item.paint();
        }
        
    }
}





