
package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import util.FileHandler;
import util.Inputer;



public class CarList extends ArrayList<Car>{
    private BrandList brandList ;

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }
    
  
   private FileHandler<Car> fh_car = new FileHandler<Car>() {
        @Override
        public Car handleLine(String line) {
            //line 
            StringTokenizer st = new StringTokenizer(line, ",");
            String carID = st.nextToken().trim();
            String brandID = st.nextToken().trim();
            String color = st.nextToken().trim();
            String frameID = st.nextToken().trim();
            String engineID = st.nextToken().trim();
            Brand brand = brandList.findBrandByBrandID(brandID);
            Car car = new Car(carID, brand, color, frameID, engineID);
            return car;
        }
    };

    public boolean loadFromFile(String filename) {
        return fh_car.load(filename, this);
        //this là class chứa nó ==> CarList
    }
    public boolean saveToFile(String filename){
        return  fh_car.save(this, filename);
    }
    public int searchID (String ID){
        for(int i = 0;i< this.size();i++){
            if(this.get(i).getCarID().equals(ID)){
                return i;               
            }
        }
        return -1;
    }
    public int searchFrame (String frameID){
        for(int i = 0;i< this.size();i++){
            if(this.get(i).getFrameID().equals(frameID)){
                return i;               
            }
        }
        return -1;
    }
    public int searchEngine (String engineID){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEngineID().equals(engineID)) {
                return i;              
            }
        }
        return -1;
    }
    public void addCar(){
        System.out.println("Add a new car");
        String carID;
        String frameID;
        String engineID;
        while(true){
            carID = Inputer.getAString("Input CarID","CarID is required");
            if(searchID(carID) != -1){
                System.out.println("CarID has bên used");
            }else{
                break;
            }
        }
        //brand
        Brand brand = brandList.getUserChoice();
        //color 
        String color = Inputer.getAString("Input color Car", "Color is required");
        //frameID
        while(true){
            frameID = Inputer.getAString("Input frameID",
                    "frameID is required,"
                    + "^F\\d{5}$");
            if(searchFrame(frameID) != -1){
                System.out.println("FrameID has been used");
            }else{
                break;
            }
        }
         while(true){
            engineID = Inputer.getAString("Input engineID",
                    "engineID is required",
                    "^E\\d{5}$");
            if(searchEngine(engineID) != -1){
                System.out.println("engineID has been used");
            }else{
                break;
            }
        }
        Car newCar = new Car(carID, brand, color, frameID, engineID);
        this.add(newCar);
        System.out.println("Addition successfully");
    }
    public void printBasedBrandName (){
        boolean check = false;
        String aPartOfBrandName = Inputer.getAString("Input aPartOfBrandName", 
                "aPartOfBrandName is required");
        for (Car car : this) {
            if (car.getBrand().getBrandName().contains(aPartOfBrandName)) {
                System.out.println(car.screenString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Not exist");
        }
    }
    //sql %{aPartOfBrandName}%  == constain 
    public boolean removeCar(){
        System.out.println("Remove a car");
        String carID = Inputer.getAString("Input carID , you wanna delete",
                "CarIS is required");
        int pos = searchID(carID);// -1 || != -1
        if(pos == -1 ){
            System.out.println("Car doesn't exist");
            return false;
        }
        System.out.println("Xóa Deleting is successfully");
        this.remove(pos);//có thể xóa bằng vị trí
        return true;
    }
    public boolean updateCar(){
        System.out.println("Update a car");
        String frameID;
        String engineID;
        String carID = Inputer.getAString("Input carID , you wanna delete",
                "CarIS is required");
        int pos = searchID(carID);// -1 || != -1
        if (pos == -1) {
            System.out.println("Car doesn't exist");
            return false;
        }
        System.out.println("Car ìnormation before updating");
        System.out.println(this.get(pos).screenString());
        //
        //brand
        Brand brand = brandList.getUserChoice();
        //color 
        String color = Inputer.getAString("Input new color Car", "Color is required");
        //frameID
        while (true) {
            frameID = Inputer.getAString("Input new frameID",
                    "frameID is required,"
                    + "^F\\d{5}$");
            if (searchFrame(frameID) != -1) {
                System.out.println("FrameID has been used");
            } else {
                break;
            }
        }
        while (true) {
            engineID = Inputer.getAString("Input new engineID",
                    "engineID is required",
                    "^E\\d{5}$");
            if (searchEngine(engineID) != -1) {
                System.out.println("engineID has been used");
            } else {
                break;
            }
        }
        //xin xong set, set trực tiếp không qua update nữa 
        this.get(pos).setBrand(brand);
        this.get(pos).setColor(color);
        this.get(pos).setFrameID(frameID);
        this.get(pos).setEngineID(engineID);
        System.out.println("Information of  car after updating");
        System.out.println(this.get(pos).screenString());
        return true;
    }
    public void listCars(){
        System.out.println("List of cars");
        Collections.sort(this);
        for (Car car : this) {
            System.out.println(car.screenString());
        }
        if(this.isEmpty()){
            System.out.println("Nothing to print");
        }
    }
    
    
}
