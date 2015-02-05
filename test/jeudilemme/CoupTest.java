/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudilemme;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Ciao_hoanG
 */
public class CoupTest {
    
    
    public CoupTest() {
    }

    @Test
    public void testGetGainA() {
        Coup c1 = new Coup(true, true);
        Coup c2 = new Coup(true, false);
        Coup c3 = new Coup(false, true);
        Coup c4 = new Coup(false, false);
        assertEquals(c1.getGainA(), 3,0);
        assertEquals(c2.getGainA(), 0,0);
        assertEquals(c3.getGainA(), 5,0);
        assertEquals(c4.getGainA(), 1,0);
    }

    @Test
    public void testGetGainB() {
        Coup c1 = new Coup(true, true);
        Coup c2 = new Coup(true, false);
        Coup c3 = new Coup(false, true);
        Coup c4 = new Coup(false, false);
        assertEquals(c1.getGainB(), 3,0);
        assertEquals(c2.getGainB(), 5,0);
        assertEquals(c3.getGainB(), 0,0);
        assertEquals(c4.getGainB(), 1,0);
    }
    
}
