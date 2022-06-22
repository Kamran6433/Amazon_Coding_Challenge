import java.util.ArrayList;

public class Point {

    public int[] point = {0, 0};
    Neighbour neighbours;

    public int getPoint0() {
        return point[0];
    }

    public int getPoint1() {
        return point[1];
    }

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }

    public Point() {
        neighbours = new Neighbour();
    }

    public Point(int[] point) {
        this.point = point;
        neighbours = new Neighbour();
    }

}
