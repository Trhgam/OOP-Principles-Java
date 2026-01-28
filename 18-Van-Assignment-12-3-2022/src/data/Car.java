
package data;

/**
 *
 * @author TranHongGam
 */
public class Car implements Comparable<Car>{
    private String carID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    public Car() {
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

 

    @Override
    public int compareTo(Car that) {
       int result = this.getBrand().getBrandName().compareTo(that.getBrand().getBrandName());
       if(result != 0){
           return result; // nếu ko bằng nhau thì swap đi
       }else{
           // nếu bằng nhau thì so tới carID
           return this.getCarID().compareTo(that.getCarID());
       }
    }
    //tạo chuỗi để ghi file gọn
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", carID, brand.getBrandID(), color, frameID, engineID);
    }
    //tạo chuỗi để viết app đẹp 
    public String screenString(){
        return String.format("%s,\n \t%s,%s,%s,%s", brand, carID, color, frameID, engineID);
    }
    
}
