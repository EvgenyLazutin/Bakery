package service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderReaderTest {

    private OrderReader orderReader;

    @Before
    public void init() {
        orderReader = new OrderReaderImpl();
    }

    @After
    public void tearDown() {
        orderReader = null;
    }

    @Test
    public void orderReaderTest() throws Exception {
        List<String> result = orderReader.readFile("order.txt");
        assertEquals(3, result.size());
    }

    @Test(expected = RuntimeException.class)
    public void orderReaderTest2() throws Exception {
        List<String> result = orderReader.readFile("fileDoesNotExist.txt");
        assertEquals(3, result.size());
    }

}