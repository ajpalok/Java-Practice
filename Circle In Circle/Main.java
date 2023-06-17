public class Main {
    public static void main(String[] args) {
        Circle Big = new Circle();
        Circle Small = new Circle();

        Big.Center.x=0;
        Big.Center.y=0;
        Big.radius=100;

        Small.Center.x=0;
        Small.Center.y=0;
        Small.radius=10;

        Big.PositionCheck(Small);
    }
}