package com.example.cars;

public enum Direction{

    North(0, 1), East(1 ,0), South(0, -1),  West(-1 ,0);

    private double x;
    private double y;

    Direction(double x, double y){
        this.x = x;
        this.y = y;


        }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}








//public enum Direction {
//
//    UP(0, -1), DOWN(0, 1), LEFT(-1, 0), RIGHT(1, 0);
//
//    private Direction(float x, float y) {
//        this.x = x;
//        this.y = y;
//    }