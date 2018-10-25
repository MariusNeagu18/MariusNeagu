/*
 * Test CNP
 */
package testcnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mario
 */
public class TestCnp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String regex = "(^(1|2)((0[0-9]|1[012])(0[0-9]|1[0-9]|2[0-8])|((0[13578]|1[02])(29|3[01]))|((0[469]|11)(29|30)))(19|20)\\d{6}$)";

        // create a pattern using introduced regular expresion
        Pattern pattern = Pattern.compile(regex);
        // read the source string using a new Scanner object
        Scanner scannerSourceString = new Scanner(System.in);
        System.out.println("Insert CNP: ");
        String source = scannerSourceString.nextLine();
        if (source.matches(regex)) {
            System.out.println("CNP is valid");
            
        } else {
            System.out.println("CNP is invalid");
        }

    }

}
