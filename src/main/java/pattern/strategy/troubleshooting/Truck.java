package pattern.strategy.troubleshooting;

import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmStreets;

public class Truck extends Carrier {
    public Truck() {
        setDeliverAlgorithm(new DeliveryAlgorithmStreets());
    }
}
