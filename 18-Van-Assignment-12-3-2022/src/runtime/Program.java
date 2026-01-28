
package runtime;

import data.BrandList;
import data.CarList;
import util.Inputer;
import util.Menu;


public class Program {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Minh Trang BWM ShowRoom Application");
        mainMenu.addNewOpt("List all brands");
        mainMenu.addNewOpt("Add a new brand ");
        mainMenu.addNewOpt("Search a brand based on its ID");
        mainMenu.addNewOpt("Update a brand");
        mainMenu.addNewOpt("Save brands to the file, named brands.txt");
        mainMenu.addNewOpt("List all cars in ascending order of brand names");
        mainMenu.addNewOpt("List cars based on a part of an input brand name");
        mainMenu.addNewOpt("Add a car");
        mainMenu.addNewOpt("Remove a car based on its ID ");
        mainMenu.addNewOpt("Update a car based on its ID");
        mainMenu.addNewOpt("Save cars to file, named cars.txt");
        String baseURL = "D:\\PIEDTEAM_JAVA\\18-Van-Assignment-12-3-2022\\";
        BrandList bl = new BrandList();
        CarList cl = new CarList(bl);
        bl.loadFromFile(baseURL + "brands.txt");
        cl.loadFromFile(baseURL + "cars.txt");
        //triển khai menu
        while(true){
            mainMenu.print();//in menu
            int choice = Inputer.getAnInteger("Input your choice", "choice is required");
            switch(choice){
                case 1:{
                    bl.listBrands();
                    break;
                }
                case 2:{
                    bl.addBrand();
                    break;
                }
                case 3:{
                    bl.searchBrand();
                    break;
                }
                case 4:{
                    bl.updateBrand();
                    break;
                }
                case 5:{
                    bl.saveToFile(baseURL + "brands.txt");
                    break;
                }
                case 6:{
                    cl.listCars();
                    break;
                }
                case 7:{
                    cl.printBasedBrandName();
                    break;
                }
                case 8:{
                    cl.addCar();
                    break;
                }
                case 9:{
                    cl.removeCar();
                    break;
                }
                case 10:{
                    cl.updateCar();
                    break;
                }
                case 11:{
                    cl.saveToFile(baseURL+ "cars.txt");
                    break;
                }
                
            }
            
        }
    }
    
}
