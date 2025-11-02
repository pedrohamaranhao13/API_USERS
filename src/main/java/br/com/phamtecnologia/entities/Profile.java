package br.com.phamtecnologia.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tbl_profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "profile")
    private List<User> users;
}
