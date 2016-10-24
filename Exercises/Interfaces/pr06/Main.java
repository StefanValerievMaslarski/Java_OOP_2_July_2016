package InterfacesandAbstraction.pr06;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        List<String> citizens = new ArrayList<>();
        List<String> robots = new ArrayList<>();
        List<String> pets = new ArrayList<>();

        line = br.readLine();
        while (!line.equals("EndCommand")) {
            String[] tokens = line.split("\\s+");
            String type = tokens[0];
          switch (type){
              case "Citizen":
                  citizens.add(line);
                  break;
              case "Pet":
                  pets.add(line);
                  break;
              case "Robot":
                  robots.add(line);
                  break;
                  default:
                      break;
          }
            line = br.readLine();
        }
        String birthYear = br.readLine();
        int counter = 0;

        for (String citizen : citizens) {
            if (citizen.endsWith(birthYear)) {
                counter++;
                String[] citizenTokens = citizen.split("\\s+");
                System.out.println(citizenTokens[4]);
            }
        }
        for (String pet : pets) {
            if (pet.endsWith(birthYear)) {
                counter++;
                String[] petTokens = pet.split("\\s+");
                System.out.println(petTokens[2]);
            }
        }
        if (counter == 0){
            System.out.printf("<no output>");
        }
    }

}
