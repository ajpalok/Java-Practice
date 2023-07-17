# Cake Cost Calculator

Answer the following questions based on the attached code snippet:

```java
public class Cake {
    protected String name;
    protected double rate;
    public Cake(String n, double r) {
        name = n;
        rate = r;
    }
    public double calcPrice(){
        System.out.println("Print the calculated price.");
    }
    public printDetails(){
        System.out.println("Prints the detail.");
    }
}
class OrderCake extends Cake{
    double weight;
    public OrderCake(String n, double r, double w){
    super(n, r);
    weight = w;
    }
    //override calcPrice & printDetails 
}
class ReadymadeCake extends Cake{
    int quantity;
    public ReadymadeCake(String n, double r, int q){
    super(n, r);
    quantity = q;
    }
    //override calcPrice & printDetails
}
class Main{
    public static void main(String[] args) {
        Cake cake[];
        // Complete the code
        for (int i = 0; i < cake.length; i++) {
            cake[i].printDetails();
        }
    }
}
```

a) calcPrice() method in the Cake class is used to calculate the total price of a cake. You need to override this method in each of the derived classes: OrderCake and ReadymadeCake. Price is calculated as per the following rules: [4]

- OrderCake: rate * weight

- ReadymadeCake: rate * quantity

Also, override another method printDetails() in each class. This method will print the information about a particular cake according to the following format:

```txt
Name: <name>
Rate: <rate>
Weight/Quantity: <value>
Total Price: <price>
```

Now, complete the OrderCake and ReadymadeCake class by overriding calcPrice() and printDetails() methods.

b) Create an array of three cake objects. First two objects are of OrderCake type and later one object is of ReadymadeCake type in the main() method. Assign some values to the class attributes while creating those objects. If you successfully create the array, your output will look like as follows: [2]  

```txt
Name: OrderCake
Rate: 150
Weight: 3
Total Price: 450
… …. … …. ….. …
Name: ReadymadeCake
Rate: 200
Quantity: 2
Total Price: 400
…. …… …… …… …… ..
```
