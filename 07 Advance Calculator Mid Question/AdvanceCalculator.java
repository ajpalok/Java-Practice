public class AdvanceCalculator  extends Calculator{
    public int[] arr;
    public int c;

    public int sum(){
        for(int i:arr) c+=i;
        return super.sum()+c;
    }

    public AdvanceCalculator(int a, int b, int[] arr) {
        super(a, b);
        this.arr = arr;
    }
    
}
