package com.fabiocarlesso.kmeans;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    @Getter
    @Setter
    private Point centroid;
    @Getter
    private List<Point> points;

    public Cluster(Point centroid) {
        this.centroid = centroid;
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void clearPoints() {
        points.clear();
    }
}
