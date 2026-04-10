import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class Employee {

    private long id;
    private String name;
    private long age;

}
