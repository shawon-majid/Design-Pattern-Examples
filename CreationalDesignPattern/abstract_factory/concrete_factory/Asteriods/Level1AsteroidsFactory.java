package concrete_factory.Asteriods;

import product.Obstacle;
import product.Asteriods.*;

public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 500)
            return new Ice_Asteroids();
        else
            return (Asteriods) new Iron_Asteroids();
    }
}
