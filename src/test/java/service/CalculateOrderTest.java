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

    @Test
    public void calculateVegemiteScroll2() throws Exception {
        PriceQuantityPack priceQuantityPack = calculateOrder.calculatePack(9, new VegemiteScrollPack());
        assertEquals("VS5", priceQuantityPack.getCodeProduct());
        assertEquals(22.97 ,priceQuantityPack.getSum(),0.001 );
        assertEquals(9, priceQuantityPack.getQuantityProduct());
        Map<String, Integer> quantityPack = priceQuantityPack.getQuantityPack();
        int keyTestValue1 = quantityPack.get("5 $8.99");
        int keyTestValue2 = quantityPack.get("3 $6.99");
        assertEquals( 1, keyTestValue1 );
        assertEquals( 2, keyTestValue2 );
        System.out.println(priceQuantityPack);
    }

    @Test
    public void calculateVegemiteScroll3() throws Exception {
        PriceQuantityPack priceQuantityPack = calculateOrder.calculatePack(0, new VegemiteScrollPack());
        assertEquals("VS5", priceQuantityPack.getCodeProduct());
        assertEquals(0 ,priceQuantityPack.getSum(),0.001 );
        assertEquals(0, priceQuantityPack.getQuantityProduct());
        System.out.println(priceQuantityPack);
    }

    @Test
    public void blueberryMuffin() throws Exception {
        PriceQuantityPack priceQuantityPack = calculateOrder.calculatePack(14, new BlueberryMuffinPack());
        assertEquals("MB11", priceQuantityPack.getCodeProduct());
        assertEquals(51.84 ,priceQuantityPack.getSum(),0.01 );
        assertEquals(14, priceQuantityPack.getQuantityProduct());
        Map<String, Integer> quantityPack = priceQuantityPack.getQuantityPack();
        int keyTestValue1 = quantityPack.get("5 $16.95");
        int keyTestValue2 = quantityPack.get("8 $24.95");
        int keyTestValue3 = quantityPack.get("2 $9.95");
        assertEquals( 1, keyTestValue1 );
        assertEquals( 1, keyTestValue1 );
        assertEquals( 1, keyTestValue1 );

        System.out.println(priceQuantityPack);
    }

    @Test
    public void croissantTest() throws Exception {
        PriceQuantityPack priceQuantityPack = calculateOrder.calculatePack(13, new CroissantPack());
        assertEquals("CF", priceQuantityPack.getCodeProduct());
        assertEquals(28.88 ,priceQuantityPack.getSum(),0.01 );
        assertEquals(13, priceQuantityPack.getQuantityProduct());
        Map<String, Integer> quantityPack = priceQuantityPack.getQuantityPack();
        int keyTestValue1 = quantityPack.get("3 $5.95");
        int keyTestValue2 = quantityPack.get("9 $16.99");
        assertEquals( 2, keyTestValue1 );
        assertEquals( 1, keyTestValue2 );

        System.out.println(priceQuantityPack);
    }

}