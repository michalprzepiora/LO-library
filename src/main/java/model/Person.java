package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private String name;
    private String surame;
    private int pesel;
    private String email;
}
