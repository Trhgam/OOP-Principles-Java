
package data;
//Class Triangle là cái khuôn chuyên đúc ra các hình tam giác
public class Triangle {
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;
    //khong nen tạo các thuộc tính như chu vi và diện tích 
    //1.nếu mình tạo thì nó sẽ cần có getter và setter 
    //vậy thì nếu setPriMeter thì cạnh nào sẽ thay đổi
    //2.chu vi đc cấu thành từ 3 cạnh:
    //       nếu tính chu vi rồi sau đó thay đổi 1 cạnh bất kì 
    //          thì kết quatr tính chu vi trước đó bị cũ cần phải tính lại (cực)
    //các thuộc tính có thể suy ra từ thuộc tính trước đó thì không nên lưu 

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public Triangle() {
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public double getPeriMeter() {
        return edgeA + edgeB + edgeC;
    }
    public double getArea() {
        double p = this.getPeriMeter()/2;
        return Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
    }
    public void showInfor(){
        String str = String.format("Triangle     |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f"
                                ,edgeA,edgeB, edgeC, getPeriMeter(), getArea());
        System.out.println(str);
    }
}
