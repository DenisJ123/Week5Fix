package ie.atu.week5fixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/customer-order")
    public ResponseEntity<String> createCustomerOrder(@RequestBody CustomerOrderRequest request) {

        Customer customer = customerService.saveCustomer(request.getCustomer());

        request.getOrders().forEach(order -> {
            order.setCustomerId(customer.getId());
            orderService.saveOrder(order);
        });

        return ResponseEntity.ok("Customer and orders saved successfully");
    }
}

