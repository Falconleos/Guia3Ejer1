
package Model;

import Enums.TipoTransporte;
import Interfaces.Transporte;

public class Bicicleta implements Transporte{
    String numeroSerie;
    TipoTransporte tipo;
    Boolean arrancado;

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.arrancado = false;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }
    
    
    public void ajustarAsiento(int altura){
        System.out.println("altura ajustada a:" + altura);
    }
    
    @Override
    public void arrancar(){
        this.arrancado = true;
        System.out.println("arrancando");
    }
    @Override
    public void detener(){
        this.arrancado = false;
        System.out.println("detendio");
    }
    @Override
    public int obtenerCapacidad(){
        System.out.println("capacidad:" + 1);
        return 1;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + '}';
    }
    
    public Boolean estaArrancado(){
    
        System.out.println(this.arrancado ? "la bicicleta esta arrancada" : "la bicicleta no esta arrancada");
        
    return this.arrancado;
    }
    
    
}
