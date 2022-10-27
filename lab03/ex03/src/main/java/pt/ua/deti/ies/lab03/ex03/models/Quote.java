package pt.ua.deti.ies.lab03.ex03.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="QUOTE_TBL")
public class Quote {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Show show;
    @Size(max = 2000)
    private String quote;
}
