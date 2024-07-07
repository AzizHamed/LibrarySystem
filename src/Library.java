import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private static Library instance = null;



    private List<Book> books = new ArrayList<>();
    private HashMap<Integer, List<Integer>> borrowedBooks = new HashMap<>();


    private List<Member> members = new ArrayList<>();


    private Library() {
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }


    public Book addBook(Book book){
        Book book1 = new Book(book.getTitle(), book.getAuthor(), book.getYear());
        book1.setId(books.size() + 1);
        books.add(book1);

        return book1;
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void addMember(Member member){

       members.add(member);
    }

    public void removeMember(Member member){
        members.remove(member);
    }



    public String borrowBook(Book book, Member member){


        Book book1 = books.get(books.indexOf(book.getId()));
        if(book1==null)
            return "Book not found";

        if(borrowedBooks.containsKey(member.getId())){
            if(borrowedBooks.get(member.getId()).contains(book1.getId()))
                return "You already have this book";


            borrowedBooks.get(member.getId()).add(book1.getId());
            member.getBorrowedBooks().addBook(book1);
            return "You have successfully borrowed the book";
        }
        List<Integer> list = new ArrayList<>();
        list.add(book1.getId());
        borrowedBooks.put(member.getId(),list);

        member.getBorrowedBooks().addBook(book1);
        return "You have successfully borrowed the book";
    }

    public String returnBook(Member member, Book book){
        if(!borrowedBooks.containsKey(member.getId()))
            return "You did not borrow this book";

        if(!borrowedBooks.get(member.getId()).contains(book.getId()))
            return "You did not borrow this book";

        borrowedBooks.get(member.getId()).remove(book);
        if(borrowedBooks.get(member.getId()).size()==0)
            borrowedBooks.remove(member.getId());

        member.getBorrowedBooks().removeBook(book);

        return "Book returned successfully";
    }


    public List<Member> getMembers() {
        return members;
    }
}
