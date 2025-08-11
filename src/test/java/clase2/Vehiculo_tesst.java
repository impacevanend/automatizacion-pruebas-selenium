package clase2;

import org.junit.jupiter.api.Test;

public class Vehiculo_tesst {

    @Test
    void vehiculoTest() {
        //Crear un objeto de tipo vehiculo
        Vehiculo vehiculo = new Vehiculo();

        //Establecer los atributos del vehiculo
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("Camaro");
        vehiculo.setYear(2025);
        vehiculo.setColor("Amarillo");

        vehiculo.encender();
        vehiculo.acelerar(20);

        //Mostrar información del vehiculo
        vehiculo.mostrarInformacion();
    }
}
