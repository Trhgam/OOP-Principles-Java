
package data;

public class Student {
    private String id;
    private String fname;
    private String lname;
    private double score;

    public Student(String id, String fname, String lname, double score) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getScore() {
        return score;
    }
    public void show(){
        String str = String.format("%-20s|%-20s|%-20s|%5.2f",
                                    id,fname , lname, score);
        System.out.println(str);
    }
    
}
