package service;

import model.packaging.BlueberryMuffinPack;
import model.packaging.CroissantPack;
import model.payment.PriceQuantityPack;
import model.packaging.VegemiteScrollPack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CalculateOrderTest {

    private CalculateOrder calculateOrder;

    @Before
    public void init() { calculateOrder = new CalculateOrder();}

    @After
    public void tearDown() { calculateOrder = null; }

    @Test
    public void calculateVegemiteScroll() throws Exception {
        PriceQuantityPack priceQuantityPack = calculateOrder.calculatePack(10, new VegemiteScrollPack());
        assertEquals("VS5", priceQuantityPack.getCodeProduct());
        assertEquals(17.98 ,priceQuantityPack.getSum(),0.001 );
        assertEquals(10, priceQuantityPack.getQuantityProduct());
        Map<String, Integer> quantityPack = priceQuantityPack.getQuantityPack();
        int keyTestValue1 = quantityPack.get("5 $8.99");
        assertEquals( 2, keyTestValue1 );
        System.out.println(priceQuantityPack);
    }

}