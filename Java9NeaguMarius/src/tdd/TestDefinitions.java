/*
 * Clasa Test Definitions
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author mario
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creem mai multe instante din fiecare clasa
        
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi();
        Cerc c = new Cerc();
        Patrat p = new Patrat();
        Triunghi t1 = new Triunghi();
        Triunghi t2 = new Triunghi();
        
        // creem o cloectie de date si incarcam in ea obiectele
        
        LinkedList<FiguraGeometrica> listaDeFiguri = new LinkedList();
        listaDeFiguri.add(d1);
        listaDeFiguri.add(d2);
        listaDeFiguri.add(p);
        listaDeFiguri.add(c);
        listaDeFiguri.add(t1);
        listaDeFiguri.add(t2);
        
        //parcurgem lista si listam figurile
        
        listaDeFiguri.forEach((t) -> {
            System.out.println(t.getDefinition());
        });
            
        
        
        
        
        
    }
    
}
