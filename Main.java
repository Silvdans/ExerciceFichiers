package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("menu.txt");
        Scanner scanner = new Scanner(System.in);
	    try{
            String newLine = System.getProperty("line.separator");
            FileWriter writer = new FileWriter(file);
            boolean encoreEntree = true;
            writer.write("-----Entrées-----"+newLine);
            while(encoreEntree){
                System.out.println("Voulez vous une entrée ? O/N");
                String ask = scanner.nextLine();
                if(ask.equals("O")){
                    System.out.println("Que voulez vous comme entrée ?");
                    String entree = scanner.nextLine();
                    writer.write(entree + newLine);
                    System.out.println("Entree enregistrée !");
                }
                else if(ask.equals("N")){
                    encoreEntree = false;
                }
                else{
                    throw new IllegalArgumentException("Mauvais argument donné");
                }

            }
            writer.write("-----Plat-----"+newLine);
            boolean encorePlat = true;
            while (encorePlat){
                System.out.println("Voulez vous un plat ? O/N");
                String ask = scanner.nextLine();
                if(ask.equals("O")){
                    System.out.println("Que voulez vous comme Plat ?");
                    String plat = scanner.nextLine();
                    writer.write(plat + newLine);
                    System.out.println("Plat enregistrée !");
                }
                else if(ask.equals("N")){
                    encorePlat = false;
                }
                else{
                    throw new IllegalArgumentException("Mauvais argument donné");
                }
            }
            writer.write("-----Dessert-----"+newLine);
            boolean encoreDessert = true;
            while (encoreDessert){
                System.out.println("Voulez vous un dessert ? O/N");
                String ask = scanner.nextLine();
                if(ask.equals("O")){
                    System.out.println("Que voulez vous comme Dessert ?");
                    String dessert = scanner.nextLine();
                    writer.write(dessert + newLine);
                    System.out.println("Dessert enregistrée !");
                }
                else if(ask.equals("N")){
                    encoreDessert = false;
                }
                else{
                    throw new IllegalArgumentException("Mauvais argument donné");
                }
            }
            writer.close();
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            boolean read = true;

            while(read){
                String line = buffer.readLine();

                if(line == null){
                    read = false;
                    continue;
                }
                System.out.println(line);
            }
            buffer.close();
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }



    }
}
