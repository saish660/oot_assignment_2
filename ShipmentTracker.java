/**
 * Description: Tracks shipment GPS status and monitors cold-chain conditions.
 *
 * @author Saish Gawade
 *         Roll No: 2641
 */
class ShipmentTracker implements GPSNavigable, ColdChainMonitor {
    private String trackingCode;

    /**
     * Creates a shipment tracker with a tracking code.
     *
     * @param trackingCode unique code assigned to the shipment
     */
    public ShipmentTracker(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    /**
     * Reports the active GPS status for the shipment.
     */
    @Override
    public void trackGPS() {
        System.out.println("[" + trackingCode + "] GPS Signal: Active");
    }

    /**
     * Reports the cold-chain temperature monitoring status.
     */
    @Override
    public void monitorTemperature() {
        System.out.println("[" + trackingCode + "] Cold-Chain");
    }
}