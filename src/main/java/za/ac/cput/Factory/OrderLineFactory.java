/*
OrderLineFactory Class
Author: Tsireledzo Netshilonwe
Student Number: 230666426
Date: 2025/05/10
*/
package za.ac.cput.factory;
import za.ac.cput.domain.OrderLine;

import za.ac.cput.util.Helper;

public class OrderLineFactory {
    public static OrderLine createOrderLine(  int quantity, double unitPrice) {

        double subTotal = Helper.calculateSubTotal(quantity, unitPrice);

        return new OrderLine.Builder()
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setSubTotal(subTotal)
                .build();
    }
}
