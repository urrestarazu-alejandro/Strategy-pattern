package pattern.strategy.troubleshooting;

import pattern.strategy.troubleshooting.algorithm.DeliverAlgorithm;

public abstract class Carrier {
    private DeliverAlgorithm deliverAlgorithm;

    public Carrier() {
    }

    public void setDeliverAlgorithm(DeliverAlgorithm deliverAlgorithm) {
        this.deliverAlgorithm = deliverAlgorithm;
    }

    public void deliver() {
        deliverAlgorithm.deliver();
    }
}
