/**
 * Created by Александр on 15.04.2017.
 */
public class Task3Point {
    int x;
    int y;
    String dot;

    Task3Point(int _x, int _y, String _dot) {
        x = _x;
        y = _y;
        dot = _dot;
    }

    public static void getPoint(Task3Point a) {
        System.out.println(a.dot + " " + a.x + " " + a.y);
    }

}
