package model.payment;

import java.util.Map;

public class PriceQuantityPack {


    private double sum;
    private String codeProduct;
    private int quantityProduct;
    private Map <String, Integer> quantityPack;


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public Map<String, Integer> getQuantityPack() {
        return quantityPack;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityPack(Map<String, Integer> quantityPack) {
        this.quantityPack = quantityPack;
    }


}
