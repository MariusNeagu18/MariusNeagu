/*
 * Clasa buton din care vom creea butoanele
 */
package oopcomputer;

/**
 *
 * @author mario
 */
public class Buton {

    private Character simbol;
    private Carcasa stapana;

    public Buton(Character noulSimbol) {
        this.simbol = noulSimbol;
    }

    public Buton(Character noulSimbol, Carcasa nouaCarcasa) {
        this.simbol = noulSimbol;
        this.stapana = nouaCarcasa;
    }
    //seters and getters
    public Character getSimbol() {
        return simbol;
    }

    public void setSimbol(Character simbol) {
        this.simbol = simbol;
    }

    public Carcasa getStapana() {
        return stapana;
    }

    public void setStapana(Carcasa stapana) {
        this.stapana = stapana;
    }

    public void apasa() {
        System.out.println("A fost apasat " + simbol);
        stapana.getEcran().setAfisaj(simbol.toString());
    }
}