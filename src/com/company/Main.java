package com.company;

import java.io.*;
import java.util.*;

class Main{

    //MAIN
    public static void main(String[] args) {
        List<Autor> autori = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Autor autor = new Autor("Luka", "Pervan", "Stranac", "Drama");
        autori.add(autor);

        while(true){

            System.out.println("Izaberite opciju: \n" +
                    "Opcija 1: Ucitaj knjige:\n" +
                    "Opcija 2: Unos knjige:\n" +
                    "Opcija 3: Brisanje knjige:\n" +
                    "Opcija 4: Izlaz");
            int opcija = scanner.nextInt();
            if(opcija < 0 && opcija > 6){
                System.out.println("Unijeli ste broj koji ne nudi uslugu, pokusajte ponovo:");
            }
            else if(opcija == 1){

                if(autori.isEmpty()) {
                    System.out.println("Lista je prazna!");
                    break;
                }

                //PODACI
                for(Autor a: autori){
                    System.out.println(a);
                }
            }
            else if(opcija == 2){

                //STVARANJE AUTORA
                Scanner sc = new Scanner(System.in);

                System.out.println("Unesite ime autora:");
                String imeAutora = sc.nextLine();

                System.out.println("Unesite prezime autora:");
                String prezimeAutora = sc.nextLine();

                System.out.println("Unesite naslov knjige:");
                String naslovKnjige = sc.nextLine();

                System.out.println("Unesite zarn knjige:");
                String zarnKnjige = sc.nextLine();

                Autor a = new Autor(imeAutora, prezimeAutora, naslovKnjige, zarnKnjige);
                autori.add(a);
                System.out.println("Uspjesno dodano!");
            }
            else if(opcija == 3){
                System.out.println("Unesite naslov knjige koju zelite izbrisati:");
                Scanner sc = new Scanner(System.in);
                String naslovKnjige = sc.nextLine();
                if(autori.isEmpty()) {
                    System.out.println("Lista je prazna!");
                    break;
                }
                Iterator<Autor> iter = autori.iterator();

                while (iter.hasNext()) {
                    Autor autor1 = iter.next();

                    if (autor1.getNaslovKnjige().equals(naslovKnjige)) {
                        iter.remove();
                        System.out.println("Uspjesno uklonjeno!");
                    }
                }

            }
            else if(opcija == 4){
                System.out.println("Izasli ste!");
                break;
            }
            /*else if(opcija == 5){
                try (FileOutputStream fos = new FileOutputStream("object.dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                    // create a new user object
                    Autor user = new Autor();

                    // write object to file
                    oos.writeObject(user);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            }*/
        }


    }
}