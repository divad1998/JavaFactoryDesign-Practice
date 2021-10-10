package JavaFactoryDesignTest;

public class PaperBook extends Book {

    String title;
    int volume;

    public PaperBook(String title, int volume) {
        System.out.println("paperbook called.");

        this.title = title;
        this.volume = volume;
    }
}