
// Jessica G. Banuelos
// Alex Chheng
// I am conflict
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuildMaxHeapWeather_noJSON
{
    public static void main(String[] args)
    {
        String API_KEY = "aeb810a46ffabcd067cd61c6ac66c5e1";
        String location = "long beach,ca,usa";
        //String location = args[0];
        String units = "imperial";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?appid=" + API_KEY + "&q=" + location + "&units=" + units;
        try
        {
            URL urlObj = new URL(urlString);
            HttpURLConnection urlCon = (HttpURLConnection) urlObj.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
            {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
