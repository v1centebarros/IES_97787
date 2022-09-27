package org.example;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import org.example.IpmaCityForecast; //may need to adapt package name
import org.example.IpmaService;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    //todo: should generalize for a city passed as argument
    private static final int CITY_ID_AVEIRO = 1010500;

    public static void  main(String[] args ) {
        int cityId = -1;
        if (args.length == 1) {
            cityId = Integer.parseInt(args[0]);
            System.out.println("City ID: " + cityId);
        } else {
            System.out.println("No city ID passed as argument. Using Aveiro as default.");
            cityId = CITY_ID_AVEIRO;
        }

        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(cityId);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                for (var day : forecast.getData()) {
                    System.out.println(day);
                }

            } else {
                System.out.println( "No results for this request!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}