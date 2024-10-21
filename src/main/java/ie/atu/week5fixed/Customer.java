package ie.atu.week5fixed;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;

    @NotEmpty(message = "Name is required")
    private String name;

    @Email(message = "Email should be valid")
    private String email;
}


