/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
    David Saiontz, a store class that contains a profit, items for sale, and methods for showing, adding, and selling items, as well as getting their creator and overall profits.
*/
import java.util.ArrayList;

public class Store
{
  private ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();
  private Double profit;

  public Store(){
    profit = 0.0;
  }
  public Double getProfit(){
    return profit;
  }
  public void showItems(){
    for (ItemForSale item : items){
      System.out.print(item.getName() + " ");
    }
    System.out.println();
  }
  //Precondition Store is initialized 
  //Postcondition adds an item to the ItemForSale list
  public void addItem(ItemForSale item){
    items.add(item);
  }
  //Precondition Store is initialized
  //Postcondition Removes an item from the ItemForSale list if it exists otherwise does nothing
  public void sellItem(String itemName){
    for (ItemForSale item : items){
      if (item.getName() == itemName){
        profit += item.getPrice();
        items.remove(item);
        return;
      }
    }
  }
  //Precondition Store is initialized
  //Postcondition Gets the creator of a given item if that item exists
  public String creator(String itemName){
    for (ItemForSale item : items){
      if (item.getName() == itemName){
        return item.getAuthor().getName();
      }
    }
    return "Item does not exist";
  } 

}
