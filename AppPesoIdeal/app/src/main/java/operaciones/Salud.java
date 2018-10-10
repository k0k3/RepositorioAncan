package operaciones;

public class Salud {

    private String nombre;
    private int pesoActual;
    private int edad;
    private int pesoIdeal;
    private String estado_peso;


    public int calcularPesoIdeal(){
        return edad * 2+8;
    }

    public String calcularEstadoPeso(){
        if (pesoActual == pesoIdeal){
            estado_peso = "Peso Perfecto";
        }else{
            if (pesoIdeal>pesoActual){
                estado_peso= " bajo peso ";
            }else{
                estado_peso="SobrePeso";
            }
        }
        return estado_peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String getEstado_peso() {
        return estado_peso;
    }

    public void setEstado_peso(String estado_peso) {
        this.estado_peso = estado_peso;
    }
}
