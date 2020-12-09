package pl.coderslab.charity.institution;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "institutions")

public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
}
