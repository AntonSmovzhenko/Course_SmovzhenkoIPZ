import java.util.Random;

public class SquareWithInsideWithAnotherPossibility {

    private static int DOTS = 45000;

    private static double x1 = 3000;
    private static double y1 = 3000;
    private static double x2 = 43000;
    private static double y2 = 3000;
    private static double x3 = 3000;
    private static double y3 = 43000;
    private static double x4 = 43000;
    private static double y4 = 43000;
    private static double x5 = 23000;
    private static double y5 = 23000;
    private static double koef = 2.5;

    public static void main(String[] args) {
        Random value = new Random();


        int coord = 0;
        int prevCoord = -1;
        double x = value.nextInt(32768);
        double y = value.nextInt(32768);

        StdDraw.setCanvasSize(1200,1000);
        StdDraw.setScale(0, 45000);
        StdDraw.setPenRadius(0.005);
        StdDraw.point(x1,y1);
        StdDraw.point(x2,y2);
        StdDraw.point(x3,y3);
        StdDraw.point(x4,y4);
        StdDraw.point(x5,y5);
        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<DOTS;i++) {

            while(prevCoord==coord) {
                coord = value.nextInt(6);
            }
            prevCoord=coord;

            if(coord==0){
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.point((x1+x)/koef,(y1+y)/koef);
                x=(x1+x)/koef;
                y=(y1+y)/koef;
            }else if(coord==1){
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.point((x2+x)/koef,(y2+y)/koef);
                x=(x2+x)/koef;
                y=(y2+y)/koef;
            } else if(coord==2){
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.point((x3+x)/koef,(y3+y)/koef);
                x=(x3+x)/koef;
                y=(y3+y)/koef;
            }else if(coord==3){
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.point((x4+x)/koef,(y4+y)/koef);
                x=(x4+x)/koef;
                y=(y4+y)/koef;
            }else{
                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.point((x5+x)/koef,(y5+y)/koef);
                x=(x5+x)/koef;
                y=(y5+y)/koef;

            }
        }
    }
}
