
package manager;

import data.Major;
import java.util.ArrayList;
import util.Inputer;
import util.Menu;

/*
 1.function : MajorListManagement người quản lí dsach 
    - có danh sách
    - các method hỗ trợ cử lý dsach
 2.oop: tôi là list , trong tao có các method hỗ trợ xử lý tao
    đúc ra tượng rỗng , bắt nó tự đi xin = inputinfor
 */
public class MajorListManager {
    private ArrayList<Major> majorList = new ArrayList<>();
    public void initData(){
        this.majorList.add(new Major("SE", "Ky thuat phan mem", "R001"));
        this.majorList.add(new Major("AI", "Tri tue nhan tao", "R002"));
        this.majorList.add(new Major("ES", "Ngon ngu Anh", "R003"));
       
    }
    public void addNewMajor(){
        String mId ;
        //tạo mới Major
        //xin giá trị 
        //mID : String và cấm trùng
        while(true){
            mId = Inputer.getAString("Mã nhập chuyên ngành",
                    "Mã chuyên ngành ko đúng định dạng","^[A-Z]{2}$");
            if(findMajorByMId(mId)!= null){
                System.out.println("Mã chuyên ngành bị trùng ");
            }else{
                break;
            }
        }
        //name
        String name = Inputer.getAString("Nhập chuyen ngành", "Tên chuyuen ngành không được bỏ trống");
        //Room
        String room = Inputer.getAString("Nhập mã phòng ban(Rxxx)", "Mã phòng ban không đúng định dạng", "^R\\d{3}$");
        
        //rót vào phễu đúc
        Major newMajor = new Major(mId, name, room);
        this.majorList.add(newMajor);
        System.out.println("Thêm chuyên ngành thành công");
        //thêm, Major mới vào majorList
    }
    public Major findMajorByMId(String mid){
        for (Major major : majorList) {
             if(major.getMId().equals(mid)){
                 return major;
             }
        }
        return null;
    }
    //hàm hiển thị Majoralaist dạng menu và cho người dùng chọn
    public String getMIdByMenu(){
        //tạo Menu bằng Mảo List
        Menu majorMenu = new Menu("Danh sách chuyên ngành có thể chọn");
        for (Major major : majorList) {
            majorMenu.addNewOpt(major.toString());
        }
        //hiển thị menu cho người dùng chọn 
        majorMenu.print();
        int choice= majorMenu.getChoice();
        //retrurn mã chnganh đã chọn ra bên ngoài 
        return majorList.get(choice - 1).getMId();
    }














}
