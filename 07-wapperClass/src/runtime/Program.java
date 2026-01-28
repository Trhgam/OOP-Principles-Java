
package runtime;


public class Program {

    public static void main(String[] args) {
        //Wrapper Class 
        int a = 10; // primitive datatype : nguyên thủy ,siêu nhỏ và ko thể tách ra nữa
        //a. ko có gì nữa 
        Integer b = new Integer(10);// boxing 
        // con trỏ  object ( core 10 | và nhiều method hỗ trợ code )
        // tất cae các object từ Wapper Class sẽ có auto-unboxing khi in 
        System.out.println(a);
        System.out.println(b); //auto-unboxing
        System.out.println(b.toString()); 
        //.toString() mô tả object b bằng 1 đoạn văn // chuỗi
        
        int c = b ;//10 vì auto-unboxing 
        Integer d = 2000;//boxing 
        b = 2000;
        a = 2000;
        
        System.out.println(a == b ); //true 
         System.out.println(b == d ); //false
         //primitive == object từ WapperClass sẽ có auto-unboxing 
         //so về mặt giá trị 
         //object == object là ss 2 con trỏ => so địa chỉ 
         //so giá trị bên trong 2 object từ Wapper Class thì sao 
                    //d.equal(b) true | false
                    //d.compareTo(b) -1|0|1
         /*
         bonus :
         khi lưu trữ người ta dùng primitive hay dùng Wapper class
            primitive vì nó ít dung lượng 
         
         Wapper class không dùng để tạo object 
         mà xài như cái rương chưa các method hỗ trợ xử lý 
         
         */
    }
    
}
