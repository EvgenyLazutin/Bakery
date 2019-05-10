package service;

import model.payment.PriceQuantityPack;

import java.util.List;

public class OrderWriterImpl implements OrderWriter {


    @Override
    public void consoleWrite(List<PriceQuantityPack> priceQuantityPacksList) {

        for (PriceQuantityPack pqPack :
                priceQuantityPacksList) {
            System.out.println(pqPack);
        }
    }
}
