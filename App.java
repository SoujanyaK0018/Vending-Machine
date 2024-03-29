import Coin.coin;
import vendingmachine.*;
//import Item.ItemShelf;
import Item.*;
public class App {
    public static void main(String[] args) throws Exception {
        int value=coin.FIFTY.get_value();
        System.out.println(value);
        VendingMachine vendingMachine=new VendingMachine();
        System.out.println("|Fill the Inventory|");
        //String data=coin.values();
        fillInventory(vendingMachine);
        System.out.println("Display the inventory");
        displayInventory(vendingMachine);

    }
    public static void fillInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfSlots=vendingMachine.gInventory().getInventory();
        for(int i=0;i<itemShelfSlots.length;i++){
            item Item=new item();
            if(i==0||i==8){
                Item.setItemType("OREO");
                Item.setprice(30);
            }else if(i==1||i==9){
                Item.setItemType("JUICE");
                Item.setprice(40);
            }
            else if(i==2){
                Item.setItemType("COKE");
                Item.setprice(45);
            }
            else if(i==3){
                Item.setItemType("SODA");
                Item.setprice(20);
            }
            else if(i==4){
                Item.setItemType("CHIPS");
                Item.setprice(20);
            }
            else if(i==5){
                Item.setItemType("CHOCOLATE");
                Item.setprice(60);
            }
            else if(i==6){
                Item.setItemType("CANDY");
                Item.setprice(5);
            }
            else if(i==7){
                Item.setItemType("GUM");
                Item.setprice(5);
            }
            itemShelfSlots[i].setItem(Item);
            itemShelfSlots[i].setSoldOut(false);
        }

    }
    public static void displayInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfSlots=vendingMachine.gInventory().getInventory();
        for(ItemShelf shelf:itemShelfSlots){
            System.out.println(" Item Code: "+ shelf.getItemCode() + " Item: " + shelf.getItem().getType() +" Item Price: "+shelf.getItem().getprice()+ " isAvailable: "+
            !shelf.isSoldOut());

        }
    }
    
}
