class RefrigeratedTruck extends Truck {
    protected double minTemperatureCelsius;

    public RefrigeratedTruck (String vehicleId, double maxCapacityKg, int numberOfAxles, double minTemperatureCelsius) {
        super(vehicleId, maxCapacityKg, numberOfAxles);
        this.minTemperatureCelsius = minTemperatureCelsius;
    }

    public void displayCoolingSpecs() {
        displayTruckDetails();
        System.out.println("Cooling: " + minTemperatureCelsius + "C");
    }
}