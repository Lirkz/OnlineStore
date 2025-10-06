//David Saiontz, a movie class that extends the item class but also stores a duration
public class Movie extends ItemForSale
{
    private Integer duration;
    
    public Movie(String n, Double p, String d, Author a, Integer dur){
        super(n,p,d,a);
        duration = dur;
    }
    public Integer getDuration(){
        return duration;
    }
}
