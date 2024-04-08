package org.jessica.ecommerce;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String user;
    @Column
    private String email;

    //orders list
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Order> orders;

}
