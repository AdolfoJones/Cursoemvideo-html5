
package aula05;


public class Aula05 {

    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CC");
        p2.sacar(50);
        p2.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
