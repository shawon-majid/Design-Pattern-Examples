package concrete_factory.Asteriods;

import product.Asteriods.Rocky_Asteroids;
import product.Asteriods.Silicon_Asteroids;
import product.Obstacle;

public class Level2AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1000)
            return new Rocky_Asteroids();
        else
            return new Silicon_Asteroids();
    }
}
