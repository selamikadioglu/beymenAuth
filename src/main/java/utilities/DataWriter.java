package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    public void dataWriter(String productName, String productDesc, String productPrice) {
        String filePath = "data.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(productName);
            writer.newLine();
            writer.write(productDesc);
            writer.newLine();
            writer.write(productPrice);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
