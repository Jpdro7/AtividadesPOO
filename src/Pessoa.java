public class Pessoa {
    public String nom;
    public int idade;
    public String genero;
    public double altura;
    public String numDoc;

    public void andar(){
        System.out.println("Andando");
    }

    public void comer(String comida){
        System.out.printf("Comendo %s", comida);
    }

    public void falar(String frase){
        System.out.printf("%s: %s", this.nom, frase);
    }

    @Override
    public String toString() {
        return String.format("<Pessoa: nome=%s, idade=%d, genero=%s, altura=%.2f, doc=%s>", nom, idade, genero, altura, numDoc);
    }
}
