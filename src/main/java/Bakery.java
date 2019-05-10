import service.*;

public class Bakery {

    public static void main(String[] args) {

        PackingManager packingManager = new PackingManager(new OrderReaderImpl(), new CalculateOrderImpl());
        OrderWriter orderWriter = new OrderWriterImpl();
        orderWriter.consoleWrite(packingManager.paymentPacking("order.txt"));
    }
}
