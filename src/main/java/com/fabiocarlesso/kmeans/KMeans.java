package com.fabiocarlesso.kmeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KMeans {
    private List<Point> points;
    private List<Cluster> clusters;

    public KMeans(List<Point> points, int k) {
        this.points = points;
        this.clusters = initializeClusters(k);
    }

    public List<Point> run(int maxIterations) {
        for (int iteration = 1; iteration <= maxIterations; iteration++) {
            assignPointsToClusters();
            boolean converged = updateClusterCentroids();
            if (converged) {
                System.out.println("Converged after " + iteration + " iterations.");
                break;
            }
        }
        return points;
    }

    private List<Cluster> initializeClusters(int k) {
        List<Cluster> initialClusters = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < k; i++) {
            int randomIndex = random.nextInt(points.size());
            Point centroid = points.get(randomIndex);
            Cluster cluster = new Cluster(centroid);
            initialClusters.add(cluster);
        }

        return initialClusters;
    }

    private void assignPointsToClusters() {
        for (Cluster cluster : clusters) {
            cluster.clearPoints();
        }

        for (Point point : points) {
            double minDistance = Double.MAX_VALUE;
            int assignedCluster = -1;

            for (int i = 0; i < clusters.size(); i++) {
                Point centroid = clusters.get(i).getCentroid();
                double distance = calculateDistance(point, centroid);
                if (distance < minDistance) {
                    minDistance = distance;
                    assignedCluster = i;
                }
            }

            point.setCluster(assignedCluster);
            clusters.get(assignedCluster).addPoint(point);
        }
    }

    private boolean updateClusterCentroids() {
        boolean converged = true;

        for (Cluster cluster : clusters) {
            double sumX = 0.0;
            double sumY = 0.0;
            List<Point> points = cluster.getPoints();

            for (Point point : points) {
                sumX += point.getX();
                sumY += point.getY();
            }

            int numPoints = points.size();
            double newCentroidX = sumX / numPoints;
            double newCentroidY = sumY / numPoints;
            Point newCentroid = new Point(newCentroidX, newCentroidY);

            if (newCentroidX != cluster.getCentroid().getX() || newCentroidY != cluster.getCentroid().getY()) {
                converged = false;
                cluster.setCentroid(newCentroid);
            }
        }

        return converged;
    }

    private double calculateDistance(Point point1, Point point2) {
        double dx = point1.getX() - point2.getX();
        double dy = point1.getY() - point2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
