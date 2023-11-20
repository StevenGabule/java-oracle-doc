package OOP;

import java.awt.*;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence= newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed += increment;
    }

    void printStates() {
        System.out.println("Cadence:" + cadence + " Speed:" + speed + " Gear:" + gear);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle( 23, 56);
        moveCircle(myCircle, 23, 56);
    }

    public double computePayment(double loadAmt, double rate, double futureValue, int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), - numPeriods);
        double denominator = (1 - partial1) / interest;
        return (-loadAmt / denominator) - ((futureValue * partial1) / denominator);
    }

    public Polygon polygonFrom(Point[] corners) {
        int numberOfSides = corners.length;
        double squareOfSide1, lengthOfSide1;
        squareOfSide1 = (corners[1].x - corners[0].x) * (corners[1].x - corners[0].x) + (corners[1].y - corners[0].y);
        lengthOfSide1 = Math.sqrt(squareOfSide1);
        return corners;
    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);
        circle = new Circle(0, 0);
    }
}

class Circle {
    int x;
    int y;

    Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int newValue) {
        x = newValue;
    }
    public int getX() {
        return x;
    }

    void setY(int newValue) {
        y = newValue;
    }
    public int getY() {
        return y;
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

interface IBicycle {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class NewBicycle implements IBicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}


