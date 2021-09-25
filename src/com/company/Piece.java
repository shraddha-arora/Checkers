package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piece {
    private double x;
    private double y;
    private double radius;
    private Circle circle;

    public Piece(double x, double y, double radius, Circle circle){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.circle = circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    public double getRadius() {
        return radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setColor(Color color){
        circle.setFill(color);
    }
    public void draw(){
        circle.setRadius(radius);
        circle.setTranslateX(x);
        circle.setTranslateY(y);
    }
}
