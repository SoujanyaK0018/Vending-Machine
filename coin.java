package Coin;

public enum coin {
    //enum denomination{one,two,five,ten,fifty,hundred}
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    HUNDRED(100);
    private final int value;
    coin(int value){
        this.value=value;
    }
    public int get_value(){
        return this.value;
    }

}
