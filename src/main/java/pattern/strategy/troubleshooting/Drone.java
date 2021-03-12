package pattern.strategy.troubleshooting;

import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmCloseAir;

public class Drone extends Carrier {
    public Drone() {
        setDeliverAlgorithm(new DeliveryAlgorithmCloseAir());
    }
}
