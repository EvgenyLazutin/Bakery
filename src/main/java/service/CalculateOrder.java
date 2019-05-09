package service;

import model.packaging.Pack;
import model.payment.PriceQuantityPack;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CalculateOrder {


    public PriceQuantityPack calculatePack(int quantity, Pack pack) {


        Map<Integer, Double> product =pack.getPack();
        PriceQuantityPack priceQuantityPack = new PriceQuantityPack();
        priceQuantityPack.setQuantityProduct(quantity);
        Map <String, Integer> fieldLocalQuantityPack = new TreeMap<>(Collections.reverseOrder());
        double localSum =0;
        int size = product.size();

        for (Map.Entry<Integer, Double> entry : product.entrySet()) {

            int erst = (quantity / entry.getKey());
            localSum += erst * entry.getValue();
            fieldLocalQuantityPack.put(entry.getKey() + " $" + entry.getValue(), erst);
            quantity -= erst * entry.getKey();

            if (size == 1 && quantity > 0) {
                localSum += entry.getValue();
                fieldLocalQuantityPack.put(entry.getKey() + " $" + entry.getValue(), erst+1);
            }
            size--;
        }

        priceQuantityPack.setCodeProduct(pack.getCodeProduct());
        priceQuantityPack.setQuantityPack(fieldLocalQuantityPack);
        priceQuantityPack.setSum(localSum);

        return priceQuantityPack;
    }
}
