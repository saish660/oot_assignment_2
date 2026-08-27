class ElectricCargoVan extends FreightVehicle {
    private double batteryKWh;

    public ElectricCargoVan(String vehicleId, double maxCapacityKg, double batteryKWh) {
        super(vehicleId, maxCapacityKg);
        this.batteryKWh = batteryKWh;
    }

    public void displayVanDetails() {
        displayBaseSpecs();
        System.out.println("Power Type: Electric\nBattery Capacity: " + batteryKWh);
    }
}