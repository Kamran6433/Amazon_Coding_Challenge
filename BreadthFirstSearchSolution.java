import java.util.*;

/**
 * This is my solution class where I will be getting my answer and
 * running the program
 */

public class BreadthFirstSearchSolution {

    public static void main(String[] args) {

        Grid grid = new Grid();
//        System.out.println(Arrays.toString(grid.getLayout()));
        Point start = new Point();
//        System.out.println(Arrays.toString(start.getPoint()));
        DeliveryPoint end = new DeliveryPoint();
//        System.out.println(Arrays.toString(end.getPoint()));
        int[] point1 = {9, 7};
        int[] point2 = {8, 7};
        int[] point3 = {6, 7};
        int[] point4 = {6, 8};
        Obstacle ob1 = new Obstacle(point1);
        Obstacle ob2 = new Obstacle(point2);
        Obstacle ob3 = new Obstacle(point3);
        Obstacle ob4 = new Obstacle(point4);
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(ob1);
        obstacles.add(ob2);
        obstacles.add(ob3);
        obstacles.add(ob4);
        breadthFirstSearch(start, end, obstacles);

    }

    public static Path breadthFirstSearch(Point start, DeliveryPoint end, ArrayList<Obstacle> obstacles) {

        Path path = new Path();
        HashSet<Point> visited = new HashSet<>();
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {

            Point current = queue.remove();
            Neighbour.addNewPointToNeighbour(current);
            if (current.point == end.getPoint()) {
                System.out.println(path);
                return path;
            }
            for (int i = 0; i < current.neighbours.size(); i++) {
                int[] adjacentPoint = current.neighbours.get(i);
                if (!visited.contains(adjacentPoint)) {
                    queue.add(current.neighbours.get(i));
                    path.path.add(current.neighbours.get(i));
                }
            }
            visited.add(current);

        }
        System.out.println("NULL");
        return null;
    }

}
