package com.company;

import java.io.Serializable;

public class Autor implements Serializable{

    final private static String filepath = "/Users/lukapervan/IdeaProjects/JavaPractice/Knjige.txt";

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

    /*public void save(ArrayList<Autor> autori) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(filepath));
        for (Autor autor1 : autori)
            pw.println(autor1); // call toString()
        pw.close();
    }*/
}
