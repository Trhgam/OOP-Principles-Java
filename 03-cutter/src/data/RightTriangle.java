
package data;

//tam giác vuông và tam giác 
//mối quan hệ kế thừa là (is a)

//nếu như không nhận cha con thì sao ?
//thì mỗi class đc mô tả độc lập vẫn tạo object bth
// nhưng không về chung 1 tập họp 
//nhưng lưu trữ thì cần bỏ vào cùng 1 tập hợp 
//tại sao cần kế thừa | mục đích của kế thừa 
// - thừa hưởng những gì ngkh đã làm tốt rồi 
// - phát triển và mở rộng những gì ngkh chưa làm | làm chưa tốt
//quy tắc bất hiếu 

public class RightTriangle extends Triangle{
     //những prop cha em không có | prop đặc biệt của riêng em 
    //trong trg thợp này RigthTriangle không có gì khác cha
    
    public RightTriangle(double edgeA, double edgeB) {
        super(edgeA, edgeB, Math.sqrt(edgeA*edgeA + edgeB*edgeB));
    }
    // super: bề trên => new Cha() 
    //super luôn là dòng lệnh đầu tiên trong constructer của con
    
    public RightTriangle() {
    }

    @Override
    public void showInfor() {
        String str = String.format("RightTriangle|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f"
                                ,getEdgeA(),getEdgeB(), getEdgeC(), getPeriMeter(), getArea());
        System.out.println(str);
    }
    
}
//App 04-CutterV2 quản lí hình chữ nhật Rectangle width-height-color 
                        // hình vuông 
                        // hình tròn 