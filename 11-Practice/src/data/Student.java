
package data;

public class Student {
    private String SId;
    private String firstName;
    private String lastName;
    private int yob;
    private double Gpa;
    private Major major;

    public Student() {
    }

    public Student(String SId, String firstName, String lastName, int yob, double Gpa, Major major) {
        this.SId = SId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yob = yob;
        this.Gpa = Gpa;
        this.major = major;
    }

    public Student(Major major) {
        this.major = major;
    }

    public String getSId() {
        return SId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYob() {
        return yob;
    }

    public double getGpa() {
        return Gpa;
    }

    public Major getMajor() {
        return major;
    }
    
    public  void showInfor(){
       String str = String.format("|%-12s|%-12s|%-12s|%.2f|%5d|%s|",getSId(),getFirstName(),getLastName()
                                        ,getGpa(), getYob(), major.getName());
        System.out.println(str);
    }
    
}
/*
Student
  Sid, firstName, lastName, yob, Gpa,MId
  phểu rỗng, phễu có full đối số, phễu chỉ có MId
  getter
  showInfor

*/