package sortingwithcomparable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BallComparisons {

    public static void main(String[] args) {
        Ball ball = new Ball("ball", new Integer(2));
        BaseBall baseBall = new BaseBall("Baseball", new Integer(3));
        SoftBall softBall = new SoftBall("Softball", new Integer(6));

        List<Ball> balls = Arrays.asList(new SoftBall("Softball", new Integer(6)),
                new SoftBall("Softball", new Integer(6)),
                new Ball("ball", new Integer(2)));

        List<Ball> sortedBalls = balls.stream()
                .sorted(Ball::compareTo)
                .collect(Collectors.toList());
    }
}
