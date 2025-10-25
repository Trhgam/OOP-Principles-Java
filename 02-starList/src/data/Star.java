
package data;

public class Star {
    private String name;
    private int yob;
    private String gender;
    private String hotSong;
    
    
    // constructer : cái phễu dùng để nhận value từ bên ngoài và 
    // rót value vàp các properties tương ứng , từ đó đúc ra tương
    //1.Constructer phải có tên giống với Class chứa nó 
    //2.Constructer là hàm k đc xét về đầu ra
    
    //this ám chỉ Object đang gọi method dó 

    public Star() {
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public String getGender() {
        return gender;
    }

    public String getHotSong() {
        return hotSong;
    }
 
    public Star(String name, int yob, String gender, String hotSong) {
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.hotSong = hotSong;
    }
       
    public void showInfor(){
        System.out.println("Toi ten la : " + name 
                            + ", Nam sinh ne: " + yob
                            + ", Gioi tinh ne: " + gender
                            + ", Hot song ne: " + hotSong);
    }
    
    
    
    
}





