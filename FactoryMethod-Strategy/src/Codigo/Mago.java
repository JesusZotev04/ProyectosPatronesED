package Codigo;

public class Mago extends Personaje {
    
    public Mago() {
        this.velocidad = 6;
        this.fuerza = 8;
        this.inteligencia = 4;
        this.mana = 100;
        this.vida = 100;
    }
    
    @Override
    protected double Ataca(ITipoAtaque tipoAtaque) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void RecuperaVida() {
        this.vida = (vida + 20 <= 100) ? vida + 20 : 100;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }
}
