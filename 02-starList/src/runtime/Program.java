
package runtime;

import data.Star;


public class Program {
    public static void main(String[] args) {
       Star mtp = new Star("Son Tung", 1994, "nam", "Con Mua Ngang Qua");
       mtp.showInfor(); 
       
       Star chiPu = new Star("Thuy Chi", 1997, "nu", "Chiec O");
       chiPu.showInfor();
        
    }
    
}
/*
Lý thuyết 
I- Modifier  
    1.Access Mdifier
        default : là những thk trong cùng package sẽ thấy 
                  và truy cập được 
        public  : là tất cả mọi người đều có thể truy cập   
        private : là không ai truy cập được 
        protected : được chia sẽ với các "thế hệ sau"
                    
        Trong java có quy tắc bất hiếu : cha cho con all những gì cha có,
                   nhưng con không cho ca bất cứ thứ gì cả 

        là trong bộ access modifier chỉ có 1 trong 4 thằng này 
        được xuất hiện mà thôi 
        
    2.Non-Access Modifier
        ý nghĩa của kế thừa là thừa hưởng những gì ng đi trc đã làm tốt rồi 
        sau đó mở rộng họăc cải thiện ngkh làm chưa tốt hoặc chưa có 
        -final: class | prop | method : 
            final method : method này ko được độ lại nữa 
            final class : class này là cuối cùng trong gia phả và 
                            ko nhận class khác làm con được 
            final prop : biến var thành const
        -static : tĩnh 
            static: method | pro
            khi đó med và pro đó thuộc sở hữu của class 
            không phải của instance(Object đc tạo ra từ class đó )
        -abtractraction : 
            class bthg mà có abtract method thì là abtract class 
            abtract class thì ko nhất thiết phải có abstract method 





*/







