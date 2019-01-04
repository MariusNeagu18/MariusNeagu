/*
 * Clasa Tv
 */
package scenefamily;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Tv extends Thread {

    public boolean esteEmisiuneaPreferata;

    public boolean esteEmisiuneaPreferata() {
        return esteEmisiuneaPreferata;
    }

    public void run() {
        emisiuniPlictisitoare();

    }

    public void emisiuniPlictisitoare() {
        synchronized (this) {
            System.out.println("La tv sunt emisiuni plictisitoare");
            esteEmisiuneaPreferata = false;
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, ex);
        }
        emisiuneaPreferata();
    }

    public synchronized void emisiuneaPreferata() {
        System.out.println("La tv este emisiunea preferata a sotiei");
        esteEmisiuneaPreferata = true;
        System.out.println("Televizorul trimite notificare sotului ca a inceput emisiunea preferata a sotiei");
        notify();
    }
}
