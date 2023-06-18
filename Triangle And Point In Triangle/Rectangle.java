class Point{
    int x,y;
}

public class Rectangle{
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    Point p4 = new Point();

    void PointInRect(Point p){
        if(p.x>this.p1.x&&p.x>this.p4.x&&p.x<this.p2.x&&p.x<this.p3.x&&p.y<this.p1.y&&p.y<this.p2.y&&p.y>this.p3.y&&p.y>this.p4.y)System.out.println("This Point is inside of a rectangle");
        else System.out.println("This Point is outside of a rectangle");
    }

    void RectInRect(Rectangle Sm){
        if(Sm.p1.x>=this.p1.x && Sm.p4.x>=this.p4.x && Sm.p2.x<=this.p2.x && Sm.p3.x<=this.p3.x && Sm.p1.y<=this.p1.y && Sm.p2.y<=this.p2.y && Sm.p3.y>=this.p3.y && Sm.p4.y>this.p4.y)System.out.println("This Small rectangle is inside of a Big rectangle");
        else System.out.println("This Small rectangle is outside of a Big rectangle");
    }
}