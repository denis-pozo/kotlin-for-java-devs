package org.denispozo.javacode;

public class Bicycle {


    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(final int gear) {
        this.gear = gear;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(final int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printDescription() {
        System.out.println("Bike is in gear " + gear + " with a cadence of " + cadence + " travelling at a speed of " + speed + ".");
    }
}

