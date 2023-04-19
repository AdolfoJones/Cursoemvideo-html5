
package aula011;

public class Aula011 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Jones");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setCruso("Informática");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        a1.setMatricula(12);
        System.out.println(a1.toString());
        
         Bolsista b1 = new Bolsista();
         b1.setMatricula(13);
         b1.pagarMensalidade();
        
    }
    
}
