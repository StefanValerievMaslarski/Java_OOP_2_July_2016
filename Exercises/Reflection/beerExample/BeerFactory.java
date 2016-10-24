package test.reflection.beerExample;


public class BeerFactory {

    private static final String PACKAGE_NAME = "test.reflection.beerExample.";


    Beer createBeer(String beerName, int quantity)  {

        switch (beerName){
            case "Shumensko":
                return new Shumensko(beerName, quantity);
            case "Kamenitza":
                return new Kamenitza(beerName, quantity);
            case "Zagorka":
                return new Zagorka(beerName, quantity);
            default:
                throw new RuntimeException("Invalid beers!");
        }




//        Beer beer = null;
//        try{
//            Class beerClass = Class.forName(PACKAGE_NAME + beerName);
//            Constructor constructor = beerClass.getConstructor(String.class, int.class);
//            beer = (Beer) constructor.newInstance(beerName, quantity);
//
//
//        } catch (ReflectiveOperationException roe){
//            throw new RuntimeException("Invalid Beer!");
//        }
//        return beer;




    }
}
