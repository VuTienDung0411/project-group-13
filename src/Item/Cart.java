package Item;

import java.util.HashSet;

public class Cart {
    private final HashSet<CartItem> items;

    public Cart() {
        items = new HashSet<>();
    }

    public void addToCart(CartItem cartItem) {

    }

    public void addToCart(int cartId, int quantity) {

    }

    public void removeFromCart(int cartId, int quantity) {

    }

    public void removeFromCart(int cartId) {
    }

    public double getTotalPrice() {
        return 0;
    }

    public HashSet<CartItem> getItems() {
        return items;
    }
}


