package clase2;

public class Vehiculo {
    //Atributos privados del vehiculo
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private int velocidad;

    //Métodos para encender el vehiculo
    public void encender(){
        System.out.println("Vehiculo encendido");
    }

    //Método para acelerar el vehiculo
    public void acelerar(int cantidad){
        velocidad += cantidad;
        System.out.println("Acelerando... velocidad actual: " + velocidad+ " km/m");
    }


    //Método mostrar la información del vehiculo
    public void mostrarInformacion(){
        System.out.println("Marca :" + marca);
        System.out.println("Modelo :" + modelo);
        System.out.println("Año :" + year);
        System.out.println("Color :" + color);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
