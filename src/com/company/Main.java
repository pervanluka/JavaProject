package com.company;

import java.io.*;
import java.util.*;

class Main{

    //MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Autor a = new Autor();

        while(true){

            System.out.println("Izaberite opciju: \n" +
                    "Opcija 1: Ucitaj knjige:\n" +
                    "Opcija 2: Unos knjige:\n" +
                    "Opcija 3: Brisanje knjige:\n" +
                    "Opcija 4: Izlaz");
            int opcija = scanner.nextInt();
            if(opcija < 0 && opcija > 4){
                System.out.println("Unijeli ste broj koji ne nudi uslugu, pokusajte ponovo:");
            }
            else if(opcija == 1){
                //ISPIS AUTORA
                a.ispisAutora();
            }
            else if(opcija == 2){

                //STVARANJE AUTORA
                Autor autor1 = new Autor();
                a.unos(autor1);


            }
            else if(opcija == 3){
                /*System.out.println("Unesite naslov knjige koju zelite izbrisati:");
                Scanner sc = new Scanner(System.in);
                String naslovKnjige = sc.nextLine();
                a.brisi(naslovKnjige);*/

            }
            else if(opcija == 4){
                System.out.println("Izasli ste!");
                break;
            }
        }
    }
}