package br.calebe.ticketmachine;

import static org.junit.Assert.*;

import java.util.Iterator;

import br.calebe.ticketmachine.core.*;

import org.junit.Test;

public class TrocoTest {

    //visibilidade da classe troco e do vetor papeisMoeda foram colocados como publico para facilitar o teste, talvez seja necessário buscar solução menos invasiva

    @Test(timeout = 15000)
    public void testTrocoComValorExato() {
        Troco troco = new Troco(187); 
        assertEquals(1, troco.papeisMoeda[5].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[4].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[3].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[2].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[1].getQuantidade()); 
        assertEquals(1, troco.papeisMoeda[0].getQuantidade()); 
    }

    @Test(timeout = 15000)
    public void testIteratorHasNext() {
        Troco troco = new Troco(186);
        Iterator<PapelMoeda> iterator = troco.getIterator();
        assertTrue(iterator.hasNext());
    }
}