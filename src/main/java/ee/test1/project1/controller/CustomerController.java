package ee.test1.project1.controller;

import ee.test1.project1.customer.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {

    @PostMapping
    public String save(@RequestBody Customer customer) {

        System.out.println("Customer " + customer.getLastName() + " dobavlen");

        return "Customer saved to DB: " + customer.getFirstName();
    }

    @GetMapping
    public List<Customer> getALL() {

        System.out.println("Vozvrashaem vseh klientov");

        return List.of(new Customer(1, "Oleg", "Petrov"));
    }

    @PutMapping
    public String changeLastName(@RequestParam int id, @RequestParam String lastName) {
        System.out.println("menjaem familiju na " + lastName);

        return "Familija izmenena: " + lastName;
    }

    @DeleteMapping
    String delete(@RequestParam int id) {
        System.out.println("Udalitj klienta s id " + id);
        return "udachno udalen " + id;
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable int id) {

        System.out.println("Poluchaem klienta po id " + id);
        return new Customer(1, "Pavel", "Sidorov");
    }
}
