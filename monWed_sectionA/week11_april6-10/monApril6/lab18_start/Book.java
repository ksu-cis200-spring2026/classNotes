public class Book {
    //Fields for the title, author, publication year, and number of pages
    protected String title;
    protected String author;
    protected int year;
    protected int pages;

    //constructor to initialize fields
    public Book(String t, String a, int y, int p) {
        title = t;
        author = a;
        year = y;
        pages = p;
    }

    public double price() {
        //is there an extra page charge?
        if (pages > 300) {
            int overageBin = (pages-300)/100 + 1;
            //change $0.25 per overageBin you are in
        }
    }

    //A price method
    //  Books published <= 2015:  
    //      $9.99 for up to 300 pages
    //      An extra $0.25 for going over 300 pages,
    //      An extra $0.25 for going over 400 pages, etc. 
    // Books published more recently than 2015:
    //   base price $14.99, same page extras


    public String toString() {
        return String.format("%s, %...", title, ...);
    }
    //toString has:
    //title, author, publication year, page count, and price
}