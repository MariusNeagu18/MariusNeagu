/*
 * Clasa Barbat
 */
package scenefamily;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Barbat extends Thread {

    private Tv tv;

    public Barbat(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        aspira();
        seUitaLaTv();
    }

    public void aspira() {
        synchronized (tv) {
            System.out.println("Barbatul aspira");
        }
    }

    public void seUitaLaTv() {
        synchronized (tv) {
            System.out.println("Barbatul asteapta sa inceapa emisiunea preferata a nevestei");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Barbat.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                tv.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Barbat.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("A inceput emisiunea preferata a nevestei");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Barbat.class.getName()).log(Level.SEVERE, null, ex);
            }
            trezesteNevasta();
        }
    }

    public synchronized void trezesteNevasta() {
        System.out.println("Draga a inceput emisiunea ta preferata");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Barbat.class.getName()).log(Level.SEVERE, null, ex);
        }
        notify();
    }
}