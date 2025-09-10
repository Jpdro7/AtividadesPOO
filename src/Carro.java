public class Carro {
    public String cor;
    public int ano;
    public String modelo;
    public String marca;
    public String chassi;

    public void gasolina(String qntGas){
    System.out.printf("Quantidade %s", qntGas);
    }

    public void emDia(){
        System.out.printf("A %s está em dias", this.marca);
    }

    @Override
    public String toString() {
        return String.format("<Carro> cor=%s, modelo=%s, ano=%d, chassi=%s, marca=%s", cor, modelo, ano, chassi, marca);
    }
}
