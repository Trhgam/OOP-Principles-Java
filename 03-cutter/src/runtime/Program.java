
package runtime;

import data.RightTriangle;
import data.Triangle;

public class Program {
    public static void main(String[] args) {
        //lưu trữ các hình tam giác(triangle)
        Triangle tr1 = new Triangle(4, 7, 9);
        //tr1.showInfor();
        RightTriangle rtr1 = new RightTriangle(3,4);
        //rtr1.showInfor();
        
        //muốn lưu trữ thì phải cất vào mảng 
        //tạo mạng chứa các hình tam giác
        Triangle triangleList[] = new Triangle[2];
        triangleList[0] = tr1;
        triangleList[1] = rtr1;
        
        // duyệt mảng các hình tam giác 
        for(int i = 0;i <= triangleList.length -1 ;i++){
            triangleList[i].showInfor();
        }
        
    }
}
