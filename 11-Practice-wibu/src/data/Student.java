
package data;


public class Student {
    private String SID;
    private String firstName;
    private String lastname;
    private int yob;
    private double gpa;
    private Major major;
   

    public Student() {
    }

    public Student(String SID, String firstName, String lastname, int yob, double gpa, Major major) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastname = lastname;
        this.yob = yob;
        this.gpa = gpa;
        this.major = major;
    }

    public int getYob() {
        return yob;
    }

    
    public Student(Major major) {

        this.major = major;
    }

    public String getSID() {
        return SID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public double getGpa() {
        return gpa;
    }

    public Major getMajor() {
        return major;
    }
    public void showInfor(){
        String str = String.format("|%-10s|%-10s|%-10s|%5d|%3f|%10s|",getSID(),
                                    getFirstName(), getLastname(), getYob(), getGpa(),
                                    major.getName());
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