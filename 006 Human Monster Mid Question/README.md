# Human Monster Mid Question

Consider the following three classes and the output of the program. Then answer (a),(b) and (c).

```java
package M1;
public class Human {
    private int id;
    String intelligence;
    protected boolean bravery;
}
public class Monster {
    String name;
    double weight;
    public void increaseWeight(double weight) {
        System.out.println("New weight of monster="+(this.weight+weight));
    }
    boolean eat(Human h){
        //check intelligence and return a boolean value
    }

    String scare(boolean bravery){
        //check bravery and return a string
    }
}
```

```java
package M1.M2;
public class Test {
    public static void main(String[] args) {

    Human h1=new Human(1,"low",true);
    Human h2=new Human(2,"high",false);

    Monster m1= new Monster ("CookieMonster", 100);
    if (m1.eat(h1)==true) {
        System.out.println("Monster has eaten human "+h1.id);
    }else{
        System.out.println("Human escaped");
    }
    System.out.println(m1.scare(h2.bravery));
    }
}
```

Expected Outcome:

```txt
To avoid getting scared or eaten be brave or intelligent.
To avoid getting scared or eaten be brave or intelligent.
New weight of monster=110.0
Monster has eaten human 1
Human is too brave to scare.
```

(a) Correct the given code (don’t modify the methods yet) by editing or adding any lines. You cannot remove any line from the code. Also write necessary getter methods (Assume the variables are read only). [2]  

(b) Observe the output given and write necessary constructors and blocks accordingly. [3]

(c) Implement the eat() and scare() methods. The eat() method checks the intelligence of a human- if it’s “high”, returns true, otherwise it calls the increaseWeight() method and then returns false. The scare() method checks a human’s bravery- if it's false, it prints a line: “Human scared." therwise it will print: "Human is too brave to scare." [3]
