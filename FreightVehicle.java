/**
 * Description: Represents the common specifications shared by freight vehicles.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class FreightVehicle {
    protected String vehicleId;
    protected double maxCapacityKg;

    /**
     * Creates a freight vehicle with an identifier and maximum capacity.
     *
     * @param vehicleId     unique identifier for the vehicle
     * @param maxCapacityKg maximum cargo capacity in kilograms
     */
    public FreightVehicle(String vehicleId, double maxCapacityKg) {
        this.vehicleId = vehicleId;
        this.maxCapacityKg = maxCapacityKg;
    }

    /**
     * Displays the vehicle identifier and maximum cargo capacity.
     */
    public void displayBaseSpecs() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Max Capacity: " + maxCapacityKg + "Kg");
    }
}