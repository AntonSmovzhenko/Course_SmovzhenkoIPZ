import java.util.Random;

public class TriangleWithCarpetLogicKoef5WithInside {
    private static int DOTS = 40000;
    private static double x1 = 1000;
    private static double y1 = 1000;
    private static double x2 = 25000;
    private static double y2 = 3000;
    private static double x3 = 15000;
    private static double y3 = 30000;
    private static double x13 = 13666.6667;
    private static double y13 = 11333.3333;
    private static double koef = 5;

    public static void main(String[] args) {
        Random value = new Random();

        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1000,900);
        StdDraw.setScale(0, 7600);
        StdDraw.setPenRadius(0.005);
        double x4 = (x1 + x2) / 2;
        double x5 = (x3 + x2) / 2;
        double x6 = (x1 + x3) / 2;
        double y4 = (y1 + y2) / 2;
        double y5 = (y3 + y2) / 2;
        double y6 = (y1 + y3) / 2;

        double x7 = (x1 + x4) / 2;
        double x8 = (x4 + x2) / 2;
        double x9 = (x5 + x3) / 2;
        double x10 = (x5 + x2) / 2;
        double x11 = (x3 + x6) / 2;
        double x12 = (x1 + x6) / 2;

        double y7 = (y1 + y4) / 2;
        double y8 = (y4 + y2) / 2;
        double y9 = (y5 + y3) / 2;
        double y10 = (y5 + y2) / 2;
        double y11 = (y3 + y6) / 2;
        double y12 = (y1 + y6) / 2;

        StdDraw.point(x1,y1);
        StdDraw.point(x2,y2);
        StdDraw.point(x3,y3);
        StdDraw.point(x4,y4);
        StdDraw.point(x5,y5);
        StdDraw.point(x6,y6);
        StdDraw.point(x7,y7);
        StdDraw.point(x8,y8);
        StdDraw.point(x9,y9);
        StdDraw.point(x10,y10);
        StdDraw.point(x11,y11);
        StdDraw.point(x12,y12);

        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<DOTS;i++) {
            int coord = value.nextInt(13);
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
            }else if (coord == 9) {
                StdDraw.setPenColor(StdDraw.PINK);
                StdDraw.point((x10 + x) / koef, (y10 + y) / koef);
                x = (x10 + x) / koef;
                y = (y10 + y) / koef;
            } else if (coord == 10) {
                StdDraw.setPenColor(StdDraw.CYAN);
                StdDraw.point((x11 + x) / koef, (y11 + y) / koef);
                x = (x11 + x) / koef;
                y = (y11 + y) / koef;
            } else if (coord == 11) {
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.point((x12 + x) / koef, (y12 + y) / koef);
                x = (x12 + x) / koef;
                y = (y12 + y) / koef;
            }else {
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.point((x13 + x) / koef, (y13 + y) / koef);
                x = (x13 + x) / koef;
                y = (y13 + y) / koef;
            }
        }
    }
}
