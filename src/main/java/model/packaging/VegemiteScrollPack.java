package model.packaging;

import data.Product;
import java.util.Map;


/**
 * Implementation for interface {@link Pack} of Model for the type of packaging.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public class VegemiteScrollPack implements Pack {

    private Map<Integer, Double> product = Product.VS5.getPack();

    private String codeProduct = Product.VS5.name();


    @Override
    public Map<Integer, Double> getPack() {
        return product;
    }

    @Override
    public String getCodeProduct() {
        return codeProduct;
    }
}
