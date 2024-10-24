package br.calebe.ticketmachine;

import static org.junit.Assert.*;

import br.calebe.ticketmachine.core.*;

import org.junit.Test;

public class TrocoTest {

    @Test(timeout = 15000)
    public void testTrocoComValorExato() {
        Troco troco = new Troco(186); 
        assertEquals(1, troco.papeisMoeda[5].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[4].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[3].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[2].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[1].getQuantidade()); 
        assertEquals(3, troco.papeisMoeda[0].getQuantidade()); 
    }

    @Test(timeout = 15000)
    public void testIteratorHasNext() {
        Troco troco = new Troco(186);
        Iterator<PapelMoeda> iterator = troco.getIterator();
        assertTrue(iterator.hasNext());
    }
}