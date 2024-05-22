enum Laptop{
    Mac(2000),
    Asus(1000),
    Dell(1500),
    Hp;
    
    private int price;

    private Laptop(){
        price = 999;
    }

    private Laptop (int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class EnumEx3 {
    public static void main(String[] args) {
                
        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + "->"+ lap.getPrice());
        }
    }
}
