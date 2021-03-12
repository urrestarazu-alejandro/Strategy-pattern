package pattern.strategy;

//import pattern.strategy.problem.*;

import pattern.strategy.troubleshooting.*;
import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmCloseAir;
import pattern.strategy.troubleshooting.algorithm.DeliveryAlgorithmValidateBuyer;

public class Strategy {
    public static void run() {
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();
        Drone drone = new Drone();
        Airplane airplane = new Airplane();

        motorcycle.deliver();
        truck.deliver();
        drone.deliver();
        airplane.deliver();

        /*
        drone.deliver();
        drone.setDeliverAlgorithm(new DeliveryAlgorithmValidateBuyer());
        drone.deliver();
        drone.setDeliverAlgorithm(new DeliveryAlgorithmCloseAir());
        drone.deliver();
         */
    }
}
