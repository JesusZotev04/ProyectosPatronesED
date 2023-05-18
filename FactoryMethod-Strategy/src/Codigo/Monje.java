package Codigo;

public class Monje extends Personaje {
    
    public Monje() {
        this.velocidad = 7;
        this.fuerza = 6;
        this.inteligencia = 6;
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
