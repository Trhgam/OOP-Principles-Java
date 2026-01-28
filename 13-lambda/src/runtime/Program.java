
package runtime;


public class Program {
    /*
    Trong 1 file java có thể có nhiều class 
    nhưng chỉ có 1 class là public thôi 
    vì class đó là đại diện cho file đó 
    nên class đó cùng tên file đó 
    khi import file đó lad import class đó (module)
    lambda
    
    
    */
    
    public static void main(String[] args) {
        Math diep = ( a, b)-> a + b; 
        
        /*
        Math diep = new Math() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        */
        
    }
    
    
}
//inter
interface Math{
    public int sum(int a, int b);//abs method 
    //public int minus(int a, int b);
}