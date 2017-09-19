/**
 * @author David M Rosenberg
 *
 */
public enum ItemSize
{
    // Weight      Display Name    Numeric Value
    SMALL(         "Small",            1 ),
    MEDIUM(        "Medium",           2 ),
    LARGE(         "Large",            4 )
    ;

    public final String displayName ;
    public final int    weightValue ;


    /**
     * @param itemSizeDisplayName
     * @param itemSizeValue
     */
    private ItemSize( String itemSizeDisplayName, int itemSizeValue )
    {
        displayName =   itemSizeDisplayName ;
        weightValue =   itemSizeValue ;
    } // end constructor


    /**
     *
     * @param SizeDescription
     * @return
     */
    public static ItemSize interpretDescription( String SizeDescription )
    {
        // TODO: really implement this
        ItemSize correspondingSize ;

        switch( SizeDescription.toLowerCase().charAt( 0 ) )
        {
            case 's':
                correspondingSize = SMALL ;
                break;

            case 'm':
                correspondingSize = MEDIUM ;
                break;

            case 'l':
                correspondingSize = LARGE ;
                break ;

            default:
                correspondingSize = MEDIUM ;
                break ;
        }   // end switch()

        return  correspondingSize ;
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
        for ( ItemSize anItemSize : ItemSize.values() )
        {
            System.out.printf( "%-5d %-15s %-15s %-15s %-15d %-15s%n",
                    anItemSize.ordinal(),
                    anItemSize,
                    anItemSize.name(),
                    anItemSize.displayName,
                    anItemSize.weightValue,
                    interpretDescription( anItemSize.toString() )
            );
        }   // end for()
    }   // end main()
}   // end enum ItemWeight