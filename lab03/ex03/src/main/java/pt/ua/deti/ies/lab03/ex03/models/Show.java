package pt.ua.deti.ies.lab03.ex03.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SHOW_TBL")
public class Show {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int year;
}