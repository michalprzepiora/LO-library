package personRespozitory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person  implements personinterface {
    String name;
    String surname;
    int age;

    @Override
    public void add() {

    }
}