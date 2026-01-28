
package runtime;

import java.util.StringTokenizer;


public class Program {

    public static void main(String[] args) {
        String lastName = new String("Hehe");
        String tmp = lastName;
        String firstName = "Le";//pool
        
        //String trong C là Array index 
        //String trong java là Object có dạng Immutable(bất biến thiên)
        //Không có 1 method hay 1 phép tính nào có khả năng 
        //thay đổi Object String cả
        lastName.concat(firstName);
        //
        System.out.println(lastName);
        System.out.println(tmp);
        
        
        //pool
        String s0 = new String("ABC");
        String s1 = "ABC";// pool
        String s2 = "ABC";// pool
        String s3 = "abc";// pool
        String s4 = new String("ABC");
        String s5 = new String("ABC");
        
        System.out.println(s0 == s1);// true 
        System.out.println(s1 == s2);// true cùng pool
        System.out.println(s2 == s3);// false vì khác giá trị 
        System.out.println(s4 == s5);// false vì new là 2 vùng mới 
        
        // pool là xài chung 
        // immutable là final 
        // cặp bài trùng 
        // những thằng String pool cùng 1 gtri sẽ xài cùng vùng nhớ với nhau 
        //Strng trong java là immutable k 
        // nên các method trong String ko thể thay đỏi String
        //các metod sẽ return 'về cái gì đó'
        //nên khi xài method trong String phải để ý xxem nó return cái gì 
        String str1 = "Điệp";
        String str2 = "hehe";
        String str3 = str1.concat(str2).concat("keke").toLowerCase().toUpperCase();
        
        //str1.indexOf(str2) str2 nằm ở vị trí nào trong str1 
        //str1.contains(str2)// trong str1 có chứa str2 không 
        
        
        //StringTokenizer | split | hash | băm 
        String information = "SE1999|ĐiệpHehe|2005|9.9";
        //tạo ra object chứa các method chuyên dùng để băm 
        StringTokenizer st = new StringTokenizer(information,"|");
        System.out.println(st.countTokens());// biết để dùng for
        // đếm các khúc có thể chặt được trong chuỗi 
        System.out.println(st.hasMoreTokens());// chặt nào hết thì thôi 
        
        
        String id = st.nextToken();// băm và trả về khúc đó 
        String name = st.nextToken();
        int yob = Integer.parseInt(st.nextToken());
        double point = Double.parseDouble(st.nextToken());
        System.out.println(st.countTokens());//0
        System.out.println(st.hasMoreTokens());//false
    }
    
}




