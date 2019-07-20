import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Jerry
 * @Date 2019-07-20 07:12
 */
@Data
@AllArgsConstructor
public class Memento {
    private int state;
    private String Name;
}
