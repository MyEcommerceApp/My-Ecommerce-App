package com.oil.ecommerceoilapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile")
    private String mobile;

//  @Column(name = "role")
//  private Role role;

    @OneToMany (cascade=CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private List<Address> address;

    @OneToMany (cascade=CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Order> orders;
}
