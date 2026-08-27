public class Main {
    public static void main(String[] args) {
        System.out.println("==============Manage Freight==============");
        System.out.println("Grain Truck: ");
        Truck grainTruck = new Truck("TRK-101", 5000.0, 3);
        grainTruck.displayTruckDetails();

        System.out.println("\nRefrigerated Meat Truck: ");
        RefrigeratedTruck coldTruck = new RefrigeratedTruck("COLD-202", 3500.0, 2, 2.0);
        coldTruck.displayCoolingSpecs();

        System.out.println("\nElectric Truck: ");
        ElectricCargoVan ecoVan = new ElectricCargoVan("EV-303", 1200.0, 75.0);
        ecoVan.displayVanDetails();

        System.out.println("\nShipment Tracker: ");
        ShipmentTracker tracker = new ShipmentTracker("TRACK-9941");
        tracker.trackGPS();
        tracker.monitorTemperature();

        System.out.println("Smart Agricultural Truck: ");
        SmartAgriTruck smartTruck = new SmartAgriTruck("SMRT-211", 5000.0, 4, 5, "Rajesh Naik");
        smartTruck.displayFullSmartSpecs();
        smartTruck.trackGPS();
        smartTruck.monitorTemperature();

    }
}