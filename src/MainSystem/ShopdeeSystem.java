package MainSystem;

import Item.ItemStock;
import Order.Order;
import Shop.Shop;
import User.Customer;
import User.Shipper;
import User.User;
import Utils.Address;

import java.util.*;

public final class ShopdeeSystem {
    private static final double SHIPPER_FEE = 0.01;
    private static final double PROFIT = 0.09;
    private final static double SHOP_PORTION = 1.0 - SHIPPER_FEE - PROFIT;

    private static Hashtable<String, Customer> customers;
    private static Hashtable<String, Shipper> shippers;
    private static double profit = 0.0;
    private static List<Order> orders = new ArrayList<>();

    private ShopdeeSystem() {
        customers = new Hashtable<>();
        shippers = new Hashtable<>();
        // TODO: Đọc file -> khởi tạo mọi thứ từ file
    }

    private static final class ShopdeeSystemHolder {
        private static final ShopdeeSystem instance = new ShopdeeSystem();
    }

    public static ShopdeeSystem getInstance() {
        return ShopdeeSystemHolder.instance;
    }

    public List<Address> findAddresses(String address) {
        // Dũng làm method này
        return null;
    }

    public List<ItemStock> findProducts(String productName) {
        // Dũng làm method này
        return null;
    }

    public List<Shop> findShops(String shopName) {
        // Dũng làm method này
        return null;
    }

    public void shopAcceptOrder(List<Integer> orderIds) {

    }

    public List<Order> getCustomerOrders(Customer customer) {
        return null;
    }

    public SystemResponse createOrder(Customer customer) {
        return null;
    }

    public boolean shipperTakesOrder(Shipper shipper, int shippingOrderId) {
        return false;
    }

    public void shipperFinishesOrder(Shipper shipper, int shippingOrderId) {

    }

    public void userConfirmOrder(Customer customer, Order order) {

    }

    public boolean registerCustomer(String username, String password, String name, String phone, Address address) {
        if (username == null || password == null) return false;
        if (customers.containsKey(username)) {
            return false;
        }
        customers.put(username, new Customer(username, password, name, phone, address));
        return true;
    }

    public boolean registerShipper(String username, String password, String name, String phone, Address address) {
        if (username == null || password == null) return false;
        if (shippers.containsKey(username)) {
            return false;
        }
        shippers.put(username, new Shipper(username, password, name, phone, address));
        return true;
    }

    public Optional<User> authorizeCustomer(String username, String password) {
        if (username == null || password == null) return Optional.empty();
        Customer customer = customers.get(username);
        if (customer == null) return Optional.empty();
        if (customer.getPassword().equals(password)) return Optional.of(customer);
        return Optional.empty();
    }

    public Optional<User> authorizeShipper(String username, String password) {
        if (username == null || password == null) return Optional.empty();
        Shipper shipper = shippers.get(username);
        if (shipper == null) return Optional.empty();
        if (shipper.getPassword().equals(password)) return Optional.of(shipper);
        return Optional.empty();
    }
}
