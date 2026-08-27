class FreightVehicle {
    protected String vehicleId;
    protected double maxCapacityKg;

    public FreightVehicle(String vehicleId, double maxCapacityKg) {
        this.vehicleId = vehicleId;
        this.maxCapacityKg = maxCapacityKg;
    }

    public void displayBaseSpecs() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Max Capacity: " + maxCapacityKg + "Kg");
    }
}