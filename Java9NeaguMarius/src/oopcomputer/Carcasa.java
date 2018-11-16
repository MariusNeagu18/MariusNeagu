/*
 * Carcasa calculatorului de birou
 */
package oopcomputer;

/**
 *
 * @author mario
 */
public class Carcasa {

    private Ecran ecran = new Ecran(this);
    private Buton buton0 = new Buton('0', this);
    private Buton buton1 = new Buton('1', this);
    private Buton buton2 = new Buton('2', this);
    private Buton buton3 = new Buton('3', this);
    private Buton buton4 = new Buton('4', this);
    private Buton buton5 = new Buton('5', this);
    private Buton buton6 = new Buton('6', this);
    private Buton buton7 = new Buton('7', this);
    private Buton buton8 = new Buton('8', this);
    private Buton buton9 = new Buton('9', this);
    private Buton butonPlus = new Buton('+', this);
    private Buton butonMinus = new Buton('-', this);
    private Buton butonOri = new Buton('*', this);
    private Buton butonImpartire = new Buton('/', this);
    private Buton butonEgal = new Buton('=', this);
    private Alu alu = new Alu();

    //getters and setters
    public Ecran getEcran() {
        return ecran;
    }

    public void setEcran(Ecran ecran) {
        this.ecran = ecran;
    }

    public Buton getButon0() {
        return buton0;
    }

    public void setButon0(Buton buton0) {
        this.buton0 = buton0;
    }

    public Buton getButon1() {
        return buton1;
    }

    public void setButon1(Buton buton1) {
        this.buton1 = buton1;
    }

    public Buton getButon2() {
        return buton2;
    }

    public void setButon2(Buton buton2) {
        this.buton2 = buton2;
    }

    public Buton getButon3() {
        return buton3;
    }

    public void setButon3(Buton buton3) {
        this.buton3 = buton3;
    }

    public Buton getButon4() {
        return buton4;
    }

    public void setButon4(Buton buton4) {
        this.buton4 = buton4;
    }

    public Buton getButon5() {
        return buton5;
    }

    public void setButon5(Buton buton5) {
        this.buton5 = buton5;
    }

    public Buton getButon6() {
        return buton6;
    }

    public void setButon6(Buton buton6) {
        this.buton6 = buton6;
    }

    public Buton getButon7() {
        return buton7;
    }

    public void setButon7(Buton buton7) {
        this.buton7 = buton7;
    }

    public Buton getButon8() {
        return buton8;
    }

    public void setButon8(Buton buton8) {
        this.buton8 = buton8;
    }

    public Buton getButon9() {
        return buton9;
    }

    public void setButon9(Buton buton9) {
        this.buton9 = buton9;
    }

    public Buton getButonPlus() {
        return butonPlus;
    }

    public void setButonPlus(Buton butonPlus) {
        this.butonPlus = butonPlus;
    }

    public Buton getButonMinus() {
        return butonMinus;
    }

    public void setButonMinus(Buton butonMinus) {
        this.butonMinus = butonMinus;
    }

    public Buton getButonOri() {
        return butonOri;
    }

    public void setButonOri(Buton butonOri) {
        this.butonOri = butonOri;
    }

    public Buton getButonImpartire() {
        return butonImpartire;
    }

    public void setButonImpartire(Buton butonImpartire) {
        this.butonImpartire = butonImpartire;
    }

    public Buton getButonEgal() {
        return butonEgal;
    }

    public void setButonEgal(Buton butonEgal) {
        this.butonEgal = butonEgal;
    }

    public Alu getAlu() {
        return alu;
    }

    public void setAlu(Alu alu) {
        this.alu = alu;
    }

}