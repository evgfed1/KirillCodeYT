package ee.test1.controller;

import ee.test1.domain.customer.CustomerRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

}
