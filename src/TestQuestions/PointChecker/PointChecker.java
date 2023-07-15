package TestQuestions.PointChecker;

import java.util.ArrayList;
import java.util.List;

public class PointChecker {
    /*Points (1,4),(4,4),(3,2),(5,1)
    Design an implementation that given set of co ordinates determines:
    the two closet points between each other
    the two distant points between each other.

     */
    public static void main(String[] args){

        List<Point> points = new ArrayList<>();
        points.add(new Point(1,4));
        points.add(new Point(4,4));
        points.add(new Point(3,2));
        points.add(new Point(5,1));

        Point closestPoint1 = null;
        Point closestPoint2 = null;
        double minClosePoint = Double.MAX_VALUE;

        Point distantPoint1 = null;
        Point distantPoint2 = null;
        double maxDistantPoint = 0;

        for(int i=0;i<points.size();i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point p1 = points.get(i);
                Point p2 = points.get(j);

                double distance = CalculateDistance(points.get(i), points.get(j));
                if(distance < minClosePoint){
                    minClosePoint = distance;
                    closestPoint1 = p1;
                    closestPoint2 = p2;
                }

                if(distance > maxDistantPoint){
                    maxDistantPoint = distance;
                    distantPoint1 = p1;
                    distantPoint2 = p2;
                }

            }
        }
        System.out.println("Close points: "+closestPoint1.getX() +" "+ closestPoint1.getY() +" And " +closestPoint2.getX() +" "+ closestPoint2.getY());

        System.out.println("Distant points: "+distantPoint1.getX() +" "+ distantPoint1.getY() +" And " +distantPoint2.getX() +" "+ distantPoint2.getY());
    }

    private static double CalculateDistance(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}
