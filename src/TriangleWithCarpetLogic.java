import java.util.Random;

public class TriangleWithCarpetLogic {
    private static int DOTS = 40000;
    private static double x1 = 1000;
    private static double y1 = 1000;
    private static double x2 = 25000;
    private static double y2 = 3000;
    private static double x3 = 15000;
    private static double y3 = 30000;
    private static double koef = 3;

    public static void main(String[] args) {
        Random value = new Random();

        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1000,900);
        StdDraw.setScale(0, 15000);
        StdDraw.setPenRadius(0.005);
        double x4 = (x1 + x2) / 2;
        double x5 = (x3 + x2) / 2;
        double x6 = (x1 + x3) / 2;
        double y4 = (y1 + y2) / 2;
        double y5 = (y3 + y2) / 2;
        double y6 = (y1 + y3) / 2;
        StdDraw.point(x1,y1);
        StdDraw.point(x2,y2);
        StdDraw.point(x3,y3);
        StdDraw.point(x4,y4);
        StdDraw.point(x5,y5);
        StdDraw.point(x6,y6);

        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<DOTS;i++) {
            int coord = value.nextInt(6);
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
