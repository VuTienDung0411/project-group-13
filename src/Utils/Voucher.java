package Utils;

import java.util.Date;
import java.util.Objects;

public class Voucher {
    private int id;
    private String name;
    private double discount;
    private Date expirationDate;

    private static int currentId = 1;

    public Voucher(String name, double discount, Date expirationDate) {

    }

    // get/set

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voucher voucher)) return false;
        return id == voucher.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
