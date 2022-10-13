package pt.ua.deti.ies.lab2_4.lab2_4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class QuoteController {

    @GetMapping("api/quote")
    public Quote getQuote() {
        try {

            URL url = new URL("https://movie-quote-api.herokuapp.com/v1/quote/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Getting the response code
            int responsecode = conn.getResponseCode();

            String inline = "";

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                // Close the scanner
                scanner.close();
            }

            return new Gson().fromJson(inline, Quote.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @GetMapping("api/quotes")
    public Quote getQuoteFilered(@RequestParam(name="show", required=true, defaultValue="god-father") String showName)  {
        try {

            URL url = new URL("https://movie-quote-api.herokuapp.com/v1/shows/"+showName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Getting the response code
            int responsecode = conn.getResponseCode();

            String inline = "";

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                // Close the scanner
                scanner.close();
            }

            return new Gson().fromJson(inline, Quote.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
