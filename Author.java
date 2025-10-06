//David Saiontz, an author class that stores and can get the author's name and birthday
public class Author
{
    private String name;
    private String birthday;

    public Author(String n, String b){
        name = n;
        birthday = b;
    }
    public String getName(){
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
}
