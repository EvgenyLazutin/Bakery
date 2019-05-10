package service;

import java.util.List;

/**
 * Interface for reading input parameters.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public interface OrderReader {

    /**
     * Reading input parameters from the file
     *
     * @param fileName name of file
     * @return List of String with type and quantity products
     */
    List<String> readFile(String fileName);
}
