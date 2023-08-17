public class Main{
    public static void main(String[] args) {
        AdvanceCalculator c = new AdvanceCalculator(1,2, new int[]{3,4,5});
        
        System.out.println("Subtraction result: "+c.substract());
        System.out.println("Summation result: "+c.sum());
    }
}