import service.*;

/**
 * Application for calculating the cost and quantity of packages for the Bakery.
 * <p>
 *
 * @author Lazutin Evgeny
 */
public class Bakery {

    public static void main(String[] args) {

        PackingManager packingManager = new PackingManager(new OrderReaderImpl(), new CalculateOrderImpl());
        OrderWriter orderWriter = new OrderWriterImpl();
        orderWriter.consoleWrite(packingManager.paymentPacking("order.txt"));
    }
}
