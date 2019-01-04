/*
 * Clasa Scenariului
 */
package scenefamily;

/**
 *
 * @author mario
 */
public class TestScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Aspirator aspirator = new Aspirator();
        Tv tv = new Tv();
        Barbat barbat = new Barbat(tv);
        Femeie femeie = new Femeie(barbat, tv);
        tv.start();
        tv.sleep(2000);
        aspirator.start();
        aspirator.sleep(2000);
        femeie.start();        
        barbat.start();        
    }    
}
