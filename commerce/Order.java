package commerce;

import java.util.Map;
import java.util.Set;

import business.Customer;
import business.Manager;
import business.Product;
import business.Seller;

public class Order {
    private static final int MAX_RESPONSIBLE = 5;
    private static final int MIN_SELLERS = 1;
    private Customer customer;
    private Manager[] responsibles;
    private int numberOfResponsibles;
    private Set<Seller> seller;
    private Map<Product, Item> items;

    public Order(Customer customer, Seller seller) {

    }

}
