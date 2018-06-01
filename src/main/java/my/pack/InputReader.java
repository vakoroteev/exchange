package my.pack;

import java.io.BufferedReader;
import java.io.IOException;

public class InputReader {

    public String[] inputReader (BufferedReader reader)  {
        String allString;
        String[] inputConsole = null;
        try {
            allString = reader.readLine();
            inputConsole = allString.split(" ");
            return inputConsole;
        } catch (IOException e) {
            e.printStackTrace();
            return inputConsole;
        }
    }
}
