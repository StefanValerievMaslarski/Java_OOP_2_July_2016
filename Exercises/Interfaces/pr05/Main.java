package InterfacesandAbstraction.pr05;


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

        line = br.readLine();
        while (!line.equals("EndCommand")) {
            String[] tokens = line.split("\\s+");
            if (tokens.length == 2) {
                //robot
                robots.add(line);
            } else {
                //citizen
                citizens.add(line);
            }
            line = br.readLine();
        }
        String fakeNumber = br.readLine();
        for (String citizen : citizens) {
            if (citizen.endsWith(fakeNumber)) {
                String[] citizenTokens = citizen.split("\\s+");
                System.out.println(citizenTokens[2]);
            }
        }
        for (String robot : robots) {
            if (robot.endsWith(fakeNumber)) {
                String[] robotTokens = robot.split("\\s+");
                System.out.println(robotTokens[1]);
            }
        }
    }

}


