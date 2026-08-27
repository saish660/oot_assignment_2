class SmartAgriTruck extends RefrigeratedTruck implements GPSNavigable, ColdChainMonitor {
    private String driverName;

    public SmartAgriTruck(String vehicleId, double maxCapacityKg, int numberOfAxles, double minTemperatureCelsius, String driverName) {
        super(vehicleId, maxCapacityKg, numberOfAxles, minTemperatureCelsius);
        this.driverName = driverName;
    }

    @Override
    public void trackGPS() {
        System.out.println("[GPS Active]: " + driverName);
    }

    @Override
    public void monitorTemperature() {
        System.out.println("[TemperatureMonitor Active]: MinimumTemperature: " + minTemperatureCelsius);
    }

    public void displayFullSmartSpecs() {
        displayCoolingSpecs();
        System.out.println("Assigned Driver: " + driverName);
    }
}