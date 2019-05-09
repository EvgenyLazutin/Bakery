package model.packaging;

import data.Product;

import java.util.Map;

public class CroissantPack implements Pack {

   private Map<Integer, Double> product = Product.CF.getPack();

   private String codeProduct = Product.CF.name();


   @Override
   public Map<Integer, Double> getPack() {
      return product;
   }

   @Override
   public String getCodeProduct() {
      return codeProduct;
   }
}
