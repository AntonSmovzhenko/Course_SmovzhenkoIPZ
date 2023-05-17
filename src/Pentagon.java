import java.util.Random;

public class Pentagon {

    private static int DOTS = 40000;

    private static double x1 = 10000;
    private static double y1 = 16600;
    private static double x2 = 23300;
    private static double y2 = 6600;
    private static double x3 = 36600;
    private static double y3 = 16600;
    private static double x4 = 31600;
    private static double y4 = 33000;
    private static double x5 = 15000;
    private static double y5 = 33000;
    private static double koef = 2.45;

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
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 0; i < DOTS; i++) {
            // koef = value.nextInt(3)+1;
            while (prevCoord == coord) {
                coord = value.nextInt(5);
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
            } else {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x5 + x) / koef, (y5 + y) / koef);
                x = (x5 + x) / koef;
                y = (y5 + y) / koef;
            }
        }
    }
}
