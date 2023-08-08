package concrete_factory.Blackholes;

import product.Obstacle;
import product.Blackholes.StallerMassBlackhole;

public class Level1Blackhole extends BlackholesFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new StallerMassBlackhole();
    }

}
