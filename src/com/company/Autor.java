package com.company;

import java.io.*;
import java.util.*;

public class Autor implements Serializable{

    final private static File filePath = new File("/Users/lukapervan/IdeaProjects/JavaPractice/Knjige.txt");

    private String imeAutora;
    private String prezimeAutora;
    private String naslovKnjige;
    private String zarnKnjige;

    public Autor(){}

    public Autor(String imeAutora,String prezimeAutora, String naslovKnjige, String zarnKnjige){
        this.imeAutora = imeAutora;
        this.prezimeAutora = prezimeAutora;
        this.naslovKnjige = naslovKnjige;
        this.zarnKnjige = zarnKnjige;
    }

    //IME AUTORA
    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    //PREZIME AUTORA
    public String getPrezimeAutora() {
        return prezimeAutora;
    }

    public void setPrezimeAutora(String prezimeAutora) {
        this.prezimeAutora = prezimeAutora;
    }

    //NASLOV KNJIGE
    public String getNaslovKnjige() {
        return naslovKnjige;
    }

    public void setNaslovKnjige(String knjigaAutora) {
        this.naslovKnjige = knjigaAutora;
    }

    //ZARNK NJIGE
    public String getZarnKnjige() {
        return zarnKnjige;
    }

    public void setZarnKnjige(String zarnKnjige) {
        this.zarnKnjige = zarnKnjige;
    }

    @Override
    public String toString(){
        return "Ime: " + this.imeAutora + "\nPrezime: " + this.prezimeAutora + "\nKnjiga: " + this.naslovKnjige +
                "\nZarn: " + this.zarnKnjige + "\n\n";
    }

    public void unos(Autor a){
        final List<Autor> autori = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime autora:");
        String imeAutora = sc.nextLine();

        System.out.println("Unesite prezime autora:");
        String prezimeAutora = sc.nextLine();

        System.out.println("Unesite naslov knjige:");
        String naslovKnjige = sc.nextLine();

        System.out.println("Unesite zarn knjige:");
        String zarnKnjige = sc.nextLine();

        a = new Autor(imeAutora, prezimeAutora, naslovKnjige, zarnKnjige);
        autori.add(a);

        System.out.println("Zelite li unijeti jos autora?(Da/Ne)");
        String odg = sc.nextLine().toLowerCase();

        if(odg.equals("da"))
            unos(new Autor());
        else if(odg == "ne"){
            try {
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                if(!filePath.exists())
                    filePath.createNewFile();
                oos.writeObject(autori);
                oos.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("U meni-u ste.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("U meni-u ste.");
            }

        }

    }

    public void ispisAutora(){
        try {
            if(!filePath.exists())
                System.out.println("Lista je prazna!");
            else if(filePath.canRead()) {
                FileInputStream fin = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fin);
                ArrayList<Autor> Objekti1 = (ArrayList<Autor>) ois.readObject();
                for (Autor o : Objekti1)
                    System.out.println(o);
            }
            else
                System.out.println("Ne moze ucitati datoteku!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void brisi(String naslov){
        try {
            FileInputStream fin = new FileInputStream("Example.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList<Autor> Objekti1 = (ArrayList<Autor>) ois.readObject();

            if(Objekti1.isEmpty())
                System.out.println("Lista je prazna!");

            else {
                Iterator<Autor> iter = Objekti1.iterator();

                while (iter.hasNext()) {
                    Autor autor1 = iter.next();

                    if (autor1.getNaslovKnjige().equals(naslovKnjige)) {
                        iter.remove();
                        System.out.println("Uspjesno uklonjeno!");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*public void save(ArrayList<Autor> autori) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(filepath));
        for (Autor autor1 : autori)
            pw.println(autor1); // call toString()
        pw.close();
    }*/
}
