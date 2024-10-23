package br.calebe.ticketmachine;

import static org.junit.Assert.*;

import br.calebe.ticketmachine.core.*;

import org.junit.Test;

public class PapelMoedaTest {
    @Test
    public void GetValorTeste()
    {
        PapelMoeda papelMoeda = new PapelMoeda(2, 0);
        assertEquals(2, papelMoeda.getValor());
    }

    @Test
    public void GetQuantidadeTeste(){
        PapelMoeda papelMoeda = new PapelMoeda(2, 0);
        assertEquals(0, papelMoeda.getQuantidade());
    }
}
