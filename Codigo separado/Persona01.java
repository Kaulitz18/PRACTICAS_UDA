public class Persona01 {
 
    public static void main(String[] args) {
         
         
    	FachadaEntrada fachada1= new FachadaEntrada("Numero de Entrada 1");
        fachada1.entrando();
         
        FachadaEntrada fachada2= new FachadaEntrada("Numero de Entrada 2");
        fachada2.entrando();
         
         
        Entrada i3 = new Entrada();
        i3.setCI("8622647");
        i3.setNombre("pedro simpson limachi");
        i3.setCargo("Dirigente");
        i3.setEntrada("Numero de Entrada 3");
        i3.entradaNumero();
    }
 
}