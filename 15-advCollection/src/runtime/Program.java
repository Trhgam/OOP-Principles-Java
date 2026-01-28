
package runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Program {
/*collection laf bộ sưu tập mảng xịn nhe
    là interface : là root interface 
    với công năng đặc hiệu chỉ chơi với Object
    công cụ đa năng hay có dịch vụ Collections
    linkedlist truy xuất chậm ,lưu, thêm,  xóa nhanh
    đều có khả năng lặp nên có gốc Iterable -( sở hữu Iterator)
    
    
    
    
    */
   
    public static void main(String[] args) {
        playWithList();
        playWithQueue();
    }
    public static void playWithList() {
        //list có thứ tự , cho trùng lặp 
        /*
        ArrayList là 1 túi hàng hiệu dùng để triển khai các tính năng của List 
        ArrayList là 1 Collection
        Collection : có thêm, xóa và lặp
        List : get và set 
        ArrayList có có thêm, xóa,lặp, get và set
        */
        //tạo mảng thường
        int arrInPrimitive[] = new int[100];//lưu bở stack
        //thiếu 10 thì ko được 
        // ko co dãn được , dùng nhiều hơn là lỗi 
        ArrayList<Integer> arrInList = new ArrayList<>();
        //mvc1 java, mvc2 c# nodeJsTsNext oop / function kì 7 nodejs kì 9 api
        
        
        
        //add(): thêm => Collection
        arrInList.add( new Integer(3));
        arrInList.add( new Integer(5));
        arrInList.add(2);
        System.out.println(arrInList);//[3 5 2]
        //ko cần fore vì nó có toString
        arrInList.clear();// xóa hết [] => Collection
        
        //.add(index, value) => Collection
        arrInList.add(0,3);
        arrInList.add(1,5);
        arrInList.add(2,4);
        arrInList.add(1,4);
        System.out.println(arrInList);//[3 4 5 4]
        
        //.get(index) : lấy ra pt ở vị trí index
        //.set(index, value) : set vị trí index = value
        //swap vị trí 0 và vị trí thứ 2 trong arrList
        Integer tmp = arrInList.get(0);
        arrInList.set(0, arrInList.get(2));
        arrInList.set(2, tmp);
        
        //remove(index || element ) xóa pt ở vị trí index trong mảng
        
        
        //-----Iterable: Tính khả lặp
        //-----Iterator: Là 1 object định nghĩa 1 trình tự hoặc 1 giá trị trả ra 
        //               tiếp theo trước khi kết thúc việc gọi nó 
        Iterator<Integer> it = arrInList.iterator();
        System.out.println(it.next());//5
        System.out.println(it.next());//4
        System.out.println(it.next());//3
        System.out.println(it.next());//4
 //       System.out.println(it.next());//error
        //.clone(); nhân bản | sao chép 
        //arrInList [5 4 3 4 ]
        ArrayList<Integer> arrDemo = (ArrayList)arrInList.clone(); //ép kiểu vì nó trả ra List
        arrDemo.set(0, 10);
        System.out.println(arrInList);
        
        //shallow copy: copy nóng | sao chếp những ko cắt được hết dây mơ rễ má
        //          =>> anh này làm anh kia chịu
        //(ArrayList)arrInList.clone(); đạt được trạng thái  deepCopy : copy sống  | cắt đc hết dây mơ rễ má
        
        
        
        
    }
    public static void playWithQueue( ) {
        Queue<Integer> numList = new LinkedList<Integer>();//buộc phải khai cha new con
        
        numList.offer(3);
        numList.offer(1);
        numList.offer(5);
        numList.offer(4);
        System.out.println(numList); // [ 3 1 5 4 ]
        while(true){
            Integer customer = numList.poll();
            if(customer == null){
                break;
            }
            System.out.println(customer);//in ra thôii
        }
        System.out.println(numList);//còn không phần tử
        
        
        //priorityQueue : hàng đợi ưu tiên 
        Queue<Integer> numListV3 = new PriorityQueue<>();
        numListV3.offer(3);
        numListV3.offer(5);
        numListV3.offer(1);
        numListV3.offer(9);
        numListV3.offer(2);
        System.out.println(numListV3); //[ 1 2 3 9 5]
        numListV3.poll();// 1
    }
}
