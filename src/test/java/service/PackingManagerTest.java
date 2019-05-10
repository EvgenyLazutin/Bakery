package service;

import model.payment.PriceQuantityPack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PackingManagerTest {


    private PackingManager packingManager;

    @Before
    public void init() {
        packingManager = new PackingManager(new OrderReaderImpl(), new CalculateOrderImpl());
    }

    @After
    public void tearDown() {
        packingManager = null;
    }

    @Test
    public void paymentPackingTest() throws Exception {
        List<PriceQuantityPack> result = packingManager.paymentPacking("order.txt");
        assertEquals(3, result.size());
    }

    @Test(expected = RuntimeException.class)
    public void paymentPackingTestEx() throws Exception {
        List<PriceQuantityPack> result = packingManager.paymentPacking("wrongOrder.txt");
    }


}