/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Adolfo
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Jones");
       p2.setNome("Carla");
       p3.setNome("João");
       p4.setNome("Helena");
       
       p1.setSexo("M");
       p2.setSexo("F");
       p3.setSexo("M");
       p4.setSexo("F");
       
       p2.cancelarMatr();
       p3.recerberAumento(100.50f);
       p4.mudarTrabalgo();
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
