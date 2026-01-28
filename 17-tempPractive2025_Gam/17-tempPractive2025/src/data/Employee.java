package data;

//thỏa thích sáng tạo ở đây
public class Employee {
    private String iD;
    private String name;
    private int yob;
    private double salary;
    private String title;

    public Employee(String iD, String name, int yob, double salary, String title) {
        this.iD = iD;
        this.name = name;
        this.yob = yob;
        this.salary = salary;
        this.title = title;
    }

    
   
    public Employee() {
    }

    public String getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }
    
    public void showInfor(){
        String str = String.format("%s|%s|%d|%.2f|%s", iD,name,yob,salary,title);
        System.out.println(str);
    }

    public Employee withNewSalary(double newSalary) {
    return new Employee(this.iD, this.name,this.yob,newSalary, this.title);
    }
    @Override
    public String toString() {
         return String.format("%s|%s|%d|%.2f|%s", iD,name,yob,salary,title);
    }
   
}
