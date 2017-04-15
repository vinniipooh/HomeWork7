/**
 * Created by Александр on 14.04.2017.
 */


public class MethodTask2 {
    public static double defaultMatrix1[][] = {{1, 2, 2}, {0, 3, 1}, {1, 0, 0}};
    public static double defaultMatrix2[][] = {{0, 0, 1}, {-0.25, 0.5, 0.25}, {0.75, -0.5, -0.7}};


    public String getMatrix(double matrix[][]) {
        String s = "";
        for (double a[] :
                matrix) {
            s += "\n";
            for (double b :
                    a) {
                s += b + " ";
            }
        }
        return s;
    }

    public static boolean checkMatrix(double matrix[][]) {
        int ch = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] == 1) ch++;
                if (i != j && matrix[i][j] == 0) ch++;
            }
        }
        if (ch == 9) return true;
        else return false;
    }

    public static double[][] matrixMultiply(double a[][], double b[][]) {
        double matrix[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a[i][j] * b[i][j];
            }
        }
        return matrix;
    }

    public static double[][] matrixMultiply(int a, double b[][]) {
        double matrix[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a * b[i][j];
            }
        }
        return matrix;
    }

    public static double[][] matrixPlus(double a[][], double b[][]) {
        double matrix[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }

    public static double[][] matrixMinus(double a[][], double b[][]) {
        double matrix[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a[i][j] - b[i][j];
            }
        }
        return matrix;
    }

    public static String getLineofMatrix(double a[][], int line){
        String s = "";
        for (int i = 0; i < 3; i++) {
            s += " " + a[line - 1][i];
        }
        return s;
    }

    public static double detMatrix(double[][]a){
        return a[0][0] * a[1][1] * a[2][2] + a[1][0] * a[2][1] * a[0][2] + a[0][1] * a[1][2] * a[2][0] -
                a[2][0] * a[1][1] * a[0][2] - a[1][0] * a[0][1] * a[2][2] - a[2][1] * a[1][2] * a[0][0];
     }
}
