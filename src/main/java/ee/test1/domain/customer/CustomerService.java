package ee.test1.domain.customer;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Resource

    private CustomerRepository customerRepository;

    public CustomerDao save(CustomerDto customerDto) {

        System.out.println("Customer " + customerDto.getLastName() + " dobavlen");
        CustomerDao customerDao = new CustomerDao();
        customerDao.setFirstName(customerDao.getFirstName());
        customerDao.setLastName(customerDao.getLastName());
        customerDao.setCreatedAt(LocalDateTime.now());
        return customerRepository.save(customerDao);
    }
}
