//David Saiontz, a book class that extends the item class but also stores a publisher
public class Book extends ItemForSale
{
    private String publisher;

    public Book(String n, Double p, String d, Author a, String pub){
        super(n,p,d,a);
        publisher = pub;
    }
    public String getPublisher(){
        return publisher;
    }
}
