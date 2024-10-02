package ie.atu.week3_microservice_2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {

    @PostMapping("/notifications")
    public String confirmNotifications(Customer customer)
    {
        String message = String.format("Customer %s [%s] has been successfully registered", customer.getName(), customer.getEmail());
        return message;
    }
}
