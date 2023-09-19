import java.util.Scanner;

class Customer {
    private String name;
    private int unitsConsumed;

    public Customer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }
}

class BillingSystem {
    private static final double UNIT_RATE = 10.0;

    public double calculateBill(int unitsConsumed) {
        return unitsConsumed * UNIT_RATE;
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        Customer customer = new Customer(customerName, unitsConsumed);

        BillingSystem billingSystem = new BillingSystem();
        double billAmount = billingSystem.calculateBill(customer.getUnitsConsumed());

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Units Consumed: " + customer.getUnitsConsumed());
        System.out.println("Bill Amount: $" + billAmount);
    }
}
