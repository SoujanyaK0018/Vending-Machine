package vendingmachine;
import inventory.Inventory;
import Coin.coin;
import java.util.*;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private List<coin>coinList;
    public VendingMachine(){
        vendingMachineState=new VendingMachineState();
        inventory=new Inventory(10);
        coinList=new ArrayList<>();
    }
    public VendingMachineState getVendingMachineState(){
        return this.vendingMachineState;
    }
    public void setVendingMachineState(VendingMachineState vendingMachineState){
        this.vendingMachineState=vendingMachineState;
    }
    public Inventory gInventory(){
        return this.inventory;
    }
    public void setInventory(Inventory inventory){
        this.inventory=inventory;
    }
    public List<coin>getCoinList(){
        return this.coinList;
    }
    public void setCoinList(List<coin>coinList){
        this.coinList=coinList;
    }


}
