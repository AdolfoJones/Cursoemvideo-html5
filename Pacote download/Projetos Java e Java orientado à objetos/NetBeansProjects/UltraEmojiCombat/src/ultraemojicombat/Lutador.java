
package ultraemojicombat;


public class Lutador {
    //Atributos
    private String nome;
    private String categoria;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias, derrotas, empates;
    
    //Metodos Publicos
    public void apresentar(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Seu peso é de: " + this.getPeso() +"KG" + "Sua altura é de " + this.getAltura() );
        System.out.println("Sua idade é de: " + this.getIdade() +"anos!");
        System.out.println("Sua nacionalidade é: " + this.getNacionalidade());
        System.out.println(this.getVitorias() + "Vitória");
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpates() + "Empates");
    }
    public void status(){
        System.out.println(this.getNome() + " e da categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + "Vezes");
        System.out.println("Perdeu " + this.getDerrotas() + "Vezes");
        System.out.println("Empatou " + this.getEmpates() + "Vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1); 
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Metodos Especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if(this.peso < 52){
           this.categoria = "Inválido";
       } else if(this.peso <= 70.3){
           this.categoria = "Leve";
       } else if(this.peso <= 83.9){
           this.categoria = "Médio";
       } else if(this.peso <= 120.2){
           this.categoria = "Pesado";
       } else {
           this.categoria = "Inválido";
       }
        
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
