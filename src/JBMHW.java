import java.io.*;

public class JBMHW {


        public static void main(String[] args) {

            StringBuffer sb = new StringBuffer();
            for(String s: args) {
                sb.append(s + " ");
            }
            String commandPromptString = sb.toString();
    // once I put the arg into a string, I will parse the data and allocate it in the right variables
            System.out.println(commandPromptString);


            String API_KEY = "aeb810a46ffabcd067cd61c6ac66c5e1";
            String Location = null;



        }


}
