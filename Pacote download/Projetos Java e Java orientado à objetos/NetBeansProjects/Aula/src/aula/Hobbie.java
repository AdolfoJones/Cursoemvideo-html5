
package aula;

public class Hobbie {
    String tempo;
    int horas;
    boolean chuvoso;
    
    void status(){
        System.out.println("O tempo esta " + this.tempo);
        System.out.println("Que horas são? São " + this.horas +"h");
        System.out.println("Está chovendo? " + this.chuvoso);
    }
    
    void semchuva(){
        this.chuvoso = false;
    }
    
    void estachovendo(){
        this.chuvoso = true;
    }
    
    void correr(){
        if (this.chuvoso == true){
            System.out.println("Não vou sair, pois está chovendo! ");
        }else{
            System.out.println("Vou sair, pois o tempo está bom! ");
        }
    }
}
