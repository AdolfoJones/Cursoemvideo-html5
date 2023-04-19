
package aula;


public class Aula {

    
    public static void main(String[] args) {
        Hobbie h1 = new Hobbie();
        h1.tempo = "enrolarado";
        h1.horas = 13;
        h1.chuvoso = false;
        h1.semchuva();
        h1.correr();
        h1.status();
        
        Hobbie h2 = new Hobbie();
        h2.tempo = "Nublado";
        h2.horas = 19;
        h2.chuvoso = true;
        h2.estachovendo();
        h2.correr();
        h2.status();
    }
    
}
