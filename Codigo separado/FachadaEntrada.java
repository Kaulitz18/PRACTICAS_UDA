public class FachadaEntrada {
 
    Entrada entrada;
     
     
    public FachadaEntrada(String Num_entrada) {
        super();
        entrada= new Entrada();
        entrada.setCI("7377284");
        entrada.setNombre("juan rodrigez flores");
        entrada.setCargo("Ejecutivo");
        entrada.setEntrada(Num_entrada);
    }
 
 
    public void entrando() {
         
    	entrada.entradaNumero();
    }
     
}