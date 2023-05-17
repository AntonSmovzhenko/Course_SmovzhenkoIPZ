import java.util.Random;

public class Carpet {

    private static int DOTS = 70000;

    private static double x1 = 8000;
    private static double y1 = 8000;
    private static double x2 = 68000;
    private static double y2 = 8000;
    private static double x3 = 8000;
    private static double y3 = 68000;
    private static double x4 = 68000;
    private static double y4 = 68000;
    private static double x5 = 38000;
    private static double y5 = 8000;
    private static double x6 = 8000;
    private static double y6 = 38000;
    private static double x7 = 68000;
    private static double y7 = 38000;
    private static double x8 = 38000;
    private static double y8 = 68000;
    private static double koef = 3;

    public static void main(String[] args) {
        Random value = new Random();

        int coord = 0;
        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1200, 1000);
        StdDraw.setScale(0, 45000);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(x1, y1);
        StdDraw.point(x2, y2);
        StdDraw.point(x3, y3);
        StdDraw.point(x4, y4);
        StdDraw.point(x5, y5);
        StdDraw.point(x6, y6);
        StdDraw.point(x7, y7);
        StdDraw.point(x8, y8);

        for (int i = 0; i < DOTS; i++) {

            coord = value.nextInt(8);

            if (coord == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.point((x1 + x) / koef, (y1 + y) / koef);
                x = (x1 + x) / koef;
                y = (y1 + y) / koef;
            } else if (coord == 1) {
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.point((x2 + x) / koef, (y2 + y) / koef);
                x = (x2 + x) / koef;
                y = (y2 + y) / koef;
            } else if (coord == 2) {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.point((x3 + x) / koef, (y3 + y) / koef);
                x = (x3 + x) / koef;
                y = (y3 + y) / koef;
            } else if (coord == 3) {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x4 + x) / koef, (y4 + y) / koef);
                x = (x4 + x) / koef;
                y = (y4 + y) / koef;
            } else if (coord == 4) {
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.point((x5 + x) / koef, (y5 + y) / koef);
                x = (x5 + x) / koef;
                y = (y5 + y) / koef;
            } else if (coord == 5) {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.point((x6 + x) / koef, (y6 + y) / koef);
                x = (x6 + x) / koef;
                y = (y6 + y) / koef;
            } else if (coord == 6) {
                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.point((x7 + x) / koef, (y7 + y) / koef);
                x = (x7 + x) / koef;
                y = (y7 + y) / koef;
            } else {
                StdDraw.setPenColor(StdDraw.YELLOW);
                StdDraw.point((x8 + x) / koef, (y8 + y) / koef);
                x = (x8 + x) / koef;
                y = (y8 + y) / koef;
            }
        }
    }
}
