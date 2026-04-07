//what to do with Book?

public class Textbook extends Book {
    //Fields for the title, author, publication year, 
    //number of pages, are optionally used, 
    //and optionally include electronic access 

    private boolean used;
    private electronicAccess;

    public Textbook(String t, String a, int y, int p, boolean u) {
        super(t, a, y, p);
        used = u;
    }

    public void addElectronicAccess() {
        //the book must be new (i.e. NOT used)
        //more recent than 2020

        //if conditions met, set electronicAccess field to true
    }

    //constructor to initialize fields
    //(electronic access is always initially false)

    //method to add electronic acces
        //(ONLY if meet criteria: new and since 2020)
    
    //Price
    //$199.99 as a base price if they are newer than 2020
    //$149.99 as a base price if they are older than that. 
    //Used textbooks get a 30% discount
    //Electronic access adds $50.00

    //Different toString
}