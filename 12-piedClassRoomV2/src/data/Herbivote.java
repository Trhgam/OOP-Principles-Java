
package data;
// Herbivote vào hội nghĩa là con vật ăn cỏ nào cùng ham học
// thì ko thể gọi là ngu như bò được 
public abstract class Herbivote {
    protected String name;
    protected int yob;
    protected double weight;

    public Herbivote(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    
    
    //ko lam getter setter
    
    public abstract double study();
   //ko có thân vì mỗi con vật có cách học khác nhau
    //không áp đặt
    public abstract void showInfor();

}
