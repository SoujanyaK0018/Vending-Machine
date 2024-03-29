package Item;

public class ItemShelf {
    //Item->ItemType,price,code,soldOut
    private int itemCode;
    private item Item;
    private boolean soldOut;
    public item getItem(){
        return this.Item;
    }
    public void setItem(item Item){
        this.Item=Item;
    }  
    public int getItemCode(){
        return this.itemCode;
    }
    public void setItemCode(int itemCode){
        this.itemCode=itemCode;
    }
    public boolean isSoldOut(){
        return this.soldOut;
    }
    public void setSoldOut(boolean soldOut){
        this.soldOut=soldOut;
    }
}
