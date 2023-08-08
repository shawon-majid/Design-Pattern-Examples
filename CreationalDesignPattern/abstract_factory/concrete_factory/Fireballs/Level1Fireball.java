package concrete_factory.Fireballs;

import product.Obstacle;
import product.Fireballs.MeteroicFireballs;

public class Level1Fireball extends FireballsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new MeteroicFireballs();
    }

}
