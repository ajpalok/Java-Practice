package M1;

public class Monster {
    String name;
    double weight;
    public void increaseWeight(double weight){
        System.out.println("New weight of monster="+(this.weight+weight));
    }

    public Monster(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public boolean eat(Human h){
        // check intelligence and return boolean value
        if(h.intelligence=="high")
            return true;
        else{
            increaseWeight(10);
            return false;
        }
    }

    public String scare(boolean bravery){
        // check bravery and return string value
        if(bravery==false){
            return "Human Scared";
        }
        else{
            return "Human is too brave to scare";
        }
    }
}
