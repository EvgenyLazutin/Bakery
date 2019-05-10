package service;

import model.payment.PriceQuantityPack;

import java.util.List;


/**
 * Interface for writing output parameters.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public interface OrderWriter {

    /**
     * Writing output parameters to console
     *
     * @param priceQuantityPacksList List of PriceQuantityPack: {@link PriceQuantityPack}
     */
    void consoleWrite(List<PriceQuantityPack> priceQuantityPacksList);
}
