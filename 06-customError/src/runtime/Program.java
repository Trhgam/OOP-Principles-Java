
package runtime;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        //I.Regex: Regular Expression | Pattern | Biểu thức chính quy
        //Tạo ra 1 chuẩn cho chuỗi 
        
            String str = "1234567";
            System.out.println(str.matches("^[Se][Ee]\\d{9}$"));
        
        //1.Ký tự cố định
            System.out.println("name".matches("name"));
            System.out.println("NaMe".matches("name"));
        //2.(?i) là không phân biệt hoa thường ( đặt trước ^)
            System.out.println("name".matches("(?i)name"));
        //3.Ký tự bất kỳ '.'
            System.out.println("lname".matches(".name"));
            // dấu chấm đại diện cho 1 kí tự nào đó
            // fname 9name _name | true
            // trừ dấu xuống hàng 
            System.out.println("name".matches(".name"));//false
        //m.y => mey may myyy m y true
        //   my false
        
        //4.lập lại kí tự trước đó từ 0 => nhiều lần '*'
        System.out.println("".matches("mey"));
        //mey meeey my => true vì từ 0 đến nhiều lần
        System.out.println("".matches("m.*y"));   
        //my mashfgury
        //5.lặp lại kí tự trước đó từ 0 đến 1 lần 
        System.out.println("".matches("ma?y"));
        // my may | true 
        // maay | false
        //6.group ()
        System.out.println("".matches("m(er)*y"));    
        // my mery mererery  true
        //7.set tập hợp [...]
        System.out.println("".matches("m[aet]y")); 
        //m[aet]y may mey mty ==> true
        //        mky mik     ==> flase
        System.out.println("".matches("m[^aet]y")); 
        //m[^aet]y mũ trong tập hợp là phủ định
        //m[aet]y may mey mty ==> false
        //        mky mik     ==> true
        //8. liên tiếp [?-?]
        System.out.println("".matches("m[a-z]y")); // lấy bộ chữ thường     
        System.out.println("".matches("m[a-zA-Z]y"));  // lấy cả hoa lẫn thường 
        //[a-z]: 1 kí tự từ a-z
        //[a-zA-Z]: 1 kí luôn
        //[0-9]: 1 số
        //9. giới hạn lặp
        //{4} : lặp 4 lần 
        //{2,4} : lặp từ 2 đến 4 lần 
        //{1,} : '+' lặp từ 1 trở lên
        //{0,} : '*' lặp từ 0 trở lên 
        //{0,1} : '?' optional 
        //11.OR (ab|bc)
        //12.Bộ shorthand ( bộ viết tắt)
        // \w khớp với chữ [a-zA-Z0-9] + _ cũng hợp lệ 
        // \W :  phủ định 
        // \d : số 0-9
        // \D : phủ định d
        // \s : space dấu cách  \S phủ định s
        // ^ bắt đầu chuỗi ( nằm đầu chuỗi)
        // ^ ở đầu tập  tức là [^..] thì 1 trong các kí tự đó 
        // $ kết thúc chuỗi 
        // \ escape character dấu thoát chuỗi 
        // m.y là 1 kí tự bất kì 
        // m\.y \ phế võ công của  đấu . nên . trở thành dấu . bthg 
        
        
        
        
        //Try catch
        //+Error Compilation : lỗi diễn ra trong quá trình biên dịch 
        
        //+Error Runtime : phát sinh trong quá trình chạy code 
        
        //+Error Logic : lỗi phát thảo tư duy 
    
        //Scanf() : là hàm scan(quét để tìm) phục vụ cho việc nhập 
        // Trong java thì ko có hàm , nhưng mà sẽ có 1 object chuyên chưa method
        // hỗ trợ việc scan 
        
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Nhap tuoi di: ");
        try{
            age = sc.nextInt();
            if(age < 10 || age > 35 ){
                throw new Exception();
            }
        }catch(Exception e){
            //Error
            System.out.println(e);
        }finally{
            
        }
        System.out.println("Tuoi ne " + age);
        // xu ly loi logic minh phai tu throw 
    
    }
}
