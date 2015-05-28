public class Entrada {
 
 

    private String CI;
    private String Nombre;
    private String Cargo;
    private String Entrada;
     
     
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }
    public String getCI() {
        return CI;
    }
    public void setCI(String ci) {
        this.CI = ci;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getEntrada() {
        return Entrada;
    }
    public void setEntrada(String entrada) {
        this.Entrada = entrada;
    }
     
    public void entradaNumero() {
         
        System.out.println("Ingresando: CI: "+ CI+ ", Nombre: "
        + Nombre+", Cargo: "+Cargo+", Numero : "+Entrada);
    }
}