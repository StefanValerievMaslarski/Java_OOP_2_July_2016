package InterfacesandAbstraction.pr04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                SmartPhone smartphone = new SmartPhone();


                String line = null;
                while (((line = br.readLine()) != null)){
                    String[] tokens = line.split("\\s+");
                    for (String token:tokens) {
                        char firstChar = token.charAt(0);
                        if (Character.isDigit(firstChar)){
                            // String is a number
                            Pattern pattern = Pattern.compile("[\\D]");
                            Matcher matcher = pattern.matcher(token);
                            if (matcher.find()){
                                System.out.printf("Invalid number!%n");
                            } else {
                                String call = smartphone.call(token);
                                System.out.println(call);
                                continue;
                            }

                        } else {
                            Pattern pattern = Pattern.compile("[\\d]");
                            Matcher matcher = pattern.matcher(token);

                            if (matcher.find()){
                                System.out.printf("Invalid URL!%n");
                            } else {
                                String sitePreview = smartphone.browse(token);
                                System.out.println(sitePreview);
                                continue;
                            }

                        }
                    }


                }
            }
        }





