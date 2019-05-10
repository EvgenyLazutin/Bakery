package service;


import model.packaging.Pack;
import model.payment.PriceQuantityPack;

/**
 * Interface to calculate the quantity and cost of packaging.
 * <p>
 *
 * @author Lazutin Evgeny
 */
interface CalculateOrder {

    /**
     * Calculate the quantity and cost of packaging.
     *
     * @param quantity the quantity of product
     * @param pack     the Type of product {@link Pack}
     * @return PriceQuantityPack: {@link PriceQuantityPack}
     */
    PriceQuantityPack calculatePack(int quantity, Pack pack);
}
