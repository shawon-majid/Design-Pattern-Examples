import abstract_factory.ObstacleFactory;
import concrete_factory.Asteriods.Level1AsteroidsFactory;
import concrete_factory.Asteriods.Level2AsteroidsFactory;
import concrete_factory.Blackholes.Level1Blackhole;
import concrete_factory.Blackholes.Level2Blackhole;
import concrete_factory.DebrisField.Level1DebrisFieldFactory;
import concrete_factory.DebrisField.Level2DebrisFieldFactory;
import concrete_factory.Fireballs.Level1Fireball;
import concrete_factory.Fireballs.Level2Fireball;
import concrete_factory.Icebergs.Level1Iceberg;
import concrete_factory.Icebergs.Level2Iceberg;
import product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int) (Math.random() * 2) + 1;

        ObstacleFactory factory;

        if (level == 1)
            factory = new Level1AsteroidsFactory();
        else
            factory = new Level2AsteroidsFactory();

        int score = (int) (Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1DebrisFieldFactory();
        else
            factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Iceberg();
        else
            factory = new Level2Iceberg();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Fireball();
        else
            factory = new Level2Fireball();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Blackhole();
        else
            factory = new Level2Blackhole();

        obstacle = factory.createObstacle(score);
        obstacle.show();

    }
}
