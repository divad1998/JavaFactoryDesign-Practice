package JavaFactoryDesignTest;

public class Library implements BookFactory {

    @Override
    public Book getBook() {
        // TODO Auto-generated method stub
        return new PaperBook("Essentialism", 264);
    }

    // returns copy of passed book
    @Override
    public Book getBookCopy(String title, int volume) {
        return new PaperBook(title, volume);
    }
}