package pt.ua.deti.ies.lab03.ex03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.ua.deti.ies.lab03.ex03.models.Show;
import pt.ua.deti.ies.lab03.ex03.repositories.ShowRepository;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public Show saveShow(Show show) {
        return showRepository.save(show);
    }

    public List<Show> saveShows(List<Show> shows) {
        return showRepository.saveAll(shows);
    }

    public List<Show> getShows() {
        return showRepository.findAll();
    }

    public String deleteAllShows() {
        showRepository.deleteAll();
        return "All Shows deleted";
    }
}
