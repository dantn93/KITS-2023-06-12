package edu.kits.finalproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(columnDefinition = "nvarchar(50) not null")
    private String fullname;

    @Column(columnDefinition = "nvarchar(50) not null", unique = true)
    private String username;

    @Column(columnDefinition = "nvarchar(100) not null")
    private String password;

    @Column(columnDefinition = "nvarchar(150)")
    private String token;

    @Column(columnDefinition = "nvarchar(10) not null")
    private String role;

}
