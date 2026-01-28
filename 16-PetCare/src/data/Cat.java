
package data;

import util.Inputer;


public class Cat extends Pet {
    private String ribbon;
    //constructer
    public Cat() {
    }

    public Cat(String ribbon) {
        this.ribbon = ribbon;
    }

    public Cat( String id, String owner, String color, double weight,String ribbon) {
        super(id, owner, color, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    
    public void inputFor(){
        this.id = Inputer.getAString("Nhập mã của chú mèo của bạn: ",
                "Id không được bỏ trống và theo đính dạnh CXXX","^C\\d{3}$");
        super.inputInfor();
        this.ribbon = Inputer.getAString("Nhập thông tin của ruy băng", "Ruy băng ko đc bỏ trống");
    }
    @Override
    public void showInfor() {
        String str = String.format("%4s|%20s|%20s|%6.2f|%s",id,owner, 
                color, weight, ribbon);
        System.out.println(str);
    }

    @Override
    public String toString() {
        return  String.format("%4s|%20s|%20s|%6.2f|%s",id,owner, 
                color, weight, ribbon);
    }

    @Override
    public void update() {
        super.update(); 
        this.ribbon = Inputer.getAString("Nhập thông tin của ruy băng mới", "Ruy băng ko đc bỏ trống");
    }

    
    
}
