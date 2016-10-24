package test.reflection.beerExample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, ReflectiveOperationException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long start = System.nanoTime();
        System.out.println(start);
        String line;
        while (true){
            if ((line = br.readLine()).equals("END")){
                break;
            }
            String[] input = line.split(" ");
            String beerName = input[0];
            int  quantity = Integer.parseInt(input[1]);
            BeerFactory beerFactory = new BeerFactory();
            Beer beer = beerFactory.createBeer(beerName, quantity);
            System.out.println("Beer "  + beer.getClass().getSimpleName() + " created!");

        }
        long end = System.nanoTime();
        System.out.println(end);
        long result = end - start;
        System.out.println(result);



    }

}
