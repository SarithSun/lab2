public class GroceryItem {
    final String name;
    final ItemSize itemSize;
    final ItemWeight itemWeight;
    final ItemDurability itemDurability;

    public GroceryItem(String name, ItemSize size, ItemWeight weight, ItemDurability durability)
    {
        this.name = name;
        this.itemSize = size;
        this.itemWeight = weight;
        this.itemDurability = durability;
    }
}
