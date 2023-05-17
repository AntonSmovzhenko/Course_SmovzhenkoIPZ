import java.util.Random;

public class CarpetKoef5WithSquareInside {
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
    private static double x9 = 53000;
    private static double y9 = 68000;
    private static double x10 = 23000;
    private static double y10 = 68000;
    private static double x11 = 8000;
    private static double y11 = 23000;
    private static double x12 = 8000;
    private static double y12 = 53000;
    private static double x13 = 23000;
    private static double y13 = 8000;
    private static double x14 = 53000;
    private static double y14 = 8000;
    private static double x15 = 68000;
    private static double y15 = 23000;
    private static double x16 = 68000;
    private static double y16 = 53000;
    private static double x17 = 38000;
    private static double y17 = 38000;
    private static double koef = 5;

    public static void main(String[] args) {
        Random value = new Random();

        int coord = 0;
        double x = value.nextInt(32768);
        double y = value.nextInt(32768);



        StdDraw.setCanvasSize(1200, 1000);
        StdDraw.setScale(0, 20000);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(x1, y1);
        StdDraw.point(x2, y2);
        StdDraw.point(x3, y3);
        StdDraw.point(x4, y4);
        StdDraw.point(x5, y5);
        StdDraw.point(x6, y6);
        StdDraw.point(x7, y7);
        StdDraw.point(x8, y8);
        StdDraw.point(x9, y9);
        StdDraw.point(x10, y10);
        StdDraw.point(x11, y11);
        StdDraw.point(x12, y12);
        StdDraw.point(x13, y13);
        StdDraw.point(x14, y14);
        StdDraw.point(x15, y15);
        StdDraw.point(x16, y16);

        for (int i = 0; i < DOTS; i++) {

            coord = value.nextInt(17);

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
                StdDraw.setPenColor(StdDraw.BOOK_BLUE);
                StdDraw.point((x6 + x) / koef, (y6 + y) / koef);
                x = (x6 + x) / koef;
                y = (y6 + y) / koef;
            } else if (coord == 6) {
                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.point((x7 + x) / koef, (y7 + y) / koef);
                x = (x7 + x) / koef;
                y = (y7 + y) / koef;
            }else if (coord == 7) {
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.point((x8 + x) / koef, (y8 + y) / koef);
                x = (x8 + x) / koef;
                y = (y8 + y) / koef;
            } else if (coord == 8) {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.point((x9 + x) / koef, (y9 + y) / koef);
                x = (x9 + x) / koef;
                y = (y9 + y) / koef;
            } else if (coord == 9) {
                StdDraw.setPenColor(StdDraw.YELLOW);
                StdDraw.point((x10 + x) / koef, (y10 + y) / koef);
                x = (x10 + x) / koef;
                y = (y10 + y) / koef;
            } else if (coord == 10) {
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.point((x11 + x) / koef, (y11 + y) / koef);
                x = (x11 + x) / koef;
                y = (y11 + y) / koef;
            } else if (coord == 11) {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.point((x12 + x) / koef, (y12 + y) / koef);
                x = (x12 + x) / koef;
                y = (y12 + y) / koef;
            } else if (coord == 12) {
                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.point((x13 + x) / koef, (y13 + y) / koef);
                x = (x13 + x) / koef;
                y = (y13 + y) / koef;
            } else if (coord == 13) {
                StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                StdDraw.point((x14 + x) / koef, (y14 + y) / koef);
                x = (x14 + x) / koef;
                y = (y14 + y) / koef;
            }else if (coord == 14) {
                StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
                StdDraw.point((x15 + x) / koef, (y15 + y) / koef);
                x = (x15 + x) / koef;
                y = (y15 + y) / koef;
            }else if (coord == 15) {
                StdDraw.setPenColor(StdDraw.PINK);
                StdDraw.point((x16 + x) / koef, (y16 + y) / koef);
                x = (x16 + x) / koef;
                y = (y16 + y) / koef;
            }else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.point((x17 + x) / koef, (y17 + y) / koef);
                x = (x17 + x) / koef;
                y = (y17 + y) / koef;
            }
        }
    }
}
