package generics.pr11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] personInput = br.readLine().split(" ");
        String name = personInput[0] + " " + personInput[1];
        String address = personInput[2];
        String town = personInput[3];
        Tuple<String, String, String> tuple = new Tuple<>(name, address, town);
        System.out.println(tuple.toString());
        String[] personBeer = br.readLine().split(" ");
        String namePerson = personBeer[0];
        Integer beerToDrink = Integer.parseInt(personBeer[1]);
        String drunkOrNot = personBeer[2];
        boolean dunkOrNot = false;
        if (drunkOrNot.equals("drunk")){
            dunkOrNot = true;
        }
        Tuple<String, Integer, Boolean> tuple2 = new Tuple<>(namePerson, beerToDrink, dunkOrNot);
        System.out.println(tuple2.toString());
        String[] bankIfo = br.readLine().split(" ");
        String nameP = bankIfo[0];
        Double bankAccount = Double.valueOf(bankIfo[1]);
        String bankName = bankIfo[2];
        Tuple<String, Double, String> tuple3 = new Tuple<>(nameP, bankAccount, bankName);
        System.out.println(tuple3.toString());




    }

}
