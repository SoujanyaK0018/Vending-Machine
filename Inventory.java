package inventory;
import Item.ItemShelf;
import Item.item;

public class Inventory {
    private ItemShelf[] inventory;
    public Inventory(int n){
        inventory=new ItemShelf[n];
        initialEmptyInventory();
    }
    public ItemShelf[] getInventory(){
        return this.inventory;
    }
    public void setInventory(ItemShelf[] inventory){
        this.inventory=inventory;
    }
    public void initialEmptyInventory(){
        int startCode=101;
        for(int i = 0;i<inventory.length;i++){
            ItemShelf itemShelf=new ItemShelf();
            itemShelf.setItemCode(startCode);
            itemShelf.setSoldOut(true);
            inventory[i]=itemShelf;
            startCode++;
        }
    }
    public void addItem(item Item,int itemCode){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode()==itemCode){
                if(shelf.isSoldOut()==true){
                    shelf.setItem(Item);
                    shelf.setSoldOut(false);
                }

            }
        }
    }
    public item getItem(int itemCode){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode()==itemCode){
                if(shelf.isSoldOut()){
                    System.out.println("item is already soldout");
                    return new item();
                }
                else{
                    return shelf.getItem();
                }
            }
        }
        System.out.println("invalid item code");
        return new item();

    }
    public void updateSoldOutItem(int itemCodeNumber){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode()==itemCodeNumber){
                shelf.setSoldOut(true);
            }
        }
    }

}
