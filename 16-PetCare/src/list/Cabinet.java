/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import data.Cat;
import data.Dog;
import data.Pet;
import java.util.Collections;
import java.util.StringTokenizer;
import util.FileHandler;


public class Cabinet {
    private  PetList petList = new PetList();
    private FileHandler<Pet> fileHandler = new FileHandler<Pet>() {
        @Override
        public Pet handleLine(String line) {
           //line "D001  | DIEP | RED | 25.6 | VONG BAC|
           StringTokenizer st = new StringTokenizer(line, "|");
           String id = st.nextToken().trim();
           String owner = st.nextToken().trim();
           String color = st.nextToken().trim();
           double weight = Double.parseDouble(st.nextToken().trim());
           String special = st.nextToken().trim();
           if(id.contains("D")){
               return new Dog(id, owner, color, weight, special);
           }else{
               return new Cat(id, owner, color, weight, special);
           }   
        }
    };
    public void loadFromFile(){
        String url = "D:\\PIEDTEAM_JAVA\\16-PetCare\\petData.txt";
        fileHandler.load(url, petList);
    }
    public void saveToFile(){
        String url = "D:\\PIEDTEAM_JAVA\\16-PetCare\\petData.txt";
        fileHandler.save( petList,url);
    }
    public void task1(){
        petList.addNewDog();
    }
    public void task2(){
        petList.addNewCat();
    }
    public void task3(){
        petList.show();
    }
    public void task4(){
        petList.search();
    }
    public void task5(){
        petList.update();
    }
    public void task6(){
        petList.remove();
    }
    public void task7(){
        Collections.sort(petList);
    }
    public void task8(){
        
    }
}
