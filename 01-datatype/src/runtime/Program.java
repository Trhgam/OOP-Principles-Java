
package runtime;


public class Program {
    //public static: modifier 
    public static void main(String[] args) {
        /*
        datatype trong Java có 2 nhóm chỉnh :
        I-primitive datatypr: kiểu dữ liệu nguyên thủy
        kiểu dữ liệu nhỏ ko thể tách nhỏ được nữa (atomic : cấp độ nguyên tử)
        
            Đặt tên: cammelCase: cú pháp con lạc đà
            8 loại dữ liệu nguyên thủy
            1-byte      (1 byte)       số nguyên rất nhỏ
            2-short     (2 byte)       số nguyên hơi nhỏ
            3-int       (4 byte)       số nguyên nhỏ
            4-long      (8 byte)       số nguyên lớn
            5-float     (4 byte)       số thực nhỏ
            6-double    (8 byte)       số thực lớn
            7-char      (2 byte)   ký tự có dấu | hỗ trợ unicode
            8-boolean   (1 bit | quá nhỏ để chỉ định) true | false
        */
        byte numByte = 127; //-128 => 127
        int numInt = 1234;
        //numInt = numByte;
        float numFloat = 123.5f; //f viết hoa hay thường gì cũng đc nhe 
        //java quy ước rằng nếu thấy số thực thì nó là double 
        //java quy ước rằng nếu thấy số nguyên thì nó là int
        double numDouble = 123.5d;
        long numLong = 10_000_000_000L ;
        int num1 = 0xFA; // hệ hexa
        
        //0x là prefix tiền tố của hexa
        int num2 = 076;
        
        //0 là prefix của octal
        
        //** default value của số là 0
        //** chuỗi - kí tự ""
        //** boolean là false
        
        /*
        II-References datatype : kiểu dữ liệu tham chiếu 
            kiểu dữ liệu do người dùng tự tạo ra dựa trên các primitive datatype
            Object datatype
            Student(sId:string, yob:int, gpa: float)
            Student là con trỏ
        */
        /*Operator : toán tử 
            trong java có hơn 10 loại toán tử 
        Arithmetricc : toán tử toans hạng
            + = * / % += -+ *= /= %= ++ --
        Assignment:
        Comparison: phép so sánh 
            < > >= <= != 
        Logic && || & | !
        
        */
        System.out.printf("num1 ne: " + num1);
        //String 
        //Comma : Phẩy
        //Unary: toán tử 1 ngôi 
        //Relational : toán tử quan hệ
        
        
        //shift bit : toán tử dịch bit >> a / 2^x , << a*2^x
        
        //bitwase
        //đẩy xuống thì rớt|đẩy về thì bù 0
        //x >> n => x/(2^n)
        //x << n => x*(2^2)
        
        //bitwise: toán tử bit (&, |, ^ , ~ )
        //&: giống phép nhân, 1 * 1 = 1, còn lại là 0
        //|: có 1 thì phép toán sẽ là 1
        //^: 2 số khác nhau ra 1,giống nhau ra 0
        //~: not, đổi ngược
        
        
        
        
    }
}






