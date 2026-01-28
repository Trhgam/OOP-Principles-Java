
package data;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String createAt ;
    private String nickname;

    public Book(String bookName, String createAt, String nickname) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickname = nickname;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public String getNickname() {
        return nickname;
    }
    
    //inputInfor
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của sách:");
        this.bookName=sc.nextLine();
        
        System.out.println("Nhập ngày tạo: ");
        this.createAt=sc.nextLine();
        
        System.out.println("Nhập bút danh tác giả đã viết sách: ");
        this.nickname = sc.nextLine();
    }
    public void showInfor(){
        System.out.printf("|%-24s|%-7s|%14s|\n",getBookName(),getCreateAt(),getNickname());
    }
    
}
/*
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới

*/