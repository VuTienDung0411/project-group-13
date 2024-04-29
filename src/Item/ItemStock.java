package Item;

import Shop.Shop;
import Utils.Review;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {
    private final Item item;
    private double price;
    private int quantity;
    private final List<Review> reviews;
    private final Shop shop;

    public ItemStock(Item item, double price, int quantity, Shop shop) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.shop = shop;
        this.reviews = new ArrayList<>();
    }

    public Item getItem() {
        return null;
    }

    public double getPrice() {
        return 0;
    }

    public void setPrice(double price) {
    }

    public int getQuantity() {
        return 0;
    }

    public void setQuantity(int quantity) {
    }

    public List<Review> getReviews() {
        return null;
    }

    public Shop getShop() {
        return null;
    }

    public void addReview(Review review) {
    }

    public void removeReview(int reviewId) {

    }

    public void modifyReview(int reviewId, double newRating, String newComment) {

    }

    public void minusWith(ItemStock itemStock) {
        if (itemStock.getItem().getId() != this.item.getId()) {
            throw new IllegalArgumentException("Item mismatch");
        }
        this.quantity -= itemStock.getQuantity();
    }
}
