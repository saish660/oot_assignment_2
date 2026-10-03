/**
 * Description: Represents a truck equipped to transport temperature-sensitive
 * cargo.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class RefrigeratedTruck extends Truck {
    protected double minTemperatureCelsius;

    /**
     * Creates a refrigerated truck with axle, capacity, and temperature details.
     *
     * @param vehicleId             unique identifier for the vehicle
     * @param maxCapacityKg         maximum cargo capacity in kilograms
     * @param numberOfAxles         number of truck axles
     * @param minTemperatureCelsius minimum supported temperature in Celsius
     */
    public RefrigeratedTruck(String vehicleId, double maxCapacityKg, int numberOfAxles, double minTemperatureCelsius) {
        super(vehicleId, maxCapacityKg, numberOfAxles);
        this.minTemperatureCelsius = minTemperatureCelsius;
    }

    /**
     * Displays the truck details and its cooling specification.
     */
    public void displayCoolingSpecs() {
        displayTruckDetails();
        System.out.println("Cooling: " + minTemperatureCelsius + "C");
    }
}