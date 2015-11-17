package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Mazo;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

import java.util.Collection;

public class MazoTest
{
    Mazo mazo;
    
    @Before
    public void setUp()
    {
        mazo = new Mazo();
    }
    
    @Test
    public void testSacarCartaDevuelveUnaCarta()
    {
        Assert.assertNotEquals(null, mazo.sacar());
    }
}

