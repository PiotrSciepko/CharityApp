package pl.coderslab.charity.category;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data

@Entity
@Table(name = "categories")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;
}
