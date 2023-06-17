class Point{
    double x,y;
}
public class Circle {
    Point Center = new Point();
    double radius;

    void PositionCheck(Circle sm){
        double a =this.Center.x - sm.Center.x;
        double b =this.Center.y - sm.Center.y;
        double distance=Math.sqrt(a*a+b*b);
        if (distance+sm.radius<=this.radius) System.out.println("Small Circle is situated inside of the Big circle");
        else System.out.println("Small Circle is situated outside of the Big circle");
    }
}
