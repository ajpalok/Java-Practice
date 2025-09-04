import java.util.*;
 
    class Point {
         int x;
         int y;
    
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        
    }
public class CollectionSorting{
    
    
        public static void main(String[] args) {
            // Create an ArrayList of Point objects
            ArrayList<Point> points = new ArrayList<>();
            points.add(new Point(3, 5));
            points.add(new Point(1, 2));
            points.add(new Point(4, 1));
            points.add(new Point(2, 4));
    
            // Define a custom Comparator for sorting based on x + y in descending order
            Comparator<Point> comparator = new Comparator<Point>() {
                @Override
                public int compare(Point p1, Point p2) {
                    int sum1 = p1.x + p1.y;
                    int sum2 = p2.x + p2.y;
                    return Integer.compare(sum2, sum1); // Sort in descending order
                }
            };
    
            // Sort the ArrayList using the custom Comparator
            Collections.sort(points, comparator);
    
            // Print the sorted ArrayList
            for (Point point : points) {
                System.out.println("Point(" + point.x + ", " + point.y + ")="+ (point.x + point.y));
            }
        }
    }
    