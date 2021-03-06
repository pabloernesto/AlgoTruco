package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Ciclo;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class CicloTest
{
    private Ciclo unCiclo;
    private Jugador j1, j2;

    @Before
    public void setUp()
    {
        j1 = new Jugador();
        j2 = new Jugador();
        
        unCiclo = new Ciclo(j1, j2);
    }

    @Test
    public void testNuevoCicloNoTieneGanador()
    {
        Assert.assertEquals(null, unCiclo.getGanador());
    }
    
    @Test
    public void testJugarDosVecesDefinePrimeraRonda()
    {
        unCiclo.jugar(j1, new Carta(Palo.Espada, 1));
        unCiclo.jugar(j2, new Carta(Palo.Oro, 7));
        
        Assert.assertEquals(j1, unCiclo.getRonda(1).getGanador());
        Assert.assertEquals(null, unCiclo.getGanador());
    }
    
    @Test
    public void testGanarDosRondasDefineElCiclo()
    {
        unCiclo.jugar(j1, new Carta(Palo.Espada, 1));
        unCiclo.jugar(j2, new Carta(Palo.Oro, 7));
        
        unCiclo.jugar(j1, new Carta(Palo.Basto, 1));
        unCiclo.jugar(j2, new Carta(Palo.Copa, 6));
        
        Assert.assertEquals(j1, unCiclo.getGanador());
    }

    @Test(expected = RuntimeException.class)
    public void testJugadorNoRegistradoNoPuedeJugar()
    {
        Jugador j3 = new Jugador();
        
        unCiclo.jugar(j3, new Carta(Palo.Espada, 1));
    }
}

