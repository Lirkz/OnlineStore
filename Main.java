
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Author a = new Author("thename","thebirthday");
        Book b = new Book("book",3.0,"thedate",a,"thepublisher");
        Movie m = new Movie("movie",4.0,"adate",a,300);
        s.addItem(b);
        s.addItem(m);
        System.out.println(s.creator("book"));
        s.showItems();
        System.out.println(b.getPublisher());
        s.sellItem("book");
        System.out.println(s.getProfit());
        System.out.println(m.getName());
        System.out.println(m.getPrice());
        System.out.println(m.getDate());
        System.out.println(m.getDuration());
        System.out.println(m.getAuthor().getBirthday());
        System.out.println(m.getAuthor().getName());

     }
}
