import java.util.Map;
import java.util.HashMap;
import collections.Item;
import java.util.Optional;
import java.util.Scanner;
public class ItemDemo{
    public static void main(String args[]){
        Map<Integer,Item> items = new HashMap<Integer,Item>();
        for(int i = 1; i<4; i++ ){
            Item item = new Item("Item "+i,  i*2, 3.2*i);
            items.put(item.getId(),item);
        }
        Scanner scaner = new Scanner(System.in);
        int choice=1;
        System.out.println("Enter 1 for search by ID and 2 by Name");
        choice = scaner.nextInt();
        Item item=null;
        switch(choice){
            case 1:
            System.out.println("Enter id to search");
            int id = scaner.nextInt();
            item = items.get(id);
            break;
            case 2:
            System.out.println("Enter name to search");
            scaner.nextLine();
            String name= scaner.nextLine();
            Optional<Item> titem = items.values().stream().filter(i -> i.getName().equals(name)).findFirst();
            item = titem.orElse(null);
            break;
        }
        if(item!=null){
            System.out.println("Item found info: ID- "+item.getId() + " \t Name:"+item.getName()+ "\t Stock:"+item.getStock()+"\t Price:"+item.getPrice());
        }else{
            System.out.println("Item not found");
        }
    }
}