package model.payment;

import java.text.DecimalFormat;
import java.util.Map;

public class PriceQuantityPack {

    private static String TAB = "       ";
    private static String LINE_SEPARATOR = System.getProperty("line.separator");
    private static String SEPARATOR = " x ";
    private static String SPACE = " ";

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

    private String getQuantityPackLikeString(){

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : quantityPack.entrySet()) {

            if(entry.getValue() == 0)continue;
            result.append(TAB);
            result.append(entry.getValue());
            result.append(SEPARATOR);
            result.append(entry.getKey());
            result.append(LINE_SEPARATOR);
        }
        return result.toString();
    }

    private String getRound(double value){
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }


    @Override
    public String toString() {

        return  quantityProduct + SPACE + codeProduct + " $" + getRound(sum)+ LINE_SEPARATOR + getQuantityPackLikeString();
    }
}
