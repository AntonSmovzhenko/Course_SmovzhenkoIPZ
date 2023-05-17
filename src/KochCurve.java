import java.util.Random;

public class KochCurve {
    private static int LEVEL = 7;
    private static double x1 = 100;
    private static double y1 = 100;
    private static double x2 = 900;
    private static double y2 = 100;

    public static void main(String[] args) {
        Random value = new Random();
        StdDraw.setCanvasSize(1000, 500);
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 500);
        StdDraw.setPenRadius(0.005);

        drawKochCurve(x1, y1, x2, y2, LEVEL, value);
    }

    public static void drawKochCurve(double x1, double y1, double x2, double y2, int level, Random value) {
        if (level == 0) {
            StdDraw.line(x1, y1, x2, y2);
        } else {
            double deltaX = (x2 - x1) / 3.0;
            double deltaY = (y2 - y1) / 3.0;

            double x1New = x1 + deltaX;
            double y1New = y1 + deltaY;

            double x2New = x2 - deltaX;
            double y2New = y2 - deltaY;

            double xMid = x1New + (x2New - x1New) * 0.5 - deltaY * Math.sqrt(3) / 2.0;
            double yMid = y1New + (y2New - y1New) * 0.5 + deltaX * Math.sqrt(3) / 2.0;

            drawKochCurve(x1, y1, x1New, y1New, level - 1, value);
            drawKochCurve(x1New, y1New, xMid, yMid, level - 1, value);
            drawKochCurve(xMid, yMid, x2New, y2New, level - 1, value);
            drawKochCurve(x2New, y2New, x2, y2, level - 1, value);
        }
    }
}