package ua.hillel.onlineshop;

/**
 * Class tells of Orders that have been placed by Clients.
 */

public class Orders {
    int id;
    int clientId;
    int[] productId;
    String date;
    double minimumOrderValue;
    double orderValue;
    double maximumOrderValue;
    boolean isDiscountApplicable;
}
