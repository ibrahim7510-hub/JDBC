public class Laptop implements Comparable<Laptop>{
    String name;
    int ajay;
    int price;
    Laptop(String name,int ajay,int price){
        this.name=name;
        this.ajay=ajay;
        this.price=price;
    }
    @Override
    public String toString(){
        return "["+this.name+","+this.ajay+","+this.price+"]";
    }
    @Override
    public int compareTo(Laptop o){
        return this.price-o.price;
    }


}
