public class List {

    private Node head;

    public void addBook(Book book){
        head = new Node(book, head);
    }

    @Override
    public String toString() {
        String result = "";
        while(head != null){
            result += head.getBook().getDetails() + "\n";
            head = head.getNext();
        }

        return result;
    }

    public boolean contains(Book book){
        if(head == null)
            return false;

        return head.contains(book);


    }

    public void removeBook(Book book) {

        if(head==null)
            return;

        if(head.getBook().getDetails().equals(book.getDetails())){
            head = head.getNext();
            return;
        }

        Node current = head;
        Node previous = null;

        while(current!=null){
            if(current.getBook().getDetails().equals(book.getDetails())){
                previous.setNext(current.getNext());
                return;
            }
            previous = current;
            current = current.getNext();
        }

    }




}
