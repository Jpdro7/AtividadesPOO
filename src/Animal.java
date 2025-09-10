public class Animal {
    public String raca;
    public String idade;
    public String nome;
    public String peso;
    public String cor;



    public void latir(){
        System.out.println("AuAuAu");
    }

    public void comer(){
        System.out.println("O " + this.nome + " está comendo");
    }

    @Override
    public String toString() {
        return String.format("<Animal: nome=%s>", nome);
    }
}
