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
        double odl = Math.sqrt(Math.pow((y - x), 2) + Math.pow((p1.getY() - p1.getX()), 2));
        return odl;
    }

}
