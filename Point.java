import java.util.ArrayList;

public class Point {

    int[] point = {};
    ArrayList<int[]> neighbours;

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }

    public ArrayList<int[]> getNeighbours() {
        return neighbours;
    }

    public Point(int[] point) {
        neighbours = new ArrayList<>();
        this.point = point;
        int row = point[0];
        int column = point[1];
        int[] north = {row, column + 1};
        int[] east = {row + 1, column};
        int[] south = {row, column - 1};
        int[] west = {row -1, column};
        if (!(north[0] < 0 || north[1] < 0)) {
            neighbours.add(north);
        }
        if (!(east[0] < 0 || east[1] < 0)) {
            neighbours.add(east);
        }
        if (!(south[0] < 0 || south[1] < 0)) {
            neighbours.add(south);
        }
        if (!(west[0] < 0 || west[1] < 0)) {
            neighbours.add(west);
        }
    }

}
