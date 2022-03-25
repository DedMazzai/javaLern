package ru.gpb.pft.sandbox;

public class Point {
    double coorX;
    double coorY;


    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.coorX - p1.coorX) * (p2.coorX - p1.coorX) + (p2.coorY - p1.coorY) * (p2.coorY - p1.coorY));

    }
}
