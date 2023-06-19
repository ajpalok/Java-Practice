public class Circle {
    Point center = new Point();
    double radius;

    void PointInCircle(Point p){
        double distance = Math.sqrt(Math.pow(p.x-this.center.x,2)+Math.pow(p.y-this.center.y,2));
        if(distance<this.radius)System.out.println("Point is in circle");
        else System.out.println("Point is not in circle");
    }
}