
package manager;
//Cabinet là cái thùng chứa các hàm sẽ xuất hiện ở main
public class Cabinet {
    private MajorListManager majprListManager = new MajorListManager();
    private StudentListManagement studentListManager = new StudentListManagement();
    //
    public void iniData(){
        majprListManager.initData();
        studentListManager.iniData();
    }
    //
    public void task1(){
        majprListManager.addNewMajor();
    }
    
    public void task2(){
        String mid = majprListManager.getMIdByMenu();
        studentListManager.addNewStudentWithMId(mid);
    }
    public void task3(){
        studentListManager.showtudentListByMId();
        studentListManager.getHighestGpaStudentGroupByMajor();
    }
    public void task4(){
        studentListManager.getHighestGpaStudentGroupByMajor();
    }
    public void task5(){
        studentListManager.showStudentListOrderByMajorAscAndGpaDesc();
    }
    
}
