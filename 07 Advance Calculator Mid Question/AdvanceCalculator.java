public class AdvanceCalculator  extends Calculator{
    public int[] number;
    public int c;

    public int sum(){
        for(int i:number) c+=i;
        return super.sum()+c;
    }

    public AdvanceCalculator(int a, int b, int[] arr) {
        super(a, b);
        this.number = arr;
    }
    
}
