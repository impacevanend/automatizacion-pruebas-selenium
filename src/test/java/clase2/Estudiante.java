package clase2;

public class Estudiante  extends Persona{

    //Atributo para la identificacion del estudiante
    private int estudianteId;
    public Estudiante(String nombre, int edad, int estudianteId) {
        super(nombre, edad);
        this.estudianteId = estudianteId;
    }

    public void estudiar(){
        System.out.println("El estudiante " + getNombre() + " con identificación " + estudianteId
        + " está estudiando.");
    }

    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }
}
