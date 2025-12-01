public class Aggregation {

    public static void main(String[] args){

        // aggregation = represents a "has-a" relationship between objects
        //               one object contains another object as part of its structure
        //               but the contained object(s) can exist independently

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

        //for(Book book : books){
        //    System.out.println(book.displayInfo());
        //}

        //System.out.println(book1.displayInfo());
        //System.out.println(book2.displayInfo());
        //System.out.println(book3.displayInfo());

    }
}
