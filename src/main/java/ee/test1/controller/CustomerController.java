package ee.test1.controller;

import ee.test1.domain.customer.CustomerDao;
import ee.test1.domain.customer.CustomerDto;
import ee.test1.domain.customer.CustomerService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomerController {

    @Resource

    private CustomerService customerService;

    @PostMapping
    public CustomerDao save(@RequestBody CustomerDto customerDto) {


        return customerService.save(customerDto);
    }

    @GetMapping
    public List<CustomerDto> getALL() {

        System.out.println("Vozvrashaem vseh klientov");

        return List.of(new CustomerDto("Oleg", "Petrov"));
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
    public CustomerDto getById(@PathVariable int id) {

        System.out.println("Poluchaem klienta po id " + id);
        return new CustomerDto("Pavel", "Sidorov");
    }
}
