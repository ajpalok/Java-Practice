public class Main {
    public static void main(String[] args) {
        Rectangle Big = new Rectangle();
        Rectangle Small = new Rectangle();

        Big.p1.x = -2;
        Big.p1.y = 2;

        Big.p2.x = 2;
        Big.p2.y = 2;

        Big.p3.x = 2;
        Big.p3.y = -2;

        Big.p4.x = -2;
        Big.p4.y = -2;

        Point P = new Point();

        P.x=6;
        P.y=0;
        
        Big.PointInRect(P);
        Big.RectInRect(Small);
    }
}
