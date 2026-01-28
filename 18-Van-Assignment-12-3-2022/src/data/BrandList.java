
package data;

import java.util.ArrayList;
import java.util.StringTokenizer;
import util.FileHandler;
import util.Inputer;
import util.Menu;


public class BrandList  extends ArrayList<Brand>{
    //theo oop nên bản thân mk là danh sách -> muốn
    // brandlist thì là this
    
    FileHandler<Brand> fh_brand = new FileHandler<Brand>(){
        @Override
        public Brand handleLine(String line) {
         StringTokenizer st = new StringTokenizer(line, ",");
         String brandID = st.nextToken().trim();
         String brandName = st.nextToken().trim();
         String subStr = st.nextToken().trim(); //nestedString 
         st = new StringTokenizer(subStr, ":");
         String soundBrand = st.nextToken().trim();
         double price = Double.parseDouble(st.nextToken().trim());
         // tạoo brand từ thông tin đã chặt đc
         Brand brand = new Brand(brandID, brandName, soundBrand, price);
         return brand;
        }  
    };
    public boolean loadFromFile(String filename){
        return fh_brand.load(filename, this);
    }
    public boolean saveToFile(String filename){
        return fh_brand.save(this, filename);
    }
    public int searchID (String bID){ //search index by id
        for(int i = 0; i <= this.size() - 1 ;i++){
            if(this.get(i).getBrandID().equals(bID)){
                return i;
            }
        }
        return -1;
    }
    public Brand getUserChoice(){
        Menu<Brand> brandsMenu = new Menu("Menu of Brands"); 
        return brandsMenu.ref_getChoice(this); // cung cấp giá trị 
       
    }
    public void addBrand(){
        String brandID;
        System.out.println("Create a Brand");
        while(true){
            brandID = Inputer.getAString("Input brandID", "brandID is require");
            if(!isDupplicate(brandID)){
                break;
            }else{
                System.out.println("BrandID has been used");
            }
        }
        String brandName = Inputer.getAString("Input brandName", "brandID is require");
         String soundBrand = Inputer.getAString("Input brandname", "brandID is require");
        double price = Inputer.getAnDouble("Input price of sound brand",
        "price of sound brand must be a positive real number", 
                    0,Double.MAX_VALUE);
            Brand newBrand = new Brand(brandID, brandName, soundBrand, price);
            this.add(newBrand);
        System.out.println("Addition successfully");
    }
    //hàm kiểm tra trùng: tìm trả ra boolean 
    public void updateBrand(){
        //hàm giao tiếp void xin xử lý và hiển thị kq đã tìm đc
        String brandID;
        System.out.println("Update information of brand");
        brandID = Inputer.getAString("Input brandID to update", "brandID is require");
        Brand brand = findBrandByBrandID(brandID);
        if(brand == null){
            System.out.println("The brand doesn't exist");
            return;
        }
        System.out.println("Information of brand before updating");
        System.out.println(brand);
        String brandName = Inputer.getAString("Input brandName", "brandID is require");
        String soundBrand = Inputer.getAString("Input brandName", "brandID is require");
        double price = Inputer.getAnDouble("Input price of sound brand",
                "price of sound brand must be a positive real number",
                0, Double.MAX_VALUE);
        //set
        brand.setBrandName(brandName);
        brand.setSoundBrand(soundBrand);
        brand.setPrice(price);
        System.out.println("Information of brand after updating");
        System.out.println(brand);
    }
    public  boolean isDupplicate(String brandID){
        for (Brand brand : this) {
            if(brand.getBrandID().equals(brandID)){
                return true;
            }
        }
        return false;
    }
    public  Brand findBrandByBrandID(String brandID){
        for (Brand brand : this) {
            if(brand.getBrandID().equals(brandID)){
                return brand;
            }
        }
        return null;
    }
    public void searchBrand(){
           //hàm giao tiếp void xin xử lý và hiển thị kq đã tìm đc
        String brandID;
        System.out.println("Search information of brand");
        brandID = Inputer.getAString("Input brandID to update", "brandID is require");
        Brand brand = findBrandByBrandID(brandID);
        if(brand == null){
            System.out.println("The brand doesn't exist");
            return;
        }
        System.out.println("Information of brand");
        System.out.println(brand);
    }
    public void listBrands(){
        for (Brand brand : this) {
            System.out.println(brand);
        }
        if(this.isEmpty()){
            System.out.println("Nothing to print");
        }
    }
}
