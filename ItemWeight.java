/**
 * @author David M Rosenberg
 *
 */
public enum ItemWeight
{
    // Weight      Display Name    Numeric Value
    LIGHT(         "Light",            1 ),
    MEDIUM(        "Medium",           2 ),
    HEAVY(         "Heavy",            4 )
    ;

    public final String displayName ;
    public final int    weightValue ;


    /**
     * @param itemWeightDisplayName
     * @param itemWeightValue
     */
    private ItemWeight( String itemWeightDisplayName, int itemWeightValue )
    {
        displayName =   itemWeightDisplayName ;
        weightValue =   itemWeightValue ;
    } // end constructor


    /**
     *
     * @param weightDescription
     * @return
     */
    public static ItemWeight interpretDescription( String weightDescription )
    {
        // TODO: really implement this
        ItemWeight correspondingWeight ;

        switch( weightDescription.toLowerCase().charAt( 0 ) )
        {
            case 'l':
                correspondingWeight = LIGHT ;
                break;

            case 'm':
                correspondingWeight = MEDIUM ;
                break;

            case 'h':
                correspondingWeight = HEAVY ;
                break ;

            default:
                correspondingWeight = MEDIUM ;
                break ;
        }   // end switch()

        return  correspondingWeight ;
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
        for ( ItemWeight anItemWeight : ItemWeight.values() )
        {
            System.out.printf( "%-5d %-15s %-15s %-15s %-15d %-15s%n",
                    anItemWeight.ordinal(),
                    anItemWeight,
                    anItemWeight.name(),
                    anItemWeight.displayName,
                    anItemWeight.weightValue,
                    interpretDescription( anItemWeight.toString() )
            );
        }   // end for()
    }   // end main()
}   // end enum ItemWeight