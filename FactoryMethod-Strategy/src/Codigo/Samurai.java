package Codigo;

public class Samurai extends Personaje {
    
    public Samurai() {
        this.velocidad = 8;
        this.fuerza = 7;
        this.inteligencia = 5;
        this.mana = 100;
        this.vida = 100;
    }

    @Override
    protected double Ataca(ITipoAtaque tipoAtaque) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void RecuperaVida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
