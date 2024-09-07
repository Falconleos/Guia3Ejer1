
package main;

import Model.Autobus;
import Model.Tranvia;
import Model.Bicicleta;
import Enums.TipoTransporte;


public class main {

    public static void main(String[] args) {
    
        Autobus a1 = new Autobus(306,50,TipoTransporte.AUTOBUS);
        Tranvia t1 = new Tranvia("Interestatal",60,TipoTransporte.TRANVIA);
        Bicicleta b1 = new Bicicleta("0045BX12",TipoTransporte.BICICLETA);
        
        a1.arrancar();
        a1.detener();
        a1.obtenerCapacidad();
        t1.arrancar();
        t1.detener();
        t1.obtenerCapacidad();
        b1.arrancar();
        b1.detener();
        b1.obtenerCapacidad();
        
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        
        a1.estaArrancado();
        b1.estaArrancado();
        t1.estaArrancado();
        
    }
    
}
