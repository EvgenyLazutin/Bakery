package service;

import model.payment.PriceQuantityPack;

import java.util.List;

/**
 * Implementation for interface {@link OrderWriter} for writing output parameters.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public class OrderWriterImpl implements OrderWriter {


    /**
     * Writing output parameters to console
     *
     * @param priceQuantityPacksList List of PriceQuantityPack: {@link PriceQuantityPack}
     */
    @Override
    public void consoleWrite(List<PriceQuantityPack> priceQuantityPacksList) {

        for (PriceQuantityPack pqPack :
                priceQuantityPacksList) {
            System.out.println(pqPack);
        }
    }
}
