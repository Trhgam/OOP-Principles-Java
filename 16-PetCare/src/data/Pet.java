
package data;

import util.Inputer;


public abstract class Pet implements Comparable<Pet>{
    //attribute
    protected String id;
    protected String owner;
    protected String color;
    protected double weight;
    //constructer

    public Pet() {
    }

    public Pet(String id, String owner, String color, double weight) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.weight = weight;
    }
    //constructer full for read file
    //getter
    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
    //showInfor()
    public abstract void showInfor();
    //inputInfor
    public void inputInfor(){
        this.owner = Inputer.getAString("Nhập chủ sở hữu của thú cưng: ", 
                            "Chủ sở hữu không được bỏ trống");
        this.color = Inputer.getAString("Nhập màu sắc của thú cưng: ", 
                            "Màu sắc không được bỏ trống");
        this.weight = Inputer.getAnDouble("Nhập cân nặng của thú cưng: ",
                            "Cân nặng phải từu 1 đến 100",
                            1, 100);
    }
    public void update(){
        this.color = Inputer.getAString("Nhập màu sắc mới của thú cưng: ", 
                            "Màu sắc không được bỏ trống");
        this.weight = Inputer.getAnDouble("Nhập cân nặng mới của thú cưng: ",
                            "Cân nặng phải từu 1 đến 100",
                            1, 100);
    }

    @Override
    public int compareTo(Pet that) {
      if(this.getWeight() > that.getWeight()){
          return 1;
      }
      else{
          return -1;
      }
    }
    
}
