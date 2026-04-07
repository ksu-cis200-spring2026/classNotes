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
        double price;
        if (year <= 2015) {
            price = 9.99;
        }
        else {
            price = 14.99;
        }
        //extra pages charge
        if (pages > 300) {
            int howManyExtra = (pages-300)/100 + 1;

            //now multiply 0.25 by howManyExtra
            //add that extra amount onto your price
        }

        return price;
    }

    //A price method
    //  Books published <= 2015:  
    //      $9.99 for up to 300 pages
    //      An extra $0.25 for going over 300 pages,
    //      An extra $0.25 for going over 400 pages, etc. 
    // Books published more recently than 2015:
    //   base price $14.99, same page extras

    //toString has:
    //title, author, publication year, page count, and price
}