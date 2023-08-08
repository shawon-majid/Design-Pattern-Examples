package concrete_factory.Fireballs;

import product.Obstacle;
import product.Fireballs.ExplosiveFireballs;

public class Level2Fireball extends FireballsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new ExplosiveFireballs();
    }

}
