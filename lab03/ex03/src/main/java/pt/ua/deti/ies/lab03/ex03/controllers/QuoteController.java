package pt.ua.deti.ies.lab03.ex03.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.ua.deti.ies.lab03.ex03.models.Quote;
import pt.ua.deti.ies.lab03.ex03.services.QuoteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuoteController {
    @Autowired
    private QuoteService quoteService;

    @GetMapping("/quotes")
    public Quote getQuoteById(@RequestParam(value = "show", required = true) int id){
        return quoteService.getRandomQuoteById(id);
    }

    @GetMapping("/quote")
    public Quote getRandomQuote(){
        return quoteService.getRandomQuote();
    }

    @PostMapping("/quote/add")
    public Quote saveShow(@RequestBody Quote quote) {
        return quoteService.saveQuote(quote);
    }

    @PostMapping("/quotes/add")
    public List<Quote> addShow(@RequestBody List<Quote> quotes) {return quoteService.saveQuotes(quotes);}

    @DeleteMapping("/quotes")
    public String deleteAllQuotes() {
        return quoteService.deleteAllQuotes();
    }

}