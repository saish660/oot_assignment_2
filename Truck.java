class Truck extends FreightVehicle {
    protected int numberOfAxles;

    public Truck(String vehicleId, double maxCapacityKg, int numberOfAxles) {
        super(vehicleId, maxCapacityKg);
        this.numberOfAxles = numberOfAxles;
    }

    public void displayTruckDetails() {
        displayBaseSpecs();
        System.out.println("Number of Axles: " + numberOfAxles);
    }
}