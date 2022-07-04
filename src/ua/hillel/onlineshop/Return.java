package ua.hillel.onlineshop;

/**
 * Class describes possible returns that can be requested by Clients.
 */

public class Return {
    int id;
    int clientId;
    int[] productId;
    String date;
    String explanation;
    boolean isApproved;
}
