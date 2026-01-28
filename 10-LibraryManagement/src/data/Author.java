
package data;

import java.util.ArrayList;
import java.util.Scanner;


public class Author {
    private String name;
    private String nickname;
    private int yob;
    //ArrayList<Book> bookList;
    //thiet ke co so du lieu dua tren du lieu 
    // tác giả ? có bao nhiêu quyển sách
    // sách này của tác giả nào

    public Author() {
    }

    public Author(String name, String nickname, int yob) {
        this.name = name;
        this.nickname = nickname;
        this.yob = yob;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    
    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getYob() {
        return yob;
    }
    //inputInfor : nhập name và yob
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        this.name = sc.nextLine();
        
        System.out.println("Nhap nam sinh cua tac gia:");
        this.yob = Integer.parseInt(sc.nextLine());

    }
    
    public void inputInfor(ArrayList<Author> authorlist){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nickname:");
        while(true){
            String inputNickname = sc.nextLine();
            boolean isDup = false;
            //tim xem co trung khong
            for (Author author : authorlist) {
                if(author.getNickname().equals(inputNickname)){
                    isDup = true;
                }
            }
            if(isDup){
                System.out.println("But danh bi trung");
            }else{ // chua trung thi luu 
                this.name = inputNickname;
                this.inputInfor();//nhap them nam va yob
                break;//thoat khoi vong lap 
            }
            
        }
       
        
    }
    
    public void showInfor(){
        System.out.printf("|%-20s|%-20s|%4d\n",getName(),getNickname(),getYob());
    }
}
/*
  name nickname old birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
*/