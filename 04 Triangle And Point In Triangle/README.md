# Triangle And Point In Triangle

There is a point class having two instance variables x and y.

```java

class Point{
    int x, y;
}
```

There is another class Rectangle having 4 points.

```java
class Rectangle{
    Point p1, p2, p3, p4;
    //function that checks if a point is inside a rectangle or not.
    //function that checks if a rectangle is inside another rectangle or not.
}
```

A Rectangle looks like this:

```txt
p1--------------------------p2
 |                          |
 |                          |
 |                          |
 |                          |
p4--------------------------p3
```

Where the sides of the rectangle are parallel to either x or y-axis.

Now write two functions in the Rectangle class.

* The function that checks if a point is inside a rectangle or not.

* The function that checks if a rectangle is inside another rectangle or not.
