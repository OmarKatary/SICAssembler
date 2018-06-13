/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemprogramming;
import java.io.IOException;
/**
 *
 *
 * @author Katary
 */
public class SystemProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
       Assembler a = new Assembler("TestCase1.txt");
       a.assemble();
     
    }
}
