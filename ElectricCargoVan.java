/**
 * Description: Represents a freight vehicle powered by an electric battery.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class ElectricCargoVan extends FreightVehicle {
    private double batteryKWh;

    /**
     * Creates an electric cargo van with its capacity and battery capacity.
     *
     * @param vehicleId     unique identifier for the vehicle
     * @param maxCapacityKg maximum cargo capacity in kilograms
     * @param batteryKWh    battery capacity in kilowatt-hours
     */
    public ElectricCargoVan(String vehicleId, double maxCapacityKg, double batteryKWh) {
        super(vehicleId, maxCapacityKg);
        this.batteryKWh = batteryKWh;
    }

    /**
     * Displays the van's base specifications and electric power details.
     */
    public void displayVanDetails() {
        displayBaseSpecs();
        System.out.println("Power Type: Electric\nBattery Capacity: " + batteryKWh);
    }
}