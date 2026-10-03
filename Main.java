/**
 * Description: Entry point for the menu-driven freight management application.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
public class Main {
    /**
     * Starts the freight management menu and handles user selections.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Truck grainTruck = new Truck("TRK-101", 5000.0, 3);
        RefrigeratedTruck coldTruck = new RefrigeratedTruck("COLD-202", 3500.0, 2, 2.0);
        ElectricCargoVan ecoVan = new ElectricCargoVan("EV-303", 1200.0, 75.0);
        ShipmentTracker tracker = new ShipmentTracker("TRACK-9941");
        SmartAgriTruck smartTruck = new SmartAgriTruck("SMRT-211", 5000.0, 4, 5, "Rajesh Naik");

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n============== Manage Freight ==============");
                System.out.println("1. Display grain truck details");
                System.out.println("2. Display refrigerated truck cooling specs");
                System.out.println("3. Display electric cargo van details");
                System.out.println("4. Track shipment GPS");
                System.out.println("5. Monitor shipment temperature");
                System.out.println("6. Display smart agricultural truck details");
                System.out.println("7. Track smart agricultural truck GPS");
                System.out.println("8. Monitor smart agricultural truck temperature");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a number from the menu.");
                    scanner.next();
                    System.out.print("Enter your choice: ");
                }
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        grainTruck.displayTruckDetails();
                        break;
                    case 2:
                        coldTruck.displayCoolingSpecs();
                        break;
                    case 3:
                        ecoVan.displayVanDetails();
                        break;
                    case 4:
                        tracker.trackGPS();
                        break;
                    case 5:
                        tracker.monitorTemperature();
                        break;
                    case 6:
                        smartTruck.displayFullSmartSpecs();
                        break;
                    case 7:
                        smartTruck.trackGPS();
                        break;
                    case 8:
                        smartTruck.monitorTemperature();
                        break;
                    case 0:
                        System.out.println("Exiting freight management system.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a menu option.");
                }
            } while (choice != 0);
        }
    }
}