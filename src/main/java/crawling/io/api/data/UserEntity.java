package crawling.io.api.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="_user")
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String birth;

    private String phone;

    private String email;

    private String password;

    private String gender;

    private String nickname;

    @Column(name = "verified_email")
    private int verifiedEmail;

    private LocalDateTime updated = LocalDateTime.now();

    private LocalDateTime created = LocalDateTime.now();

}
