/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherForecastByCity {

    public static void main(String[] args) {
        String city = "Aveiro";
        if (args.length != 1) {
            System.out.println("Nenhuma cidade definida, vai ser usado " + city + " como opção default");
        } else {
            city = args[0];
        }

        ApiClient ipma = new ApiClient();

        IpmaCity cities = ipma.getCity();
        int cityId = -1;


        for (City c: cities.getData()) {
            if (c.getLocal().equals(city)){
                System.out.println("Cidade: " + c.getLocal());
                cityId = c.getGlobalIdLocal();
                break;
            }
        }

        if (cityId == -1) {
            System.err.println("Cidade Inválida");
            System.exit(1);
        }

        IpmaCityForecast forecast = ipma.getWeatherForecastByCity(cityId);
        if (forecast != null) {
            for (var day : forecast.getData()) {
                System.out.println(day);
            }
        } else {
            System.out.println("Nenhum resultado encontrado");
        }

    }
}