package concrete_factory.Icebergs;

import product.Obstacle;
import product.Icebergs.B68Iceberg;

public class Level1Iceberg extends IcebergsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new B68Iceberg();
    }

}
