package JavaFactoryDesignTest;

public interface BookFactory {

    Book getBook();
    Book getBookCopy(String title, int volume);
}