
package runtime;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;


public class Program {
    public static void main(String[] args) {
        //make list to save shape
        Shape ds[] = new Shape[4];
        ds[0] = new Disk("Pink", "Tim", 2.0);
        ds[1] = new Rectangle("Purple", "Huong", 2, 3);
        ds[2] = new Square("Green", "Chu 6", 5);
        Disk d = new Disk("Red", "Mợ", 5.0);
        ds[3] = d;
        for (Shape s : ds) {
           s.paint();          
        }
//         Abs class là khuôn bị thủng ko đúc đc object 
//         nó sẽ tìm class con để vá và đúc object thay nó 
//         nhưng qua lười để tạo ra class con trung gian 
//         đôi khi ko biết class con đó nên là tên gì 
//         cái object đó chỉ tạo ra một lần duy nhất 
//  { dùng anonymous }  ==> / mượn gió bẻ măng 
//         anonymous kỹ thuật tạo ra object thông qa cái khuôn
//         bị thủng
//         mà ko muốn thông qa class con trung gian
//        
//         ưu điểm : ko cần class trung gian | đỡ đặt tên
//         nhược điểm : mỗi lần đúc là mỗi lần implement
        

//         áp dụng thực tế : 
        
        Shape p = new Shape("7Rbg", "Cha Ba") {
            @Override
            public double getPeriMeter() {
               return 50;
            }
            
            @Override
            public double getArea() {
               return 0;
            }
            
            @Override
            public void paint() {
                String str = String.format("ShapeXXX  |%-10s|%-10s|%5.2f|%5.2f|",owner, color,
                getPeriMeter(), getArea());
            }
        };//xong
    
    }
}
