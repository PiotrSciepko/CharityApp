package pl.coderslab.charity.institution;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data

@Entity
@Table(name = "categories")

public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    private String description;
}
