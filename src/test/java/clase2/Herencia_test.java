package clase2;

import org.junit.jupiter.api.Test;

public class Herencia_test {
    @Test
    void estudianteTest() {
        //Crear objeto estudiante
        Estudiante estudiante = new Estudiante("Ana",35, 159);

        //Llamar al métod presentarce heredado de lc aclase persona
        estudiante.presentar();

        //Llamar al método estudiar propio de la clase estudiante
        estudiante.estudiar();
    }
}
