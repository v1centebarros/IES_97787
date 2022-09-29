import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private final IpmaService service;

    public ApiClient() {
        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        this.service = retrofit.create(IpmaService.class);
    }

    public IpmaCityForecast getWeatherForecastByCity(int cityId) {
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(cityId);

        IpmaCityForecast forecast = null;
        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            forecast = apiResponse.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forecast;
    }

    public IpmaCity getCity() {
        // prepare the call to remote endpoint
        Call<IpmaCity> callSync = service.getCity();

        IpmaCity cities = null;
        try {
            Response<IpmaCity> apiResponse = callSync.execute();
            cities = apiResponse.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities;
    }
}
