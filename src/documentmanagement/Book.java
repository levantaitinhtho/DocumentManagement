package documentmanagement;
import java.util.Scanner;
public class Book {
    String bookName;
    String createdAt;
    String nickname;

    public Book() {
    }

    public Book(String bookName, String createdAt, String nickname) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickname = nickname;
    }
    public void getInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        bookName = input.nextLine();
        System.out.println("Enter CreateAt: ");
        createdAt = input.nextLine();
        System.out.println("Enter Nickname: ");
        nickname = input.nextLine();
    }
    public void showInfo(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
