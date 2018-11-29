package sortingwithcomparable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ball implements Comparable<Ball> {
    protected String name;
    protected Integer diameter;

    @Override
    public int compareTo(Ball ball) {
        return diameter.compareTo(ball.getDiameter());
    }
}
