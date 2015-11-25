package src.fiuba.algo3.modelo;

public class EstadoEnvidoNoCantado
        implements EstadoEnvido
{
    private Ciclo ciclo;
    
    public void setCiclo(Ciclo c)
    {
        ciclo = c;
    }

    public void envidoQuiero(Jugador j)
    {
    }
    
    public void envidoNoQuiero(Jugador j)
    {
    }
    
    public void cantarEnvido(Jugador j)
    {
        ciclo.setEstadoEnvido(new EstadoEnvidoCantado());
    }
}
