/*
 * Clasa Triunghi
 */
package tdd;

/**
 *
 * @author mario
 */
public class Triunghi extends Plana {
    
    public static final String TRIUNGHI = "with three straight sides and three angles.";
    public static final String TRIANGLE_BEGIN = "TRIANGLE:";
    
    @Override
    public String getDefinition(){
        
        String definition = TRIANGLE_BEGIN + super.getDefinition() + TRIUNGHI;
        
        
        return definition;
        
    }
    
}
