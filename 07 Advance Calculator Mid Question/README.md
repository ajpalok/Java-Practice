# Advance Calculator

Given the following information write the necessary code to implement AdvancedCalculator
class.

```java
public class Calculator {
    public int a;
    public int b;
    Calculator(int firstNumber, int secondNumber){
        this.a = firstNumber;
        this.b = secondNumber;
    }
    public int sum(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}

```

```java
public class AdvancedCalculator // is a Child of Calculator class
{

}
```

```java
public class main {
    public static void main(String[] args) {
        AdvancedCalculator c = new AdvancedCalculator(1,2, new int[]{3, 4, 5});
        System.out.println(c.subtract());
        System.out.println(c.sum());
    }
}
```

Expected output:

```txt
Subtraction result: -1
Summation result: 15
```

Following criteria must be fulfilled:

- AdvancedCalculator class has a constructor that uses this keyword to set the value of an attribute called numbers, which is an array of int type.

- Inside AdvancedCalculator class, override the sum() method from its parent. Then use the super keyword to utilize sum() method of its parent class Calculator to find out the sum of first two numbers. Then, add additional lines of code to add the elements of numbers[] with the sum and return the total summation.

Hints:

- 1st line of Expected outcome is the subtraction of 1st two numbers 1 and 2.

- 2nd line of Expected outcome is the summation of 1st two numbers 1 and 2 along with all the elements of numbers[] which are 3,4 and 5
