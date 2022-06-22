import java.util.ArrayList;

public class Neighbour {

    static ArrayList<Point> neighbour;

    public ArrayList<Point> getNeighbour() {
        return neighbour;
    }

    public Neighbour() {
        neighbour = new ArrayList<>();
    }

    public static void addNewPointToNeighbour(Point point) {
        int row = point.getPoint0();
        int column = point.getPoint1();
        int[] rowAndColumnNorth = {row, column + 1};
        int[] rowAndColumnEast = {row + 1, column};
        int[] rowAndColumnSouth = {row, column - 1};
        int[] rowAndColumnWest = {row -1, column};
        Point north = new Point(rowAndColumnNorth);
        Point east = new Point(rowAndColumnEast);
        Point south = new Point(rowAndColumnSouth);
        Point west = new Point(rowAndColumnWest);
        if (!(north.getPoint0() < 0 || north.getPoint1() < 0)) {
            neighbour.add(north);
        }
        if (!(east.getPoint0() < 0 || east.getPoint1() < 0)) {
            neighbour.add(east);
        }
        if (!(south.getPoint0() < 0 || south.getPoint1() < 0)) {
            neighbour.add(south);
        }
        if (!(west.getPoint0() < 0 || west.getPoint1() < 0)) {
            neighbour.add(west);
        }
    }

}
