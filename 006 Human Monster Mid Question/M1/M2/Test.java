package M1.M2;
import M1.Human;
import M1.Monster;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human(1, "high", true);
        Human h2 = new Human(1, "low", true);

        Monster m1 = new Monster("CookieMonster", 100);
        m1.eat(h2);
        if (m1.eat(h1)==true){
            System.out.println("Monster has eaten human "+h1.id());
        } else {
            System.out.println("Human escaped");
        }
        System.out.println(m1.scare(h2.bravery));
    }
}
