package org.denispozo.javacode;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int seatHeight, final int cadence, final int speed, final int gear) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }


    public int getSeatHeight() {
        return seatHeight;
    }


    public void setSeatHeight(final int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has a seat height of " + seatHeight + " inches.");
    }

}
