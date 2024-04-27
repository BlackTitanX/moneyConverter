import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeOperations {

        ConvertionData getRate(String currency){


            URI url = URI.create("https://v6.exchangerate-api.com/v6/e38f45b9b07f6e5f6de10308/latest/" + currency);
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder().uri(url).build();
            HttpResponse <String> response = null;

            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());

            } catch (IOException | InterruptedException e) {

                throw new RuntimeException(e);

            }


            return new Gson().fromJson(response.body(), ConvertionData.class);
        }

 public double performConvertion(String curency, double amount, String localamount){
            double convertion = 0.0;
            ConvertionData rates = getRate(curency);

            try {
                double rate = rates.conversion_rates().get(curency);

                convertion = rate * amount;

            } catch ( Exception e){

                System.out.println("An error has occured");
            }
             return  convertion;
 }


}
