import java.util.Random;

public class Hecsagon {

    private static int DOTS = 100000;

    private static double x1 = 6600*3;
    private static double y1 = 6600*3;
    private static double x2 = 13200*3;
    private static double y2 = 6600*3;
    private static double x3 = 16500*3;
    private static double y3 = 13200*3;
    private static double x4 = 13200*3;
    private static double y4 = 19800*3;
    private static double x5 = 6600*3;
    private static double y5 = 19800*3;
    private static double x6 = 3300*3;
    private static double y6 = 13200*3;

    private static double koef = 3;

    public static void main(String[] args) {
        Random value = new Random();


        int coord = 0;
        int prevCoord = -1;
        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1200, 1000);
        StdDraw.setScale(0, 45000);
        StdDraw.setPenRadius(0.005);
        StdDraw.point(x1, y1);
        StdDraw.point(x2, y2);
        StdDraw.point(x3, y3);
        StdDraw.point(x4, y4);
        StdDraw.point(x5, y5);
        StdDraw.point(x6, y6);
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 0; i < DOTS; i++) {

            while (prevCoord == coord) {
                coord = value.nextInt(6);
            }
            prevCoord = coord;


            if (coord == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.point((x1 + x) / koef, (y1 + y) / koef);
                x = (x1 + x) / koef;
                y = (y1 + y) / koef;
            } else if (coord == 1) {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.point((x2 + x) / koef, (y2 + y) / koef);
                x = (x2 + x) / koef;
                y = (y2 + y) / koef;
            } else if (coord == 2) {
                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.point((x3 + x) / koef, (y3 + y) / koef);
                x = (x3 + x) / koef;
                y = (y3 + y) / koef;
            } else if (coord == 3) {
                StdDraw.setPenColor(StdDraw.ORANGE);
                StdDraw.point((x4 + x) / koef, (y4 + y) / koef);
                x = (x4 + x) / koef;
                y = (y4 + y) / koef;
            }else if (coord == 4) {
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.point((x5 + x) / koef, (y5 + y) / koef);
                x = (x5 + x) / koef;
                y = (y5 + y) / koef;
            } else {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x6 + x) / koef, (y6 + y) / koef);
                x = (x6 + x) / koef;
                y = (y6 + y) / koef;
            }
        }
    }
}
