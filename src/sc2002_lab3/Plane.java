package sc2002_lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        this.numEmptySeat = 12;
        this.seat = new PlaneSeat[this.numEmptySeat];
        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i].setSeatId(i);
        }
    }

    public Plane(int numEmptySeat) {
        this.numEmptySeat = numEmptySeat;
        this.seat = new PlaneSeat[numEmptySeat];
        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i].setSeatId(i);
        }
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] seatCopy = this.seat.clone();
        Arrays.sort(seatCopy, (o1, o2) -> Integer.compare(o2.getCustomerId(), o1.getCustomerId()));
        return seatCopy;
    }

    public void showNumEmptySeats() {
        System.out.println(this.numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("Empty Seats:");
        for (PlaneSeat i : this.seat) {
        if (!i.isOccupied()) {
                System.out.printf("%d", i.getSeatId());
            }
        }
        System.out.println("");
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("Assigned Seats:");
        if (bySeatId) {
            for (PlaneSeat i : this.seat) {
                if (i.isOccupied()) {
                    System.out.printf("Seat ID: %d, Customer ID: %d\n", i.getSeatId(), i.getCustomerId());
                }
            }
        }
        else {
            for (PlaneSeat i : this.sortSeats()) {
                if (i.isOccupied()) {
                    System.out.printf("Customer ID: %d, Seat ID: %d\n", i.getCustomerId(), i.getSeatId());
                }
            }
        }
    }

    public void assignSeat(int seatId, int customerId) {
        if (this.seat[seatId].isOccupied()) {
            System.out.println("This set is already assigned, get another seat :3");
            return;
        }
        this.seat[seatId].assign(customerId);
    }

    public void unAssignSeat(int seatId) {
        if (!this.seat[seatId].isOccupied()) {
            System.out.println("This seat is already unassigned");
            return;
        }
        this.seat[seatId].unAssign();
    }
}
