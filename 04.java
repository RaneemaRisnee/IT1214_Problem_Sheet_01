class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

   public int getTicketNumber() {
        return ticketNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

  
}

class BookingSystem {
    private Ticket[] tickets = new Ticket[10];
    private int count = 0;

    public boolean isSeatBooked(int seatNumber) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getSeatNumber() == seatNumber) return true;
        }
        return false;
    }

    public void bookTicket(int ticketNumber, String name, int seatNumber) {
        if (count >= 10) {
            System.out.println("All seats are booked.");
            return;
        }
        if (isSeatBooked(seatNumber)) {
            System.out.println("Seat " + seatNumber + " already booked.");
            return;
        }
        tickets[count++] = new Ticket(ticketNumber, name, seatNumber);
    }

    public void cancelTicket(int ticketNumber) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getTicketNumber() == ticketNumber) {
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[--count] = null;
                return;
            }
        }
        System.out.println("Ticket not found.");
    }

    public void displayTickets() {
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i]);
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        system.bookTicket(1, "Customer A", 1);
        system.bookTicket(2, "Customer B", 2);
        system.bookTicket(3, "Customer C", 3);

        system.cancelTicket(2);

        system.bookTicket(4, "Customer D", 2); // seat 2 was freed

        system.displayTickets();
    }
}