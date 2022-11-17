package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Reviewer {

    public Reviewer (String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToMany(mappedBy = "reviewers")
    private List<Newspaper> newspapers;
}