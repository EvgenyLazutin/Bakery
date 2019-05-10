package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementation for interface {@link OrderReader} for reading input parameters.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public class OrderReaderImpl implements OrderReader {

    /**
     * Reading input parameters from the file
     *
     * @param fileName name of file
     * @return List of String with type and quantity products
     */
    @Override
    public List<String> readFile(String fileName) {

        List<String> result = new ArrayList<>();
        InputStream in = getClass().getResourceAsStream("/" + fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file" + e.getMessage(), e);
        }

        return result;
    }
}
