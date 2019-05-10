package service;

import model.packaging.BlueberryMuffinPack;
import model.packaging.CroissantPack;
import model.packaging.Pack;
import model.packaging.VegemiteScrollPack;
import model.payment.PriceQuantityPack;

import java.util.ArrayList;
import java.util.List;

import static data.Product.*;
import static model.payment.PriceQuantityPack.SPACE;

public class PackingManager {

    private final OrderReader orderReader;

    private final CalculateOrder calculateOrder;


    public PackingManager(OrderReader orderReader, CalculateOrder calculateOrder) {
        this.orderReader = orderReader;
        this.calculateOrder = calculateOrder;
    }

    public List<PriceQuantityPack> paymentPacking(String orderFile) {

        List<PriceQuantityPack> priceQuantityPacksList = new ArrayList<>();
        List<String> packQuantityList = orderReader.readFile(orderFile);
        for (String packQuantity :
                packQuantityList) {
            priceQuantityPacksList.add(splitString(packQuantity));
        }

        return priceQuantityPacksList;
    }

    private PriceQuantityPack splitString(String packQuantity) {
        String[] param = packQuantity.split(SPACE);
        if (param.length == 2) {
            Pack packType = parsingPackType(param[1]);
            int quantity = Integer.parseInt(param[0]);
            return calculateOrder.calculatePack(quantity, packType);
        } else {
            throw new RuntimeException("Failed to split line: " + packQuantity);
        }
    }

    private Pack parsingPackType(String packType) {

        if (VS5.name().equalsIgnoreCase(packType)) {
            return new VegemiteScrollPack();
        }

        if (MB11.name().equalsIgnoreCase(packType)) {
            return new BlueberryMuffinPack();
        }

        if (CF.name().equalsIgnoreCase(packType)) {
            return new CroissantPack();
        } else {
            throw new RuntimeException("Failed to parsing pack type: " + packType);
        }
    }
}
