public class Vehiculo {
    //atributos
    private String modelo;
    private String numotor;
    private String serial;

    //constructor vacio
    public Vehiculo() {
    }

    //constructor con todos los parametros

    public Vehiculo(String modelo, String numotor, String serial) {
        this.modelo = modelo;
        this.numotor = numotor;
        this.serial = serial;
    }
    // getter - setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumotor() {
        return numotor;
    }

    public void setNumotor(String numotor) {
        this.numotor = numotor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    // to string

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", numotor='" + numotor + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
    //Metodos propios
    public void arrancar (){
        System.out.println ("SOY UN CARRO Y VOY A ARRANCAR");
    }

}