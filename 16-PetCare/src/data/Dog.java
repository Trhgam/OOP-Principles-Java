
package data;

import util.Inputer;


public class Dog extends Pet {
    private String necklace;
    //constructer
    public Dog() {
    }

    public Dog(String necklace) {
        this.necklace = necklace;
    }

    public Dog( String id, String owner, String color, double weight,String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }

    public String getNecklace() {
        return necklace;
    }

    public void inputInfor(){
        this.id = Inputer.getAString("Nhập mã của chú cún của bạn: ",
                "Id không được bỏ trống và theo đính dạnh DXXX","^D\\d{3}$");
        super.inputInfor();
        this.necklace = Inputer.getAString("Nhập thông tin của vòng cổ", "Vòng cổ ko đc bỏ trống");
    }
    @Override
    public void showInfor() {
        String str = String.format("%4s|%20s|%20s|%6.2f|%s",id,owner, 
                color, weight, necklace);
        System.out.println(str);
    }

    @Override
    public String toString() {
        return  String.format("%4s|%20s|%20s|%6.2f|%s",id,owner, 
                color, weight, necklace);
    }

    @Override
    public void update() {
        super.update(); 
        this.necklace = Inputer.getAString("Nhập thông tin của vòng cổ mới", "Vòng cổ ko đc bỏ trống");
    }

    
    
}
