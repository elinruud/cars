package com.example.cars;

public enum Direction {

    North, East, South, West;


    public Direction turnRight() {

        if (this == Direction.North) {
            return Direction.East;
        } else if (this == Direction.East) {
            return Direction.South;
        } else if (this == Direction.South) {
            return Direction.West;
        } else {
            return Direction.North;
        }

    }

    public Direction turnLeft() {

        if (this == Direction.North) {
            return Direction.West;
        } else if (this == Direction.East) {
            return Direction.North;
        } else if (this == Direction.South) {
            return Direction.East;
        } else {
            return Direction.South;
        }

    }


}

//private double x;
//private double y;

//Direction(double x, double y){
//  this.x = x;
//this.y = y;


//    }

// public double getX() {
//  return x;
//}

//public double getY() {
//  return y;
// }


//public enum Direction {
//
//    UP(0, -1), DOWN(0, 1), LEFT(-1, 0), RIGHT(1, 0);
//
//    private Direction(float x, float y) {
//        this.x = x;
//        this.y = y;
//    }
