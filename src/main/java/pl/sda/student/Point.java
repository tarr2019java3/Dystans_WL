package pl.sda.student;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p1) {
        //  System.out.println(this.x);
        // System.out.println(this.y);
        double x = p1.getX() - this.x;
        double y = p1.getY() - this.x;

        Math.sqrt((x * x) + (y * y));

        // System.out.println(p1.getX());
        // System.out.println(p1.getY());
    }

}
