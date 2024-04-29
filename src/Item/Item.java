package Item;

import java.util.List;
import java.util.Objects;

public class Item {
    private final int id;
    private String name;
    private String description;
    private List<ItemCategory> categories;

    private static int currentId = 1;

    public Item(String name, String description, List<ItemCategory> category) {
        this.id = currentId++;
        this.name = name;
        this.description = description;
        this.categories = category;
    }

    public int getId() {
        return id;
    }

    // get/set

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
