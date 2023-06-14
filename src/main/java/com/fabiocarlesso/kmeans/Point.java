package com.fabiocarlesso.kmeans;

import lombok.Getter;
import lombok.Setter;

public class Point {
    @Getter
    private double x;
    @Getter
    private double y;
    @Getter
    @Setter
    private int cluster;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.cluster = -1;
    }

}
