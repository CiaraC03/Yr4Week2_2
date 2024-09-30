package ie.atu.week3_microservice_2;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notifications {
    @NotBlank
    private String name;

    @Email
    private String email;

    @Positive
    private int age;

}
