package pattern.strategy.troubleshooting;

import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmFarawayAir;
import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmFarawayAirKmh;

public class Airplane extends Carrier {
    public Airplane() {
        //setDeliverAlgorithm(new DeliveryAlgorithmFarawayAir());
        setDeliverAlgorithm(new DeliveryAlgorithmFarawayAirKmh());
    }
}
