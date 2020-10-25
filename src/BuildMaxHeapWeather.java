/*
Alex Chheng
 */

public class BuildMaxHeapWeather {
    public static void main(String[] args){
        String API_KEY = "aeb810a46ffabcd067cd61c6ac66c5e1";
        String location = "long beach,ca,usa";
        String units = "imperial";

        String urlString = "http://api.openweathermap.org/data/2.5/weather?appid=" + API_KEY + "&q=" + location + "&units=" + units;
    }
}
