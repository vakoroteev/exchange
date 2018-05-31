import java.io.BufferedReader;
import java.io.IOException;

public class InputReader {

    private String[] inputConsole;

    public String[] inputReader (BufferedReader reader) {
        inputConsole = inputSplit(reader);
        return inputConsole;
    }

    private String[] inputSplit (BufferedReader reader)  {
        String allString;
        String[] str = null;
        try {
            allString = reader.readLine();
            str = allString.split(" ");
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return str;
        }
    }
}
