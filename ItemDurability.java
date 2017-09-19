/**
 * @author David M Rosenberg
 *
 */
public enum ItemDurability
{
    // Weight      Display Name    Numeric Value
    BREAKABLE(         "Breakable",            1 ),
    NONBREAKABLE(        "Nonbreakable",           2 )
    ;

    public final String displayName ;
    public final int    weightValue ;


    /**
     * @param itemDurabilityDisplayName
     * @param itemDurabilityValue
     */
    private ItemDurability( String itemDurabilityDisplayName, int itemDurabilityValue )
    {
        displayName =   itemDurabilityDisplayName ;
        weightValue =   itemDurabilityValue ;
    } // end constructor


    /**
     *
     * @param durabilityDescription
     * @return
     */
    public static ItemDurability interpretDescription( String durabilityDescription )
    {
        // TODO: really implement this
        ItemDurability correspondingDurability ;

        switch( durabilityDescription.toLowerCase().charAt( 0 ) )
        {
            case 'b':
                correspondingDurability = BREAKABLE ;
                break;

            case 'n':
                correspondingDurability = NONBREAKABLE ;
                break;

            default:
                correspondingDurability = BREAKABLE ; // assume breakable for item safety
                break ;
        }   // end switch()

        return  correspondingDurability ;
    }   // end method interpretDescription()


    /**
     *
     */
    @Override
    public String toString()
    {
        return displayName ;
    }   // end method toString()


    /**
     *
     * @param args
     */
    public static void main( String[] args )
    {
        //  TODO: implement more complete set of tests/add low-level method tests

        // display column headers
        System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                "#",
                "Item Weight",
                "Name",
                "Display Name",
                "Weight Value",
                "Interpreted Weight"
        );

        // display each element of the enumeration
        for ( ItemDurability anItemDurability : ItemDurability.values() )
        {
            System.out.printf( "%-5d %-15s %-15s %-15s %-15d %-15s%n",
                    anItemDurability.ordinal(),
                    anItemDurability,
                    anItemDurability.name(),
                    anItemDurability.displayName,
                    anItemDurability.weightValue,
                    interpretDescription( anItemDurability.toString() )
            );
        }   // end for()
    }   // end main()
}   // end enum ItemWeight