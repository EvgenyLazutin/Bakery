package model.packaging;

import java.util.Map;


/**
 * Data model interface for the type of packaging.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public interface Pack {

    Map<Integer, Double> getPack();
    String getCodeProduct();
}
