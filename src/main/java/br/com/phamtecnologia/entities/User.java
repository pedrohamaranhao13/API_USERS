package br.com.phamtecnologia.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name",  length = 150, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 150, nullable = false)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateTimeCreation", nullable = false)
    private LocalDateTime dateTimeCreation;

    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private Profile profile;
}
