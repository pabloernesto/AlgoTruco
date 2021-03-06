package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;
import src.fiuba.algo3.modelo.CartaVersus;

public class CartaTest
{
    @Test
    public void testCartasIgualesEmpardan()
    {
        Carta a = new Carta(Palo.Espada, 1);
        Assert.assertEquals(CartaVersus.Emparda, Carta.comparar(a, a));
    }

    @Test
    public void test5Mata4()
    {
        Carta cinco = new Carta(Palo.Espada, 5);
        Carta cuatro = new Carta(Palo.Copa, 4);
        
        Assert.assertEquals(CartaVersus.Mata, Carta.comparar(cinco, cuatro));
        Assert.assertEquals(CartaVersus.Pierde, Carta.comparar(cuatro, cinco));
    }
    
    @Test
    public void test3Mata4()
    {
        Carta tres = new Carta(Palo.Basto, 3);
        Carta cuatro = new Carta(Palo.Espada, 4);
        
        Assert.assertEquals(CartaVersus.Mata, Carta.comparar(tres, cuatro));
        Assert.assertEquals(CartaVersus.Pierde, Carta.comparar(cuatro, tres));
    }
}

