package ee.test1.project1.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Customer {
    private int id;
    private String firstName;
    private String lastName;


}
