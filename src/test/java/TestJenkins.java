/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.jenkinsexample.NewMain;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michel
 */
public class TestJenkins {
    
    public TestJenkins() {
    }
    
    @Test
    public void test1() {
        NewMain m = new NewMain();
        assertEquals(6,m.suma(2,4));
    }
}
