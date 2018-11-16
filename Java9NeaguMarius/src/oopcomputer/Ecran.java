/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author mario
 */
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;

    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }

    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {

        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "=":
                stapana.getAlu().setOperandDoi(Integer.parseInt(this.afisaj));
                stapana.getAlu().calculeaza();
                System.out.println("Ecranul afiseaza: " + stapana.getAlu().getRezultat());
                break;
            default:
                if (this.stapana.getAlu().getOperator() == ' ') {
                    if ("0" == this.afisaj) {
                        this.afisaj = this.afisaj.substring(1);
                    }
                    this.afisaj = this.afisaj + afisaj;
                    System.out.println("Ecranul afiseaza: " + this.afisaj);
                }
                if (stapana.getAlu().getOperator() != ' ') {
                    if (Integer.parseInt(this.afisaj) == stapana.getAlu().getOperandUnu()) {
                        this.afisaj = "";
                        this.afisaj = this.afisaj + afisaj;
                    } else {
                        this.afisaj = this.afisaj + afisaj;
                    }
                    System.out.println("Ecranul afiseaza: " + this.afisaj);
                }
        }
    }

    /**
     * Private method for computation
     */
    private void operatiuneLocala(char c) {
        stapana.getAlu().setOperandUnu(Integer.parseInt(afisaj));
        stapana.getAlu().setOperator(c);
        System.out.println("Ecranul afiseaza: " + this.afisaj);
    }
}