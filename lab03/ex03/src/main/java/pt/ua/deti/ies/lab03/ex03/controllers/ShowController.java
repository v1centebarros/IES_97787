package pt.ua.deti.ies.lab03.ex03.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.ua.deti.ies.lab03.ex03.models.Show;
import pt.ua.deti.ies.lab03.ex03.services.ShowService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/shows")
    public List<Show> getShows() {
        return showService.getShows();
    }

    @PostMapping("/shows/add")
    public List<Show> addShow(@RequestBody List<Show> shows) {
        return showService.saveShows(shows);
    }

    @PostMapping("/show/add")
    public Show saveShow(@RequestBody Show show) {
        return showService.saveShow(show);
    }

    @DeleteMapping("/shows")
    public String deleteAllShows() {
        return showService.deleteAllShows();
    }
}
