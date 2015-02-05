package jeudilemme;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PartieTest {

    Partie p;

    public PartieTest() {
    }

    @Before
    public void doBefore() {
        p = new Partie();
        p.coopere(true, true);
        p.coopere(false, true);
        p.coopere(false, false);
        p.coopere(true, false);
    }

    @Test
    public void testCoopere() {
        assertEquals(p.choix.get(0).getGainA(), 3,0);
    }

    @Test
    public void testGetNbCoups() {
        assertEquals(p.getNbCoups(), 4);
    }

    @Test
    public void testGetScoreA() {
        assertEquals(p.getScoreA(), 9, 0);
    }

    @Test
    public void testGetScoreB() {
        assertEquals(p.getScoreB(), 9, 0);
    }

    @Test
    public void testAAcoopere() {
        assertEquals(p.aAcoopere(1), true);
        assertEquals(p.aAcoopere(2), false);
        assertEquals(p.aAcoopere(3), false);
        assertEquals(p.aAcoopere(4), true);
    }

    @Test
    public void testBAcoopere() {
        assertEquals(p.bAcoopere(1), true);
        assertEquals(p.bAcoopere(2), true);
        assertEquals(p.bAcoopere(3), false);
        assertEquals(p.bAcoopere(4), false);

    }

}
