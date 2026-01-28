
package manager;
import util.Inputer;
import java.util.ArrayList;
import data.Employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//được phép code trong file này, nhưng không được xóa
public class EmpListManager {
    private ArrayList<Employee> empList = new ArrayList<>();
    public void ADDDTOCHECK (){
        Employee e1 = new Employee("EMP100", "KKKK", 2003, 20000, "hehe");
        Employee e2 = new Employee("EMP101", "HHHH", 2012, 20890, "hihi");
        Employee e3 = new Employee("EMP102", "HEHEE", 2008, 5000, "hyhy");
        Employee e4 = new Employee("EMP103", "HEHEE", 2003, 90000, "hoho");
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
    }
    
    public void add(){
        String id;
        String name ;
        int yob;
        String tittle ;
        double salary;
        while(true){
            id = Inputer.getAString("Nhập vào id(EMPXXX trong đó X là số nguyên)", "ID phải đúng định dạng", "^EMP\\d{3}$");
            if(!checkId(id)){
                break;
            }else{
                System.out.println("ID đã tồn tại!!!");
            }
        }
        name = Inputer.getAString("Nhập tên của nhân viên: ", "Tên nhân viên không được bỏ trống");
        yob = Inputer.getAnInteger("Nhập năm sinh của sinh viên:", "Năm sinh không hợp lệ", 1950, 2025);
        salary = Inputer.getAnDouble("Nhập lương nhân viên: ", " Lương không hợp lệ");
        tittle = Inputer.getAString("Nhập chức vụ của nhân viên: ", "Chức vụ không được bỏ trống");
        Employee newEmployee = new Employee(id, name, yob, salary, tittle);
        empList.add(newEmployee);
        System.out.println("Đã thêm nhân viên thành công!!!");
    }
    public  boolean checkId(String id){
        for (Employee emp : empList) {
            if(emp.getiD().equals(id)){
                return true;
            }
        }
        return false;
    }
    public Employee checkIDObject(String id){
        for (Employee emp : empList) {
            if(emp.getiD().equals(id)){
                return emp;
            }
        }
        return null;
    }
    public void searchById(){
        String id;
        boolean check = false;
        id = Inputer.getAString("Nhập vào id cần tìm(EMPXXX trong đó X là số nguyên)", "ID phải đúng định dạng", "^EMP\\d{3}$");
        for (Employee empl : empList) {
            if(empl.getiD().equals(id)){
                empl.showInfor();
                check = true;
            }
        }
        if(check == false){
            System.out.println("Không tìm thấy thông tin nhân viên!!");
        }
    }
    
    public void updateInfor(){
        Employee empToUpdate;
        
        String id = Inputer.getAString("Nhập vào id cần update(EMPXXX trong đó X là số nguyên)", "ID phải đúng định dạng", "^EMP\\d{3}$");
        empToUpdate = checkIDObject(id);
        if(empToUpdate == null){
            System.out.println("Không tìm thấy nhân viên!!");
        }else{
            double salary = Inputer.getAnDouble("Nhập lương nhân viên cần cập nhập: ", " Lương không hợp lệ");
            empToUpdate = new Employee(empToUpdate.getiD(), empToUpdate.getName(),empToUpdate.getYob(), salary ,empToUpdate.getTitle());
           //empToUpdate.setSalary(Inputer.getAnDouble("Nhập lương nhân viên cần cập nhập: ", " Lương không hợp lệ"));
        }

    }
    
    public void removeEmp() {
        String id;
        id = Inputer.getAString("Nhập vào id cần xóa(EMPXXX trong đó X là số nguyên)", "ID phải đúng định dạng", "^EMP\\d{3}$");
        Iterator<Employee> it = empList.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getiD().equals(id)) {
                it.remove(); 
                found = true;
                System.out.println("Đã xóa thành công");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên");
        }

    }
    /*
    List<Employee> toRemove = new ArrayList<>();

    for (Employee emp : empList) {
        if (emp.getId().equals("EMP100")) {
            toRemove.add(emp);
        }
    }

    // Xóa sau khi duyệt xong
    empList.removeAll(toRemove);
    
    */
    public void showAll(){
        for (Employee employee : empList) {
            employee.showInfor();
        }
    }
    public void sortOrderBySalaryAsc(){
            Comparator<Employee> sortBySalary = new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getSalary() > o2.getSalary() ? 1 : -1;
                }
            };
        Collections.sort(empList,sortBySalary);
       
    }
  
    
    public void getListEmpByTitle(){
        boolean check = false;
        String tittle = Inputer.getAString("Nhập chức vụ cần tìm: ", "Chức vụ không được bỏ trống");
        
        for (Employee em : empList) {
            if(em.getTitle().equals(tittle)){
                em.showInfor();
                check = true;
            }
        }
        if(check == false){
            System.out.println("Không có chức vụ cần tìm");
        }
       
    }
}
/*
*/
//1.Thêm nhân sự vào danh sách
//2.Tìm kiếm thông tin nhân sự bằng id
//3.Cập nhật lương của nhân sự bằng id
//4.xóa thông tin nhân sự bằng id
//5.sắp xếp nhân sự theo lương tăng dần
//6.Hiển thị danh sách nhân sự theo chức danh cần tìm