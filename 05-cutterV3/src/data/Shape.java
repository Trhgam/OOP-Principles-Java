
package data;
//class shape la khuon tao ra cac loai hinh hoc 
//la cha cua moi loai hinh
//la cha cua tam giac , hcn , vuong,tron.
// + nó chỉ được chưa những điểm chung của con mà thôi 
//  ý nghĩa khác của kế thừa là khôi phục lại tất cả những gì hy sinh 
public abstract class Shape {
    protected String color;
    protected String owner;

    public Shape(String color, String owner) {
        this.color = color;
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }
    public abstract double getPeriMeter();
    public abstract double getArea();
    public abstract void paint();
        
    //tai sao phai luu getP getA paint 
    // vi day la nhung method ma cac con deu co
    // tai sao getP getA paint ko co body
    // vi k co 1 cthuc nao de tinh dc tat ca moi hinh hoc dc
    //nen phai bo trong => abs method => abs class
    
    //abs class la khuon bi thunng => ko duc dc object 
    // no tim 1 class khac de ke thua va va (implemet| lam ro)nhung lo thung 
    //(abs method| khai niem chua co dinh nghia)
    //neu class con va dc het thi co the duc object
    //con k thi class con se thanh abs class va tim 1 con khac
    
   
}



