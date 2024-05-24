public class Point {
    int x;
    int y;
    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }
} //End of Class Point;
class Circle{
    Point center;
    double radius;
    public Circle (Point center, double radius){
        this.center=center;
        this.radius=radius;
    }

}
