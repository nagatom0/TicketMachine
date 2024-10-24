package br.calebe.ticketmachine;

import static org.junit.Assert.*;

import br.calebe.ticketmachine.core.*;

import org.junit.Test;

public class TicketMachineTest {

    @Test
    public void testInserir() throws Exception {
        TicketMachine instance = new TicketMachine(10);
        instance.inserir(10);
        int result = instance.getSaldo();
        assertEquals(10, result);
    }

    @Test
    public void testGetSaldo() {
        TicketMachine instance = new TicketMachine(10);
        int expResult = 0;
        int result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    @Test
    public void testImprimir() throws Exception {
        TicketMachine instance = new TicketMachine(10);
        String expResult = "*****************\n";
        expResult += "*** R$ " + 10 + ",00 ****\n";
        expResult += "*****************\n";
        String result = instance.imprimir();
        assertEquals(expResult, result);
    }

}