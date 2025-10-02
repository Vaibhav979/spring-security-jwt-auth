import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class User{
    @Id
    private int id;
    private String username;
    private String password;
}