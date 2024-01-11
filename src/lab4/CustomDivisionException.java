package lab4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class CustomDivisionException extends Exception {
    private final String message;

    CustomDivisionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void writeToLog(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            String formattedDate = sdf.format(date);
            bw.write(formattedDate + " || " + getMessage());
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
