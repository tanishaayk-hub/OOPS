class Payment {

    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made");
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment of Rs." + amount
                + " made using " + method);
    }
}

class UPIPayment extends Payment {

    void makePayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount
                + " successful.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p = new Payment();

        p.makePayment(500);
        p.makePayment(1000, "Credit Card");

        UPIPayment upi = new UPIPayment();
        upi.makePayment(1500);

        System.out.println("\nPayment Details:");
        System.out.println("Payment 1: Rs 500");
        System.out.println("Payment 2: Rs 1000 - Credit Card");
        System.out.println("Payment 3: Rs 1500 - UPI");
    }
}