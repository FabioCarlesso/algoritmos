package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.kmeans.KMeans;
import com.fabiocarlesso.kmeans.Point;

import java.util.ArrayList;
import java.util.List;

public class KMeansMain {
    public static void kMeansMain(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(1.0, 1.0));
        points.add(new Point(1.5, 2.0));
        points.add(new Point(3.0, 4.0));
        points.add(new Point(5.0, 7.0));
        points.add(new Point(3.5, 5.0));
        points.add(new Point(4.5, 5.0));
        points.add(new Point(3.5, 4.5));

        int k = 2;
        int maxIterations = 10;

        KMeans kMeans = new KMeans(points, k);
        List<Point> finalPoints = kMeans.run(maxIterations);

        for (Point point : finalPoints) {
            System.out.println("Point (" + point.getX() + ", " + point.getY() + ") assigned to cluster " + point.getCluster());
        }
    }
}
