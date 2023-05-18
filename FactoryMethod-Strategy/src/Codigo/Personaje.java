package Codigo;

public abstract class Personaje {
    protected int vida, mana, velocidad, fuerza, inteligencia;
    // private ITipoAtaque[] ataques;

    protected abstract double Ataca(ITipoAtaque tipoAtaque);
    
    protected abstract void RecuperaVida();
}