package ie.atu.week5fixed;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> findCustomerById(String customerId) {
        return customerRepository.findById(customerId);
    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }
}


