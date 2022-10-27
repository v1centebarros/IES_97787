package pt.ua.deti.ies.lab03.ex03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.ua.deti.ies.lab03.ex03.models.Quote;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote,Integer> {
    List<Quote> findAllByShowId(int id);
}
