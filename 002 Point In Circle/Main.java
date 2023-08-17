public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 1;
        p.y = 2;

        Circle c = new Circle();
        c.center.x = 0;
        c.center.y = 0;

        c.radius = 3;

        c.PointInCircle(p);
    }
}
