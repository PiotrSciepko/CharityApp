package pl.coderslab.charity.category;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categories")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
