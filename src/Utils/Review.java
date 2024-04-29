package Utils;

import User.Customer;

import java.util.Objects;

public class Review {
    private final int id;
    private final Customer author;
    private double rating;
    private String comment;

    private static int currentId = 1;

    public Review(Customer author, double rating, String comment) {
        id = currentId++;
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    // Get/set

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Review)) {
            return false;
        }
        return this.id == ((Review) obj).id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
