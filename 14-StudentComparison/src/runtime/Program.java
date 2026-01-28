
package runtime;

import data.Student;
import data.StudentV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*14-StudentManagement


Sort:
-Thuật toán
-Comparator : anh trọng tài
-Comparable : tính đố kị

*/

public class Program {

    public static void main(String[] args) {
        sortV1();// demo Comparator
        
        
        
        
    }
    public static void sortV1(){
        //tạo danh sách cần sắp xếp
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("SE1", "Lê", "An", 9));
        studentList.add(new Student("SE2", "Nguyễn", "Bình", 8.2));
        studentList.add(new Student("SE3", "Võ", "Cường", 7));
        studentList.add(new Student("SE4", "Quốc", "Dũng", 9.9));
        studentList.add(new Student("SE5", "Hoài", "Em", 5));
        //tạo anh trọng tài
        Comparator<Student> ordById = new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu1.getId().compareTo(stu2.getId());
            }
        };
        Collections.sort(studentList, ordById);
        /*
        Comparator là 1 interface có method la compare 
        nếu muốn tạo ra 1 anh trọng tài phụv vụ cho việc sort thì phải implement
        method tên compare()
        cung cấp tiêu chí đánh giá thắng thua cho anh trọng tài trc khi sắp xếp 
        */
           
    }
    public static void sortV2(){
        ArrayList<StudentV2> studentListV2 = new ArrayList<>();
        studentListV2.add(new StudentV2("SE1", "Lê", "An", 9));
        studentListV2.add(new StudentV2("SE2", "Nguyễn", "Bình", 8.2));
        studentListV2.add(new StudentV2("SE3", "Võ", "Cường", 7));
        studentListV2.add(new StudentV2("SE4", "Quốc", "Dũng", 9.9));
        studentListV2.add(new StudentV2("SE5", "Hoài", "Em", 5));
        //Collections.sort(List stu<Comparable>)
        // duyệt danh sách kêu mỗi student tự so sánh với người khác ==> 1 !1
        // Student.compareTo(Student another)
        // cần to do list == Interface Comparable<T>
        //               -->       compareTo(T another)
    }
}





//Comparator ==> Collections                |anonymous
//   Collection.sort(list , Comparator)     |


//Comparator<T>(){
//  compare(T t1, T t2){
