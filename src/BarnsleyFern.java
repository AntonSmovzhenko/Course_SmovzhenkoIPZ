import java.awt.Color;

public class BarnsleyFern {
    private static final int MAX_ITERATIONS = 1000000;
    private static double x = 0.0, y = 0.0;

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-3.0, 3.0);
        StdDraw.setYscale(0.0, 10.0);

        StdDraw.setPenColor(Color.GREEN);

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            drawNextDot();
            StdDraw.show();
        }
    }

    private static void drawNextDot() {
        double nextX = 0.0, nextY = 0.0;
        double r = Math.random();

        if (r < 0.01) {
            StdDraw.setPenColor(Color.BLACK);
            nextX = 0.0;
            nextY = 0.16 * y;
        } else if (r < 0.86) {
            StdDraw.setPenColor(Color.RED);
            nextX = 0.85 * x + 0.04 * y;
            nextY = -0.04 * x + 0.85 * y + 1.6;
        } else if (r < 0.93) {
            StdDraw.setPenColor(Color.GREEN);
            nextX = 0.20 * x - 0.26 * y;
            nextY = 0.23 * x + 0.22 * y + 1.6;
        } else {
            StdDraw.setPenColor(Color.BLUE);
            nextX = -0.15 * x + 0.28 * y;
            nextY = 0.26 * x + 0.24 * y + 0.44;
        }


        StdDraw.point(nextX, nextY);
        x = nextX;
        y = nextY;
    }
}