import java.util.Objects;

public class Member {

    private int id;

    private String name;

    private List borrowedBooks = new List();


    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public List getBorrowedBooks() {
        return borrowedBooks;
    }


    public String borrowBook(Book book){
        Library library = Library.getInstance();
        return library.borrowBook(book, this);
    }

    public String returnBook(Book book){
        Library library = Library.getInstance();
        return library.returnBook(this,book);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
