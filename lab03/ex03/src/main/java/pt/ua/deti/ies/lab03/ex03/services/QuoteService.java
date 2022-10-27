package pt.ua.deti.ies.lab03.ex03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.ua.deti.ies.lab03.ex03.models.Quote;
import pt.ua.deti.ies.lab03.ex03.repositories.QuoteRepository;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;

    public Quote saveQuote(Quote quote) {return quoteRepository.save(quote);}

    public List<Quote> saveQuotes(List<Quote> quotes) {return quoteRepository.saveAll(quotes);}

    public List<Quote> getQuotes() { return quoteRepository.findAll();}

    public String deleteAllQuotes() {
        quoteRepository.deleteAll();
        return "All quotes deleted";
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        int random = (int) (Math.random() * quotes.size());
        return quotes.get(random);
    }

    public Quote getRandomQuoteById(int id) {
        List<Quote> quotes = quoteRepository.findAllByShowId(id);
        int random = (int) (Math.random() * quotes.size());
        return quotes.get(random);
    }
}