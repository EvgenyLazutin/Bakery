package service;

import model.payment.PriceQuantityPack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static model.payment.PriceQuantityPack.LINE_SEPARATOR;
import static model.payment.PriceQuantityPack.TAB;
import static org.junit.Assert.*;

public class OrderWriterImplTest {

    private OrderWriter orderWriter;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        orderWriter = new OrderWriterImpl();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        orderWriter = null;
        System.setOut(null);
    }

    @Test
    public void consoleWrite() throws Exception {

        List<PriceQuantityPack> priceList = new ArrayList<>();
        PriceQuantityPack quantityPack = new PriceQuantityPack();
        quantityPack.setSum(102.22);
        quantityPack.setCodeProduct("xxx");
        quantityPack.setQuantityProduct(12);
        Map<String, Integer> packMap = new HashMap<>();
        packMap.put("12.85", 3);
        quantityPack.setQuantityPack(packMap);
        priceList.add(quantityPack);

        orderWriter.consoleWrite(priceList);

        assertEquals("12 xxx $102,22" + LINE_SEPARATOR + TAB + "3 x 12.85" + LINE_SEPARATOR + LINE_SEPARATOR, outContent.toString());
    }

}