
package Model;
import Enums.TipoTransporte;
import Interfaces.Transporte;

public class Tranvia implements Transporte{
    
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;
    private Boolean arrancado;

    public Tranvia(String ruta, Integer capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.arrancado = false;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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
    
    public void cambiarVia(int nuevaVia){
        String nuevaRuta = String.valueOf(nuevaVia);
    }

@Override
    public void arrancar(){
        this.arrancado = true;
        System.out.println("Arrancando");
    }
    
@Override
    public void detener(){
        this.arrancado = false;
        System.out.println("Deteniendo");
    }
    
@Override
    public int obtenerCapacidad(){
        System.out.println("capacidad t:" + this.capacidad);
    return this.capacidad;
    }

    @Override
    public String toString() {
        return "Tranvia{" + "tipo=" + tipo + '}';
    }
    
    public Boolean estaArrancado(){
        System.out.println(this.arrancado ? "el tranvia esta arrancado" : "eltranvia no esta arrancado");
    return this.arrancado;
    }
    

}


