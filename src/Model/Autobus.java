
package Model;

import Interfaces.Transporte;
import Enums.TipoTransporte;

public class Autobus implements Transporte{
    
    private Integer numeroLinea;
    private Integer capacidad;
    private TipoTransporte tipo;
    private Boolean arrancado;

    public Autobus(Integer numeroLinea, Integer capacidad, TipoTransporte tipo) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.arrancado = false;
    }

    public Integer getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(Integer numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }
    
    public void anunciarParada(){
        System.out.println("Parada anunciada");
    }
    
    @Override
    public void arrancar(){
        this.arrancado = true;
        System.out.println("arrancando autobus");
    }
    
    @Override
    public void detener(){
        this.arrancado = false;
        System.out.println("deteniendo autobus");
    }
    
    @Override
    public int obtenerCapacidad(){
        System.out.println("Capacidad de autobus: " + this.capacidad);
        return this.capacidad;
    }

    @Override
    public String toString() {
        return "Autobus{" + "tipo=" + tipo + '}';
    }
    
    public Boolean estaArrancado(){
        
        System.out.println(this.arrancado ? "el autobus esta arrancado" :  "el autobus no esta arrancado");
        
    return this.arrancado;
    }
    
            
    
}
