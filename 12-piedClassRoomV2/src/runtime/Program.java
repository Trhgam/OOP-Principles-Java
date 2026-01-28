
package runtime;

import data.Herbivote;
import data.Horse;
import data.Hunter;
import data.Monkey;
import data.StudyEnthusiasts;
import java.util.ArrayList;

/*
    piedClassRoomV2

*/
/*
    ở bài trước , mình đã giúp khỉ và thỏ về một nhà 
    bằng '1 cái cớ. là có điểm chung là ăn cỏ
    ==> điểm chung về mặt sinh học 
        sau đó mk đã ko làm được với hunter ,
        tuy bác thợ săn có nhiều đặc điểm và hành đoọng giống nhau,nhưng xét về
        mặt sinh học thì ko liên quan 

        nên là khi ngựa và khỉ và bác thợ săn ko thể chung "nhà" đc
        ta cớ thể tìm một cái cớ về 1 sở thích ,Hội người ham học

*/
public class Program {

    
    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        
        Horse h1 = new Horse("Rảity", 2015, 9, "none");
        Herbivote h2 = new Horse("Roach", 2018, 170, "Grey");//dùng đvat ăn cả 
        Hunter hunt = new Hunter("Tho san", 0, 0, "Gear");
        ArrayList<StudyEnthusiasts> stuList = new ArrayList<>();
        stuList.add(h1);
        stuList.add((Horse)h2);
        stuList.add(hunt);
        
        
        // Tự nhiên có 1 con lừa (Sloth) bước vô lớp
        // tưởng là hsinh mới , hóa ra là học sinh cũ
        // nó là con chùm kín mít hôm bữa 
        // lưu nó
        // con lười vượt qua giống loại 
        //ảnh hưởng 
        
        StudyEnthusiasts luoi = new StudyEnthusiasts() {
            @Override
            public double studyHard() {
               return 120;
            }

            @Override
            public void showHard() {
                String str = String .format("MONKEY |%-15s|%4d|%-6.2f|%5.2f|",
                        "Flash", 2019, 120, studyHard());
                System.out.println(str);
            }
        };
        stuList.add(luoi);
    }
    
}
//interface lấy điểm chung về mặt sở thích nên kco propcần dung hành động
    //interface chỉ cần chung về mặt hàm / khi lọi bỏ thì bỏ 1 thói quen , hành động
                   //đễ hơn bỏ 1 prop vì prop sẽ dính líu
    //interface để làm to do list -ngoài đời- 
    //             gom nhóm        -trong bài-
    //class vì 
    //Collections.sort dùng list tính đố kị  (List list<Comparable>) 
                            //        hoặc  ( list và 1 trọng tài ) 
    // list đố kị stu.compareTo()
//hàm có body nhưng phải có satic