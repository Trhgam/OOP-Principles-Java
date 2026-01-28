
package runtime;

import data.Author;
import data.Book;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        int choice;
        authorList.add(new Author("Ngô Kiến Huy", "Bắp", 1992));
        authorList.add(new Author("Trịnh Trần Phương Tuấn", "J97", 1997));
        authorList.add(new Author("Lê Mười Điệp", "UncleTen", 1999));
        
        bookList.add(new Book("Dngxt", "2005", "Bắp"));
        bookList.add(new Book("Nuôi con không tốn kém", "2006", "J97"));
        bookList.add(new Book("10 Điểm ", "2025", "UncleTen"));
        do{
            printMenu();
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: {
                    //them moi sach 
                    Book newBook = new Book();
                    newBook.inputInfor();//bookname, creatAt, 'nickname'
                    //neu tac gia chua co trong danh sach tac gia thi
                    //tao moi
                    boolean isFind = false;
                    for (Author author : authorList) {
                        if(author.getNickname().equals(newBook.getNickname())){
                            isFind = true;
                        }
                    }
                    //neu ko co thi tao
                    if(!isFind){
                        //tao moi tac gia
                        Author newAuthor = new Author(newBook.getNickname());
                        newAuthor.inputInfor();
                        authorList.add(newAuthor);//luu lai
                    }
                    //luu ca sach o ngoai nay
                    bookList.add(newBook);
                    break;
                }
                case 2: {
                    //in ra danh sach cac cuon sach
                    if(bookList.isEmpty()){
                        System.out.println("Not has book");
                    }
                    for (Book book : bookList) {
                        book.showInfor();
                    }
                    break;
                }
                case 3: {
                    //them tac gia moi
                    Author newAuthor = new Author();
                    newAuthor.inputInfor(authorList);
                    authorList.add(newAuthor);
                    Book b1 = new Book();
                    b1.inputInfor();
                    if(b1.getNickname().equalsIgnoreCase(newAuthor.getNickname())){
                        System.out.println("Them moi thanh cong");
                    }else{
                        System.out.println("Nick name không hợp lệ");
                    }
                    break;
                }
                case 4: {
                    //tim sach theo but danh
                    System.out.println("Nhap but danh tac gia can tim sach:");
                    String keyNickname = sc.nextLine();
                    boolean isFind = false;
                    for (Book book : bookList) {
                        if(book.getNickname().equals(keyNickname)){
                            book.showInfor();
                                    
                            isFind = true;
                        }
                    }
                    //thong bao neu k co
                    if(!isFind){
                        System.out.println("Khong co sach nao het");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Hen gap lai");
                    break;
                }
            }
        }while( choice != 5);
    }
    public static void printMenu(){
        System.out.println("--------------Menu--------------");
        System.out.println("1.Nhập thông tin sách in ra màn hình");
        System.out.println("2.Hiển thị thông tin sách ra màn hình");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.Tìm kiếm sách theo bút danh");
        System.out.println("5.Thoát");
    }
    
}
/*sinh viên có học bổng là sinh viên có điểm trên >= 8 nhen


------------------- bài mới -------------------
quản lý thư viện
tạo chương trình quản lý thư viện
gồm 2 class sau
Author
    name nickname old birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
*/