/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenefamily;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author mario
 */
public class Femeie extends Thread{
    private Barbat barbat;
    private boolean treaza;
    private Tv tv;
    
    public Femeie(Barbat barbat, Tv tv){
        this.barbat = barbat;
        this.tv = tv;
    }
    
    public void run(){
        seUitaLaTv();
    }
    public synchronized void seUitaLaTv(){
        System.out.println("Femeia se uita la tv");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Femeie.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (!tv.esteEmisiuneaPreferata()){
            femeiaAdoarme();
            break;
        }
    }
    public void femeiaAdoarme(){
        System.out.println("Din cauza emisiunilor plictisitoare femeia adoarme");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Femeie.class.getName()).log(Level.SEVERE, null, ex);
        }
        treaza = false;
        synchronized(barbat){
            try{
                System.out.println("Femeia asteapta ca sotul sa o trezeasca");
                Thread.sleep(2000);
                barbat.wait();
            } catch (InterruptedException ex){
               Logger.getLogger(Barbat.class.getName()).log(Level.SEVERE, null, ex);
           }
            System.out.println("Am primit notificarea de la sotul meu");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Femeie.class.getName()).log(Level.SEVERE, null, ex);
            }
            femeiaSeTrezeste();
        }
    }
    public synchronized void femeiaSeTrezeste(){
        System.out.println("Femeia s-a trezit");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Femeie.class.getName()).log(Level.SEVERE, null, ex);
        }
        treaza = true;
        while (tv.esteEmisiuneaPreferata){
            System.out.println("Femeia se uita la emisiunea sa preferata");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Femeie.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
    }
}
