import java.util.Random;

public class TriangleWithCarpetLogicKoef4 {
    private static int DOTS = 40000;
    private static double x1 = 6000;
    private static double y1 = 6000;
    private static double x2 = 8000;
    private static double y2 = 6000;
    private static double x3 = 10000;
    private static double y3 = 6000;
    private static double x4 = 12000;
    private static double y4 = 6000;
    private static double x5 = 7000;
    private static double y5 = 8000;
    private static double x6 = 8000;
    private static double y6 = 10000;
    private static double x7 = 9000;
    private static double y7 = 12000;
    private static double x8 = 10000;
    private static double y8 = 10000;
    private static double x9 = 11000;
    private static double y9 = 8000;
    private static double koef = 4;

    public static void main(String[] args) {
        Random value = new Random();
        double x = value.nextInt(32768);
        double y = value.nextInt(32768);
        StdDraw.setCanvasSize(1000,900);
        StdDraw.setScale(0, 4400);
        StdDraw.setPenRadius(0.005);
        StdDraw.point(x1,y1);
        StdDraw.point(x2,y2);
        StdDraw.point(x3,y3);
        StdDraw.point(x4,y4);
        StdDraw.point(x5,y5);
        StdDraw.point(x6,y6);
        StdDraw.point(x7,y7);
        StdDraw.point(x8,y8);
        StdDraw.point(x9,y9);


        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<DOTS;i++) {
            int coord = value.nextInt(9);
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
            }else if (coord == 5) {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x6 + x) / koef, (y6 + y) / koef);
                x = (x6 + x) / koef;
                y = (y6 + y) / koef;
            } else if (coord == 6) {
                StdDraw.setPenColor(StdDraw.BOOK_BLUE);
                StdDraw.point((x7 + x) / koef, (y7 + y) / koef);
                x = (x7 + x) / koef;
                y = (y7 + y) / koef;
            } else if (coord == 7) {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.point((x8 + x) / koef, (y8 + y) / koef);
                x = (x8 + x) / koef;
                y = (y8 + y) / koef;
            }else if (coord == 8) {
                StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
                StdDraw.point((x9 + x) / koef, (y9 + y) / koef);
                x = (x9 + x) / koef;
                y = (y9 + y) / koef;
            }
        }
    }
}
