//David Saiontz, an item for sale class that stores and can get the name, price, date, and author of a given item
public class ItemForSale
{
    private String name;
    private Double price;
    private String date;
    private Author author;

    public ItemForSale(String n, Double p, String d, Author a){
        name = n;
        price = p;
        date = d;
        author = a;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double p){
        price = p;
    }
    public String getDate(){
        return date;
    }
    public Author getAuthor(){
        return author;
    }
}
