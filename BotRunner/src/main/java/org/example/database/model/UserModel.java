package org.example.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.util.Collection;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<BotModel> bots;
    @Enumerated(EnumType.STRING)
    private Role role;
    private boolean enabled;

    @Column(length = 64)
    private String verificationToken;

    // returns a list of the user's roles

}
