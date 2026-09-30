class ReservationProcess extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Reservation status confirmed");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Reservation Thread interrupted");
        }
    }
}

class TicketStatus implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket status: Confirmed");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Status Thread interrupted");
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        ReservationProcess reservation = new ReservationProcess();
        TicketStatus status = new TicketStatus();

        Thread ticket = new Thread(status);

        reservation.start();
        ticket.start();

        System.out.println("Both Threads started");
    }
}