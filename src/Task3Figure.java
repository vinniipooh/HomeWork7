/**
 * Created by Александр on 15.04.2017.
 */
public class Task3Figure {
    double a = 0, b = 0, c = 0, d = 0, e = 0;
    int i = 0;

    Task3Figure(Task3Point _A, Task3Point _B, Task3Point _C) {
        a = LengthofHand(_A, _B);
        b = LengthofHand(_B, _C);
        c = LengthofHand(_C, _A);
        i = 3;
    }

    Task3Figure(Task3Point _A, Task3Point _B, Task3Point _C, Task3Point _D) {
        a = LengthofHand(_A, _B);
        b = LengthofHand(_B, _C);
        c = LengthofHand(_C, _D);
        d = LengthofHand(_D, _A);
        i = 4;
    }

    Task3Figure(Task3Point _A, Task3Point _B, Task3Point _C, Task3Point _D, Task3Point _E) {
        a = LengthofHand(_A, _B);
        b = LengthofHand(_B, _C);
        c = LengthofHand(_C, _D);
        d = LengthofHand(_D, _E);
        e = LengthofHand(_E, _A);
        i = 5;
    }

    public static double LengthofHand(Task3Point a, Task3Point b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
    }

    /*public static void PerimeterCalculator(Task3Figure z) {
        System.out.println("P = " + (z.a + z.b + z.c + z.d + z.e));
        if (z.i == 3) System.out.println("Triangle");
        if (z.i == 4) System.out.println("Quadrilateral");
        if (z.i == 5) System.out.println("Pentagon");
    }*/

    public static String PerimeterCalculator(Task3Figure z) {
        String s;
        s =(z.a + z.b + z.c + z.d + z.e) + " ";
        if (z.i == 3) s += "Triangle";
        if (z.i == 4) s += "Quadrilateral";
        if (z.i == 5) s += "Pentagon";
        return s;
    }


    public static void main(String[] args) {
        Task3Point A = new Task3Point(1, 1, "A");
        Task3Point B = new Task3Point(2, 2, "B");
        Task3Point C = new Task3Point(3, 3, "C");

    }
}
