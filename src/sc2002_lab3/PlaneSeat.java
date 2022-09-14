package sc2002_lab3;

public class PlaneSeat {
    private final int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
        this.assigned = false;
        this.customerId = Integer.MAX_VALUE;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getSeatId() {
        return this.seatId;
    }

    public boolean isOccupied() {
        return this.assigned;
    }

    public void assign(int customerId) {
        this.customerId = customerId;
        this.assigned = true;
    }

    public void unAssign() {
        this.customerId = Integer.MAX_VALUE;
        this.assigned = false;
    }
}
