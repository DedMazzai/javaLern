package ru.gpb.pft.sandbox;

public class Point {
    double coorX;
    double coorY;

    Point(double coorX, double coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.coorX - p1.coorX) * (p2.coorX - p1.coorX) + (p2.coorY - p1.coorY) * (p2.coorY - p1.coorY));

    }
}

class PointRun {
    public static void main(String[] args) {
        Point p1 = new Point(112, 23);
        Point p2 = new Point(-3, 9);

        System.out.println("Расстояние между точкой X с координатами: (" + p1.coorX + "; " + p1.coorY + ")" + " и " +
                "точкой У с координатами: (" + p2.coorX + "; " + p2.coorY + ") " +
                "составляет: - " + Point.distance(p1, p2));


        System.out.println("Расстояние между точкой X с координатами: (" + p1.coorX + "; " + p1.coorY + ")" + " и " +
                "точкой У с координатами: (" + p1.coorX + "; " + p2.coorY + ") " +
                "составляет: - " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.coorX - p1.coorX) * (p2.coorX - p1.coorX) + (p2.coorY - p1.coorY) * (p2.coorY - p1.coorY));

    }
}