package concrete_factory.Icebergs;

import product.Obstacle;
import product.Icebergs.A15Iceberg;

public class Level2Iceberg extends IcebergsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new A15Iceberg();
    }

}
