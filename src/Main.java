import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Library library = Library.getInstance();
//
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");

        book1 = library.addBook(book1);
        book2 = library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member1.returnBook(book1);
        library.returnBook(member1, book1);
        System.out.println(library.getMembers());
    }


//        System.out.println("1 - Create account \n" + "2 - sign in\n" + "3 - Sign in as librarian\n" + "4 - Exit\n");
//
//
//        while(!scanner.hasNextInt())
//            System.out.println("enter a number");
//
//
//        int number = scanner.nextInt();
//
//        boolean bool;
//        Member member=null;
//
//        if(number==4)
//            return;
//
//
//        while(number!=1 && number!=2 && number!=3) {
//            System.out.println("Unknown number\n");
//
//            if(scanner.hasNextInt())
//                number = scanner.nextInt();
//
//        }
//
//        if(number == 1)
//            member = createAccount();
//
//
//        else
//
//        if(number ==2)
//            member = signIn();
//
//
//        else
//            if(number==3)
//                signInLibrary();
//
//        else{
//            System.out.println("choose between 1 and 2\n");
//        }
//
//
//
//
//        if(number==3)
//            Librarian();
//
//
//        else
//            LibraryMember(member);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//    private static void LibraryMember(Member member) {
//
//        while (true) {
//
//            System.out.println("1 - Borrow book\n");
//            System.out.println("2 - Return book\n");
//            System.out.println("3 - Print my borrowed books\n");
//            System.out.println("4 - Exit\n");
//
//            int number=0;
//
//            if(scanner.hasNextInt())
//                number = scanner.nextInt();
//
//
//            if(number==4)
//                return;
//
//            while(number!=1 && number!=2 && number != 3){
//                System.out.println("Unknow number\n");
//                if(scanner.hasNextInt())
//                    number = scanner.nextInt();
//
//            }
//
//
//            if(number==1){
//                String message = "";
//
//                System.out.println("Give me book Id : ");
//                int bookId = 0;
//                if (scanner.hasNext())
//                    bookId = scanner.nextInt();
//
//                Book book = new Book(bookId);
//
//                message = member.borrowBook(book);
//
//                while(message.equals("Book not found")) {
//
//                    System.out.println(message);
//                     bookId = 0;
//                    if (scanner.hasNext())
//                        bookId = scanner.nextInt();
//
//                     book = new Book(bookId);
//
//                    message = member.borrowBook(book);
//
//                }
//
//                System.out.println(message);
//
//
//
//
//            }
//
//            if(number==2){
//                String message = "";
//
//                System.out.println("Give me book Id : ");
//                int bookId = 0;
//                if (scanner.hasNext())
//                    bookId = scanner.nextInt();
//
//                Book book = new Book(bookId);
//
//                message = member.returnBook(book);
//
//                while(message.equals("You did not borrow this book")) {
//
//                    System.out.println(message);
//                    bookId = 0;
//                    if (scanner.hasNext())
//                        bookId = scanner.nextInt();
//
//                    book = new Book(bookId);
//
//                    message = member.borrowBook(book);
//
//                }
//
//                System.out.println(message);
//            }
//
//            else{
//                System.out.println(member.getBorrowedBooks());
//            }
//        }
//
//
//    }
//
//    private static void Librarian() {
//
//        while(true) {
//
//            int addbook = 0;
//            System.out.println("1 - add book\n");
//
//            System.out.println("2 - exit");
//            if (scanner.hasNextInt())
//                addbook = scanner.nextInt();
//
//            while (addbook != 1 && addbook!=2) {
//                System.out.println("unknown \n");
//                if (scanner.hasNextInt())
//                    addbook = scanner.nextInt();
//            }
//
//            if(addbook==2)
//                return;
//
//            String title = "";
//            String author = "";
//            int year = 0;
//
//            System.out.println("What is the book title ?  ");
//            if (scanner.hasNext())
//                title = scanner.next();
//
//            System.out.println("\n");
//
//            System.out.println("Author name ?  ");
//
//
//            if (scanner.hasNext())
//                author = scanner.next();
//
//            System.out.println("\n");
//
//
//            System.out.println("Year of book ? ");
//
//            if (scanner.hasNextInt())
//                year = scanner.nextInt();
//
//            System.out.println("\n");
//
//            Library library = Library.getInstance();
//
//            Book book = new Book(title, author, year);
//
//            library.addBook(book);
//
//        }
//
//
//
//
//
//
//    }
//
//    private static Library signInLibrary() {
//
//
//        String userName="";
//        String password="";
//
//        if(scanner.hasNext())
//            userName = scanner.next();
//        if(scanner.hasNext())
//            password = scanner.next();
//
//        Authentication authentication = Authentication.getInstance();
//
//        Boolean bool = authentication.LibrarianAuth(userName,password);
//
//        while (bool==false){
//            System.out.println("incorrect user name or password fpr library\n");
//
//            if(scanner.hasNext())
//                userName = scanner.next();
//            if(scanner.hasNext())
//                password = scanner.next();
//
//             bool = authentication.LibrarianAuth(userName,password);
//        }
//
//        return Library.getInstance();
//
//
//
//
//
//
//    }
//
//    private static Member signIn() {
//
//        System.out.println("Enter user name : ");
//        String userName = scanner.next();
//
//        System.out.println("\n");
//
//        System.out.println("Enter password : ");
//        String password = scanner.next();
//
//        Authentication authentication = Authentication.getInstance();
//
//        Member member = authentication.signIn(userName, password);
//
//        while (member==null){
//            System.out.println("User name or password incorrect: ");
//            if(scanner.hasNext())
//            userName = scanner.next();
//            if(scanner.hasNext())
//            password = scanner.next();
//
//        }
//        System.out.println("\n");
//
//        return member;
//    }
//
//
//    private static Member createAccount() {
//
//        System.out.println("Enter user name : ");
//        String userName="";
//        if(scanner.hasNext())
//         userName = scanner.next();
//
//        System.out.println("\n");
//
//        System.out.println("Enter password : ");
//        String password="";
//        if(scanner.hasNext())
//            password = scanner.next();
//
//        Authentication authentication = Authentication.getInstance();
//
//        Member member = authentication.createAccount(userName, password);
//
//        while(member==null) {
//            System.out.println("choose another userName and password");
//            if(scanner.hasNext())
//            userName = scanner.next();
//            if(scanner.hasNext())
//            password = scanner.next();
//            member = authentication.createAccount(userName, password);
//        }
//        System.out.println("\n");
//
//        return member;
//    }

    }