//package InterfacesandAbstraction.pr07;
//import InterfacesandAbstraction.pr07.interfaces.*;
//import InterfacesandAbstraction.pr07.modes.*;
//import java.util.ArrayList;
//import java.util.*;
//import java.util.Scanner;
//
//public class Main {
//
//        public static void main(String[]args){
//            Map<String, Soldier> soldiersById = new LinkedHashMap<String, Soldier>();
//            Scanner scanner = new Scanner(System.in);
//            String line = scanner.nextLine();
//            while (!line.equals("EndCommand")) {
//                String[] parameters = line.split(" ");
//                String id = parameters[1];
//                String firstName = parameters[2];
//                String lastName = parameters[3];
//                switch (parameters[0]) {
//                    case "Private": {
//                        double salary = Double.parseDouble(parameters[4]);
//                        soldiersById.put(id, new PrivateImpl(id, firstName, lastName, salary));
//                        break;
//                    }
//                    case "LeutenantGeneral": {
//                        double salary = Double.parseDouble(parameters[4]);
//                        List<Soldier> privates = new ArrayList<Soldier>();
//                        for (int i = 5; i < parameters.length; i++) {
//                            String privateId = parameters[i];
//                            privates.add(soldiersById.get(privateId));
//                        }
////                        soldiersById.put(id, new LeutenantGeneralImpl(id, firstName, lastName, salary, privates));
//                        break;
//                    }
//                    case "Engineer": {
//                        double salary = Double.parseDouble(parameters[4]);
//                        String corps = parameters[5];
//                        List<Repair> repairs = new ArrayList<Repair>();
//                        for (int i = 6; i < parameters.length; i = i + 2) {
//                            String partName = parameters[i];
//                            int hoursWorked = Integer.parseInt(parameters[i + 1]);
////                            Repair repair = new RepairImpl(partName, hoursWorked);
////                            repairs.add(repair);
//                        }
//                        try {
//                            soldiersById.put(id, new EngineerImpl(id, firstName, lastName, salary, corps, repairs));
//                        } catch (IllegalArgumentException ex) {
//                        }
//                        break;
//                    }
//                    case "Commando": {
//                        double salary = Double.parseDouble(parameters[4]);
//                        String corps = parameters[5];
//                        List<Mission> missions = new ArrayList<Mission>();
//                        for (int i = 6; i < parameters.length; i = i + 2) {
//                            String codeName = parameters[i];
//                            String state = parameters[i + 1];
//                            try {
////                                Mission mission = new MissionImpl(codeName, state);
////                                missions.add(mission);
//                            } catch (IllegalArgumentException ex) {
//                            }
//                        }
//                        try {
//                            soldiersById.put(id, new CommandoImpl(id, firstName, lastName, salary, corps, missions));
//                        } catch (IllegalArgumentException ex) {
//                        }
//                        break;
//                    }
//                    case "Spy": {
//                        int codeNumber = Integer.parseInt(parameters[4]);
//                        soldiersById.put(id, new SpyImpl(id, firstName, lastName, codeNumber));
//                        break;
//                    }
//
//                }
//                line = scanner.nextLine();
//            }
//
//            for (Soldier soldier : soldiersById.values()) {
//                System.out.println(soldier);
//            }
//        }
//    }
//
//
