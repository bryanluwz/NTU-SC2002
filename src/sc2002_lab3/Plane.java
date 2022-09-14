package sc2002_lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private final PlaneSeat[] seat;
    private int numEmptySeat;

    /* Constructor without arguments
    public Plane() {
        this.numEmptySeat = 12;
        this.seat = new PlaneSeat[this.numEmptySeat];
        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = new PlaneSeat(i + 1);
        }
    }
    */

    public Plane(int numEmptySeat) {
        this.numEmptySeat = numEmptySeat;
        this.seat = new PlaneSeat[numEmptySeat];
        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = new PlaneSeat(i + 1);
        }
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] seatCopy = this.seat.clone();
        Arrays.sort(seatCopy, Comparator.comparingInt(PlaneSeat::getCustomerId));
        return seatCopy;
    }

    public void showNumEmptySeats() {
        System.out.println(this.numEmptySeat + " empty seats\n");
    }

    public void showEmptySeats() {
        boolean isAnyUnassigned = false;

        System.out.println("Empty Seats:");

        for (PlaneSeat i : this.seat) {
            if (!i.isOccupied()) {
                isAnyUnassigned = true;
                System.out.printf("Seat ID: %d\n", i.getSeatId());
            }
        }
        if (!isAnyUnassigned) {
            System.out.println("No empty seats! :D");
        }
        System.out.println("\n");
    }

    public void showAssignedSeats(boolean bySeatId) {
        boolean isAnyAssigned = false;

        System.out.println("Assigned Seats:");

        if (bySeatId) {
            for (PlaneSeat i : this.seat) {
                if (i.isOccupied()) {
                    System.out.printf("Seat ID: %d, Customer ID: %d\n", i.getSeatId(), i.getCustomerId());
                    isAnyAssigned = true;
                }
            }
        } else {
            for (PlaneSeat i : this.sortSeats()) {
                if (i.isOccupied()) {
                    System.out.printf("Customer ID: %d, Seat ID: %d\n", i.getCustomerId(), i.getSeatId());
                    isAnyAssigned = true;
                }
            }
        }
        if (!isAnyAssigned) {
            System.out.println("No assigned seats! :(");
        }
        System.out.println("\n");
    }

    public void assignSeat(int seatId, int customerId) {
        seatId--;
        if (!(0 <= seatId && seatId < this.seat.length)) {
            System.out.println("Oops the seat does not exist 0.o\n");
            return;
        }

        if (this.seat[seatId].isOccupied()) {
            System.out.println("This set is already assigned, get another seat :3\n");
            return;
        }

        this.seat[seatId].assign(customerId);
        this.numEmptySeat--;
        System.out.println("Seat assigned!\n");
    }

    public void unAssignSeat(int seatId) {
        seatId--;
        if (!(0 <= seatId && seatId < this.seat.length)) {
            System.out.println("Oops the seat does not exist 0.o\n");
            return;
        }

        if (!this.seat[seatId].isOccupied()) {
            System.out.println("This seat is already unassigned\n");
            return;
        }

        this.seat[seatId].unAssign();
        this.numEmptySeat++;
        System.out.println("Seat unassigned!\n");
    }
}
