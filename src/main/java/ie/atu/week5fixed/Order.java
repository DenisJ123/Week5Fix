package ie.atu.week5fixed;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;

    private String customerId;

    private int orderCode;

    @NotEmpty(message = "Order details are required")
    private String orderDetails;

    private String orderDate;
}
