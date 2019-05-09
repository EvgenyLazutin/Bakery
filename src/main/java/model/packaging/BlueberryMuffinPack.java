package model.packaging;

import data.Product;

import java.util.Map;

public class BlueberryMuffinPack implements Pack {

   private Map<Integer, Double> product = Product.MB11.getPack();

   private String codeProduct = Product.MB11.name();


   @Override
   public Map<Integer, Double> getPack() {
      return product;
   }

   @Override
   public String getCodeProduct() {
      return codeProduct;
   }
}
