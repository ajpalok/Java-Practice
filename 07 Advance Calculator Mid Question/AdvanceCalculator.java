public class AdvanceCalculator  extends Calculator{
    int[] numbers;
    
    public int sum(){
        int c=0;
        for(int i:numbers) c+=i;
        return super.sum()+c;
    }

    public AdvanceCalculator(int a, int b, int[] arr) {
        super(a, b);
        this.numbers = arr;
    }
    
}
