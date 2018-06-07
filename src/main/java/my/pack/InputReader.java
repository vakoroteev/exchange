package my.pack;

import java.io.BufferedReader;
import java.io.IOException;

public class InputReader {

    public InputReaderDto inputReader(BufferedReader reader) {
        InputReaderDto inputReaderDto = new InputReaderDto();
        String allString;
        String[] inputConsole;
        try {
            allString = reader.readLine();
            inputConsole = allString.split(" ");
            inputReaderDto.command = inputConsole[0];
            inputReaderDto.parameter = new String[inputConsole.length];
            for (int i = 1; i < inputConsole.length; i++) {
                inputReaderDto.parameter[i - 1] = inputConsole[i];
            }
            return inputReaderDto;
        } catch (IOException e) {
            e.printStackTrace();
            return inputReaderDto;
        }
    }
}
