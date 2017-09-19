import java.io.File;
import java.util.Scanner;

public class GroceryBagger
{
    private static final int MAX_BAG_SIZE = 8;
    private static final int MAX_BAG_WEIGHT = 8;
    private BagInterface<GroceryItem> groceryBag;
    private boolean initialized;

    public GroceryBagger(String fileName)
    {
        initialized = false;
        groceryBag = new ResizableArrayBag<>();
        Scanner input;
        try
        {
            input = new Scanner(new File(fileName));
            while (input.hasNextLine())
            {
                groceryBag.add(this.stringArrayToGroceryItem(input.nextLine().split("\\s")));
            }
        }
        catch (Exception FileNotFoundException)
        {
            initialized = false;
            groceryBag = null;
            System.exit(0);
        }
        initialized = true;
    }

    private GroceryItem stringArrayToGroceryItem(String[] itemDescription)
    {
        String name = itemDescription[0];
        ItemSize itemSize;
        ItemWeight itemWeight;
        ItemDurability itemDurability;

        switch (itemDescription[1].toLowerCase())
        {
            case "small":
                itemSize = ItemSize.SMALL;
                break;
            case "medium":
                itemSize = ItemSize.MEDIUM;
                break;
            case "large":
                itemSize = ItemSize.LARGE;
                break;
            default:
                itemSize = ItemSize.MEDIUM;
                break;
        }

        switch (itemDescription[2].toLowerCase())
        {
            case "light":
                itemWeight = ItemWeight.LIGHT;
                break;
            case "medium":
                itemWeight = ItemWeight.MEDIUM;
                break;
            case "heavy":
                itemWeight = ItemWeight.HEAVY;
                break;
            default:
                itemWeight = ItemWeight.MEDIUM;
                break;
        }

        switch (itemDescription[3].toLowerCase())
        {
            case "nonbreakable":
                itemDurability = ItemDurability.NONBREAKABLE;
                break;
            case "breakable":
                itemDurability = ItemDurability.BREAKABLE;
                break;
            default:
                itemDurability = ItemDurability.BREAKABLE;
        }

        return new GroceryItem(name, itemSize, itemWeight, itemDurability);
    }


}