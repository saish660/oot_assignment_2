/**
 * Description: Represents a standard freight truck with a specified axle count.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class Truck extends FreightVehicle {
    protected int numberOfAxles;

    /**
     * Creates a truck with an identifier, capacity, and axle count.
     *
     * @param vehicleId     unique identifier for the vehicle
     * @param maxCapacityKg maximum cargo capacity in kilograms
     * @param numberOfAxles number of truck axles
     */
    public Truck(String vehicleId, double maxCapacityKg, int numberOfAxles) {
        super(vehicleId, maxCapacityKg);
        this.numberOfAxles = numberOfAxles;
    }

    /**
     * Displays the truck's base specifications and number of axles.
     */
    public void displayTruckDetails() {
        displayBaseSpecs();
        System.out.println("Number of Axles: " + numberOfAxles);
    }
}