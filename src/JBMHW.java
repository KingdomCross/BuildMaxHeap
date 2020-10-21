import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JBMHW {


        public static void main(String[] args) {
            String API_KEY = "aeb810a46ffabcd067cd61c6ac66c5e1";
            String Location = args[0];
            String urlString = "api.openweathermap.org/data/2.5/weather?q=" + Location +"&appid=" + API_KEY;

            try{
                StringBuilder result = new StringBuilder();
                URL url = new URL(urlString);

                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch(IOException e){

            }

        }


}
