
package data;

// la cai khuon de d uc ra rat nhieu hinh vuong
// Square is a Rectangle 
// Hinh vuong la hcnhat
//  con           cha
// 
// muc dich cua ke thua:
// - thua huong nhung gi nguoi kahc da lam tot roi
// - phat trien va doi moi nhung gi nguoi khac lam chua tot | chua co 
//khoi phuc lai ban thao chung khi nhan cha
// extends : mở rộng 
// con la phien ban mo rong cua cha 
// con = cha + vung mo rong
public class Square extends Rectangle{
    //liet ke cac prop cua rieng con 
     
    
    
    public Square(double edge, String color) {
        super(edge, edge, color);
    }

    @Override
    public void paint() {
        String str = String.format("Square   |%11.2f|%-10s|%5.2f|%5.2f|",
                                    width, color,
                                    getPerimeter(),getArea());
        System.out.println(str);
    }
    public  void hehe(){
        System.out.println("hehe");
    }
}
