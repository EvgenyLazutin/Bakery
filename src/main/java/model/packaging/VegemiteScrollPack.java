package model.packaging;

import data.Product;
import model.packaging.Pack;

import java.util.Map;

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
