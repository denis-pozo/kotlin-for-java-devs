package org.denispozo.javacode;

public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(final int cadence, final int speed, final int gear, int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }


    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a tire width of " + tireWidth + " mm.");
    }

}
