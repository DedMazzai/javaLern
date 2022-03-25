package ru.gpb.pft.sandbox;

public class PointMethod {
    double coorX1;
    double coorY1;
    double coorX2;
    double coorY2;

    PointMethod(double coorX1, double coorY1, double coorX2, double coorY2){
        this.coorX1 = coorX1;
        this.coorY1 = coorY1;
        this.coorX2 = coorX2;
        this.coorY2 = coorY2;
    }
    public double distance() {
        return Math.sqrt((this.coorX2 - this.coorX1) * (this.coorX2 - this.coorX1) +
                (this.coorY2 - this.coorY1) * (this.coorY2 - this.coorY1));

    }
}