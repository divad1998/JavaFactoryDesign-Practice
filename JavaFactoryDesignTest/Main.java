package JavaFactoryDesignTest;

public class Main {

    public static void main(String[] args) {
    
        //ToDo: create copy of class through factory design

        BookFactory libraryFactory = new Library();
        PaperBook paperBook = (PaperBook) libraryFactory.getBook();
        
        //get copy of paperBook. 
        PaperBook paperBookCopy = (PaperBook) libraryFactory.getBookCopy(paperBook.title, paperBook.volume);

        //Test: are both instances stored in same memory address?
        if (paperBook.equals(paperBookCopy)) {
            System.out.println("failed");
        } 
    }
}