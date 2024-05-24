class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Circle {
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public int PointInsideCircle(Point p){
        int a = this.center.x;
        int b = this.center.y;
        int c = p.x;
        int d = p.y;
        double distance = Math.sqrt(((a - c) * (a - c)) + ((b - d) * (b - d)));
        if(distance > this.radius) return 0;
        else return 1;
    }
}


class Tests{
    public static void main(String[] args) {
        Point center = new Point(1, 1);
        double radius = 5;
        Circle c = new Circle(center, radius);
        Point p = new Point(4, 4);
        if(c.PointInsideCircle(p) == 1) System.out.println("yes, the point is inside the circle");
        else System.out.println("no, the point is outside");
    }
}