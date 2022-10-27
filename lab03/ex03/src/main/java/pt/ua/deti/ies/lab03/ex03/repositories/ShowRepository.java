package pt.ua.deti.ies.lab03.ex03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.ua.deti.ies.lab03.ex03.models.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {
}
