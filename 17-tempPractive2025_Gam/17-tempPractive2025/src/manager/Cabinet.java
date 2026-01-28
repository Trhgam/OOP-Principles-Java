package manager;
/**
 * thêm các task cần thiết ở file này
 */
public class Cabinet {
    private EmpListManager empListManager = new EmpListManager();
    public void addData(){
        empListManager.ADDDTOCHECK();
    }
    public void task1(){
        empListManager.add();
    }
    public void task2(){
        empListManager.searchById();
    }
    public void task3(){
        empListManager.updateInfor();
    }
    public  void task4(){
        empListManager.removeEmp();
    }
    public  void task5(){
        empListManager.sortOrderBySalaryAsc();
        empListManager.showAll();
    }
    public  void task6(){
        empListManager.getListEmpByTitle();
        
    }
}
//1.Thêm nhân sự vào danh sách
//2.Tìm kiếm thông tin nhân sự bằng id
//3.Cập nhật lương của nhân sự bằng id
//4.xóa thông tin nhân sự bằng id
//5.sắp xếp nhân sự theo lương tăng dần
//6.Hiển thị danh sách nhân sự theo chức danh cần tìm