
package list;

import data.Cat;
import data.Dog;
import data.Pet;
import java.util.ArrayList;
import util.Inputer;


public class PetList extends ArrayList<Pet>{
    
    //1. Thêm mới 1 con cún
    public void addNewDog(){
        Dog newDog = new Dog();
        newDog.inputInfor();
        this.add(newDog);
        System.out.println("Thêm con chó thành công");
    }
    // 2. Thêm mới 1 con mèo
     public void addNewCat(){
        Cat newCat = new Cat();
        newCat.inputInfor();
        this.add(newCat);
        System.out.println("Thêm con mèo thành công");
    }
    // 3. in ra danh sách thú cưng
     public void show(){
         boolean isFind = false;
         for (Pet pet : this) {
             pet.showInfor();
             isFind = true;
         }
         
         if(!isFind){
             System.out.println("Không có thú cưng trong danh sách");
         }
     }
    
     //tìm để confirm thì true false
     //tìmdể xóa ,để showw thì trả về Object
    public Pet findPetById(String id) {
        for (Pet pet : this) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }
    //4. tìm kiếm thú cưng theo id

    public void search() {
        String id = Inputer.getAString("Nhập mã thú cưng cần tìm: ", "Mã thú cưng ko được bỏ trống");
        Pet pet = findPetById(id);
        if(pet == null){
            System.out.println("Không tìm thấy thú cưng!!!");
            return;
        }
        System.out.println("Thông tin thú cưng tìm được là: ");
        pet.showInfor();
                
    }
    //6. remove thú cưng theo id
    public void remove() {
        String id = Inputer.getAString("Nhập mã thú cưng cần xóa: ", "Mã thú cưng ko được bỏ trống");
        Pet pet = findPetById(id);
        if(pet == null){
            System.out.println("Không tìm thấy thú cưng!!!");
            return;
        }
        System.out.println("Thông tin thú cưng đã bị xóa được là: ");
        pet.showInfor();
        this.remove(pet);
        System.out.println("Đã xóa thành công!!!");
                
    }
    // 5. update thú cưng theo id
    public void update() {
        String id = Inputer.getAString("Nhập mã thú cưng cần cập nhật: ", "Mã thú cưng ko được bỏ trống");
        Pet pet = findPetById(id);
        if (pet == null) {
            System.out.println("Không tìm thấy thú cưng!!!");
            return;
        }
        System.out.println("Thông tin thú cưng trước khi cập nhật là: ");
        pet.showInfor();
        //xin color weight necklace | ribbon
        //gọi hàm setter
        pet.update();
        System.out.println("Thông tin thú cưng sau khi cập nhật ");
        pet.showInfor();

    }
    //7. sắp xếp thú cưng theo trọng lượng
    
    

}
/*
 1. Thêm mới 1 con cún
    2. Thêm mới 1 con mèo
    3. in ra danh sách thú cưng
    4. tìm kiếm thú cưng theo id
    5. update thú cưng theo id
    6. remove thú cưng theo id
    7. sắp xếp thú cưng theo trọng lượng
    8. save file and quit
*/