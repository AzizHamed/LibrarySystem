public class Node {

    private Book book;
    private Node next;

    public Node(Book book, Node next) {
        this.book = book;
        this.next = next;
    }

    public Book getBook() {
        return book;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public boolean contains(Book book){
        if(this.book.getDetails().equals(book.getDetails()))
            return true;

        if(next != null)
            return false;

        return next.contains(book);
    }
}
