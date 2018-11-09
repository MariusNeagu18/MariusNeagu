/*
 * Clasa Cerc
 */
package tdd;

/**
 *
 * @author mario
 */
public class Cerc extends Plana{
    
    public static final String CIRCLE_BEGIN = "CIRCLE:";
    public static final String CERC = "whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    @Override
    public String getDefinition(){
        String definition = CIRCLE_BEGIN + super.getDefinition() + CERC;
        return definition;
        
    }
}
