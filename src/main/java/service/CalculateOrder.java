package service;

import model.packaging.Pack;
import model.payment.PriceQuantityPack;

import java.util.HashMap;
import java.util.Map;

public class CalculateOrder {


    public PriceQuantityPack calculatePack(int quantity, Pack pack) {


        Map<Integer, Double> product =pack.getPack();
        PriceQuantityPack priceQuantityPack = new PriceQuantityPack();
        priceQuantityPack.setQuantityProduct(quantity);
        Map <String, Integer> fieldLocalQuantityPack = new HashMap<>();
        double localSum =0;

        for (Map.Entry<Integer, Double> entry : product.entrySet()) {

            int erst = (quantity / entry.getKey());
            localSum += erst * entry.getValue();
            fieldLocalQuantityPack.put(entry.getKey() + " $" + entry.getValue(), erst);
            quantity -= erst * entry.getKey();
        }

        priceQuantityPack.setCodeProduct(pack.getCodeProduct());
        priceQuantityPack.setQuantityPack(fieldLocalQuantityPack);
        priceQuantityPack.setSum(localSum);

        return priceQuantityPack;
    }
}
