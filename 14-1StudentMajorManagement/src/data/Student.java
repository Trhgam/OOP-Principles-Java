
package data;

public class Student {
    private String sId;
    private String firstName;
    private String lastName;
    private int yob;
    private double gpa;
    private String mId;

    public Student(String sId, String firstName, String lastName, int yob, double gpa, String mId) {
        this.sId = sId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yob = yob;
        this.gpa = gpa;
        this.mId = mId;
    }

    

    public Student() {
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }
    
    public void showInfor(){
        String str = String.format("%5s|%-20S|%-20s|%4d|%5.2f|%2s",sId,
                firstName, lastName, yob, gpa,mId);
        System.out.println(str);
    }
}
/*
Student
  sid, firstName, lastName, yob, gpa,mId
  phểu rỗng, phễu có full đối số, phễu chỉ có MId
  getter
  showInfor

*/