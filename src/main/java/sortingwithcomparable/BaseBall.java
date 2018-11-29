package sortingwithcomparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseBall extends Ball {
    protected String name;
    protected Integer diameter;
}
