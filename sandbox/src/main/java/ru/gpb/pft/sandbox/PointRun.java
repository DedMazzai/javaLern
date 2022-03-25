package ru.gpb.pft.sandbox;

public class PointRun {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.coorX = 112;
        p1.coorY = 1;

        Point p2 = new Point();
        p2.coorX =111;
        p2.coorY =3;

        System.out.println("Расстояние между точкой X с координатами: (" + p1.coorX + "; " + p1.coorY + ")" + " и " +
                "точкой У с координатами: (" + p2.coorX + "; " + p2.coorY + ") " +
                "составляет: - " + Point.distance(p1, p2));



        PointMethod pm = new PointMethod(21,22,4,55);
        System.out.println("Расстояние между точкой X с координатами: (" + pm.coorX1 + "; " + pm.coorY1 + ")" + " и " +
                "точкой У с координатами: (" + pm.coorX2 + "; " + pm.coorY2 + ") " +
                "составляет: - " + pm.distance());
    }

}
