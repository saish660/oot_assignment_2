/**
 * Description: Represents a smart refrigerated truck assigned to an
 * agricultural driver.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class SmartAgriTruck extends RefrigeratedTruck implements GPSNavigable, ColdChainMonitor {
    private String driverName;

    /**
     * Creates a smart agricultural truck with driver and refrigeration details.
     *
     * @param vehicleId             unique identifier for the vehicle
     * @param maxCapacityKg         maximum cargo capacity in kilograms
     * @param numberOfAxles         number of truck axles
     * @param minTemperatureCelsius minimum supported temperature in Celsius
     * @param driverName            name of the assigned driver
     */
    public SmartAgriTruck(String vehicleId, double maxCapacityKg, int numberOfAxles, double minTemperatureCelsius,
            String driverName) {
        super(vehicleId, maxCapacityKg, numberOfAxles, minTemperatureCelsius);
        this.driverName = driverName;
    }

    /**
     * Reports the GPS status and assigned driver.
     */
    @Override
    public void trackGPS() {
        System.out.println("[GPS Active]: " + driverName);
    }

    /**
     * Reports the active temperature monitor and minimum temperature.
     */
    @Override
    public void monitorTemperature() {
        System.out.println("[TemperatureMonitor Active]: MinimumTemperature: " + minTemperatureCelsius);
    }

    /**
     * Displays all refrigeration and driver specifications for the truck.
     */
    public void displayFullSmartSpecs() {
        displayCoolingSpecs();
        System.out.println("Assigned Driver: " + driverName);
    }
}