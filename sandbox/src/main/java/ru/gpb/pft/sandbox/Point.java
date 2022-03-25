package ru.gpb.pft.sandbox;

public class Point {
    double coorX;
    double coorY;

    Point(double coorX, double coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public double distance(Point p1) {
        return Math.sqrt((this.coorX - p1.coorX) * (this.coorX - p1.coorX) +
                (this.coorY - p1.coorY) * (this.coorY - p1.coorY));
    }
}

class PointRun {
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.coorX - p1.coorX) * (p2.coorX - p1.coorX) + (p2.coorY - p1.coorY) * (p2.coorY - p1.coorY));
    }

    public static void main(String[] args) {
        Point p1 = new Point(112, 23);
        Point p2 = new Point(-3, 9);
        Point p3 = new Point(-32, 19);

        System.out.println("Расстояние между точкой X с координатами: (" + p1.coorX + "; " + p1.coorY + ")" + " и " +
                "точкой У с координатами: (" + p2.coorX + "; " + p2.coorY + ") " +
                "составляет: - " + p1.distance(p3));

        System.out.println("Расстояние между точкой X с координатами: (" + p1.coorX + "; " + p1.coorY + ")" + " и " +
                "точкой У с координатами: (" + p3.coorX + "; " + p3.coorY + ") " +
                "составляет: - " + distance(p1, p2));
    }
}