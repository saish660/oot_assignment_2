class ShipmentTracker implements GPSNavigable, ColdChainMonitor {
    private String trackingCode;

    public ShipmentTracker(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    @Override
    public void trackGPS() {
        System.out.println("[" + trackingCode + "] GPS Signal: Active");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("[" + trackingCode + "] Cold-Chain");
    }
}