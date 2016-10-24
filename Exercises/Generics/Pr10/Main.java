package generics.Pr10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] personInput = br.readLine().split(" ");
        String name = personInput[0] + " " + personInput[1];
        String address = personInput[2];
        Tuple<String, String> tuple = new Tuple<>(name, address);
        System.out.println(tuple.toString());
        String[] personBeer = br.readLine().split(" ");
        String namePerson = personBeer[0];
        Integer beerToDrink = Integer.parseInt(personBeer[1]);
        Tuple<String, Integer> tuple2 = new Tuple<>(namePerson, beerToDrink);
        System.out.println(tuple2.toString());
        String[] digits = br.readLine().split(" ");
        Integer integers = Integer.valueOf(digits[0]);
        Double doubles = Double.valueOf(digits[1]);
        Tuple<Integer, Double> tuple3 = new Tuple<>(integers, doubles);
        System.out.println(tuple3.toString());




    }

}
