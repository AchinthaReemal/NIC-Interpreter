/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;
import NICInterpreterPack.NIC_Interpreter;
import junit.framework.TestCase;

/**
 *
 * @author Sony
 */
public class NIC_InterpreterTest extends TestCase{

    //
    
    protected void setUp() throws Exception {
        super.setUp();
        
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
              
        
    }

    /**
     * Test of getYear method, of class NicInterpreter.
     */
    public void testGetYear()throws Exception {
        System.out.println("getYear");
        NIC_Interpreter instance = new NIC_Interpreter("903184744V");
        int expResult = 1990;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class NIC_Interpreter.
     */
    public void testGetMonth()throws Exception {
        System.out.println("getMonth");
        NIC_Interpreter instance = new NIC_Interpreter("903184744V");
        int expResult = 11;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class NIC_Interpreter.
     */
    public void testGetDate()throws Exception {
        System.out.println("getDate");
        NIC_Interpreter instance = new NIC_Interpreter("903184744V");;
        int expResult = 13;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class NIC_Interpreter.
     */
    public void testGetGender()throws Exception {
        System.out.println("getGender");
        NIC_Interpreter instance = new NIC_Interpreter("903184744V");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of is_a_Voter method, of class NIC_Interpreter.
     */
    public void testIs_a_Voter()throws Exception {
        System.out.println("isVoter");
        NIC_Interpreter instance = new NIC_Interpreter("903184744V");
        String expResult = "True";
        String result = instance.isVoter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
   
      
    
}
