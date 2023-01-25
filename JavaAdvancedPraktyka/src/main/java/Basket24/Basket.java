package Basket24;




public class Basket {
    private int i; //ta wartosc mowi ile mam elementow w koszyku

    public Basket() {
        i=0;
    }

    public void addToBasket(){
        if(i<10){
            i++;
        } else {
            throw new BasketFullException("Basket is full, i: "+i);
        }
    }

    public void removeFromBasket(){
        if(i>0){
            i--;
        } else {
            throw new BasketEmptyException("Basket is empty, i:"+i);
        }
    }

}