package service;

import model.payment.PriceQuantityPack;

import java.util.List;

public interface OrderWriter {

    void consoleWrite(List<PriceQuantityPack> priceQuantityPacksList);
}
