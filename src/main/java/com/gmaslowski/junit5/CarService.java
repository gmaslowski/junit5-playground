package com.gmaslowski.junit5;

public class CarService {

    private final WheelControl wheel;

    public CarService(WheelControl wheel) {
        this.wheel = wheel;
    }

    public void driveRandomly() {
        wheel.turnLeft(30);
        wheel.turnRight(45);
    }
}
