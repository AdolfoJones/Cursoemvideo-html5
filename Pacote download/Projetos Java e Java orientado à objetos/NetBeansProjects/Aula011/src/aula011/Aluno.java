/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author Adolfo
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String cruso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno! " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCruso() {
        return cruso;
    }

    public void setCruso(String cruso) {
        this.cruso = cruso;
    }
    
}
