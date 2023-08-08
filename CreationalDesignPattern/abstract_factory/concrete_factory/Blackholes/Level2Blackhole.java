package concrete_factory.Blackholes;

import product.Obstacle;
import product.Blackholes.SuperMassiveBlackhole;

public class Level2Blackhole extends BlackholesFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new SuperMassiveBlackhole();
    }

}
