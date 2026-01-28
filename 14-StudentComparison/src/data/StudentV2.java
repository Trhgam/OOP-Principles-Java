
package data;

public class StudentV2 implements Comparable<StudentV2>{
    private String id;
    private String fname;
    private String lname;
    private double score;

    public StudentV2(String id, String fname, String lname, double score) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }

    public StudentV2() {
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

    @Override
    public int compareTo(StudentV2 that) {
        return this.getId().compareTo(that.getId());
    }
    /*
    ảnh hưởng thực thể 
    - ko là static ,phân mảnh , nhiều phiên bản 
    - Overide cùng tên cùng đầu vào nên sẽ ko bao giờ có hàm compare thứ 2 theo tiêu chí khác
    - tức là nó chỉ đc có 1 hàm so sánh về id và ko có thêm hàm so sánh về các tiêu chí  nữa
    - No flexible , tốn bộ nhớ 
    
    
    
    */
}
