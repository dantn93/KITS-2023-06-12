package edu.kits.finalproject.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;

    @Column(columnDefinition = "nvarchar(50) default null")
    private String name;

    @Column(columnDefinition = "nvarchar(50) not null")
    private String email;

    @Column(columnDefinition = "nvarchar(200) not null")
    private String password;
}
