package pattern.strategy.troubleshooting;

import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmStreets;

public class Motorcycle extends Carrier {
    public Motorcycle() {
        setDeliverAlgorithm(new DeliveryAlgorithmStreets());
    }
}
