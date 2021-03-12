package pattern.strategy.problem;

public class Airplane extends Carrier {
    public Airplane() {
    }

    @Override
    public void deliver() {
        System.out.println("I deliver packages faraway through the air");
    }
}
