
package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public  abstract class FileHandler<T> {
    public boolean load(String url, ArrayList<T> list){
        list.clear();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            String line = reader.readLine();
            while(line != null){
                T t = handleLine(line);
                list.add(t);
                line = reader.readLine();
            }
            return true;
        }catch(IOException | NumberFormatException e){
            System.out.println("Lỗi file");
            return false;
        }
    }
    public abstract T handleLine(String line);
    public boolean save(ArrayList<T> list , String url){
        File f = new File(url);
        try{
            FileOutputStream fos= new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            for (T item : list) {
                writer.write(item.toString());
                writer.write("\n");
            }
            writer.flush();
            return true;
        }catch(Exception e){
            System.out.println("File loi roi");
            return false;
        }
    }
 

}
