/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Adolfo
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru ca = new Canguru();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Arara ar = new Arara();
        GoldFish go = new GoldFish();
        Cachorro cao = new Cachorro();
        
        ca.emitirSom();
        cao.emitirSom();
        ar.alimentar();
        co.getMembros();
        m.locomover();
        p.setCorEscama("Vermelha");
        System.out.println(p);
                
    }
    
}
