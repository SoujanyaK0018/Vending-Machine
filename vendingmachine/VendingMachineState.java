package vendingmachine;
import Coin.coin;
import java.util.*;
import Item.item;
//import inventory.Inventory;

public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Currently machine is in Idle state");

    }
    public void clickOnStartProductSelectionButton(){
        System.out.println("Vending machine is in HasMoneyState");
    }
    public void insertCoin(coin Coin,VendingMachine vendingMachine){
        System.out.println("Vending machine is in HasMoneyState");
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(Coin);

    }
    public void chooseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        item Item=vendingMachine.gInventory().getItem(itemCodeNumber);
        int paidByUser=0;
        for(coin Coin:vendingMachine.getCoinList()){
            paidByUser+=Coin.get_value();

        }
        if(Item.getprice()>paidByUser){
            refundFullMoney(vendingMachine);
            return;
        }
        else{
            getChange(Item.getprice(),paidByUser);
            dispenseProduct(vendingMachine,itemCodeNumber);
            return;

        }

    }
    public List<coin> refundFullMoney(VendingMachine vendingMachine){
        System.out.println("Returned the full amount back in the coin dispense tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();

    }
    public void updateInventory(VendingMachine vendingMachine,item Item,int itemCodeNumber){
        vendingMachine.gInventory().addItem(Item,itemCodeNumber);

    }
    public void dispenseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        System.out.println("currently vending machine is in dispense state");
        System.out.println("product has been dispense");
        vendingMachine.gInventory();
        vendingMachine.setVendingMachineState(new VendingMachineState());

    }
    public void getChange(int itemPrice,int paidByUser){
        System.out.println("Returned the change in the coin dispense tray:"+(paidByUser-itemPrice));
    }

}
