package pattern.strategy.problem;

public class Drone extends Carrier {
    public Drone() {
    }

    @Override
    public void deliver() {
        System.out.println("I deliver close packets through the air");
    }
}
