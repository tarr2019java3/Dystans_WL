package pl.sda.student;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 7);
        point1.distance(point2);

        System.out.println("Odległość p1 do p2: "+ point1.distance(point2));
    }
}
