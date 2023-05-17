import java.util.Random;

public class TriangleWithInside {
    private static int DOTS = 40000;
    private static double x1 = 1000;
    private static double y1 = 1000;
    private static double x2 = 25000;
    private static double y2 = 3000;
    private static double x3 = 15000;
    private static double y3 = 30000;
    private static double x4 = 13666.6667;
    private static double y4 = 11333.3333;
    private static double koef = 2.5;

    public static void main(String[] args) {
        Random value = new Random();

        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1000,900);
        StdDraw.setScale(0, 20000);
        StdDraw.setPenRadius(0.005);
        StdDraw.point(x1,y1);
        StdDraw.point(x2,y2);
        StdDraw.point(x3,y3);

        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<DOTS;i++) {
            int coord = value.nextInt(4);
            if(coord==0){
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x1+x)/koef,(y1+y)/koef);
                x=(x1+x)/koef;
                y=(y1+y)/koef;
            }else if(coord==1){
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.point((x2+x)/koef,(y2+y)/koef);
                x=(x2+x)/koef;
                y=(y2+y)/koef;
            }else if(coord==2){
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.point((x3+x)/koef,(y3+y)/koef);
                x=(x3+x)/koef;
                y=(y3+y)/koef;
            }else{
                StdDraw.setPenColor(StdDraw.ORANGE);
                StdDraw.point((x4 + x) / koef, (y4 + y) / koef);
                x = (x4 + x) / koef;
                y = (y4 + y) / koef;
            }
        }
    }
}
