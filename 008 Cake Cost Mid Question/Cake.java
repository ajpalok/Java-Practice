public class Cake{
    protected String name;
    protected double rate;
    public Cake(String n, double r){
        this.name=n;
        this.rate=r;
    }
    public double calcPrice(){
        System.out.println("Print the calculated price.");
        return 0;
    }
    public void printDetails(){
        // print the details of the cake
        System.out.println("Prints the detail.");
    }
}

class OrderCake extends Cake{
    double weight;
    public OrderCake(String n, double r, double w){
        super(n,r);
        this.weight=w;
    }
    // overwrite the calcPrice() method and printDetails() method
    public double calcPrice(){
        return weight*rate;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
        System.out.println("Weight/Quantity: "+weight);
        System.out.println("Total Price: "+calcPrice());
        System.out.println("... ... .  ... ... .  ... . .  ... ");
    }
}

class ReadymadeCake extends Cake{
    int quantity;
    public ReadymadeCake(String n, double r, int q){
        super(n,r);
        this.quantity=q;
    }
    // overwrite the calcPrice() method and printDetails() method
    public double calcPrice(){
        return quantity*rate;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
        System.out.println("Weight/Quantity: "+quantity);
        System.out.println("Total Price: "+calcPrice());
        System.out.println("... .  ......  ......  ......  ......  . .");
    }
}

class Main{
    public static void main(String[] args) {
        Cake cake[];
        cake = new Cake[3];

        cake[0] = new OrderCake("OrderCake" ,150, 3);
        cake[1] = new ReadymadeCake("ReadymadeCake", 200, 2);
        cake[2] = new OrderCake("OrderCake" ,150, 4);

        for(int i = 0; i < cake.length; i++){
            cake[i].printDetails();
        }
    }
}