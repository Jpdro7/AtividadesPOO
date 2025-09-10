public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nom = "João Pedro";
        pessoa1.altura = 1.65;
        pessoa1.genero = "Masculino";
        pessoa1.numDoc = "123.456.789-12";
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nom = "Maria Vitoria";
        pessoa2.altura = 1.50;
        pessoa2.genero = "Feminino";
        pessoa2.numDoc = "987.654.321-21";
        pessoa2.idade = 18;

        pessoa1.falar(String.format("Olá, %s", pessoa2.nom));
        System.out.println();
        pessoa2.falar((String.format("Olá, %s \n", pessoa1.nom)));

        Carro veiculo1 = new Carro();
        veiculo1.marca = "Ferrari";
        veiculo1.modelo = "La Ferrari";
        veiculo1.chassi = "dknbv43n";
        veiculo1.ano = 2024;
        veiculo1.cor = "Vermelho";

        Carro veiculo2 = new Carro();
        veiculo2.marca = "Lamborghine";
        veiculo2.modelo = "Aventador";
        veiculo2.chassi = "sas23fdd";
        veiculo2.ano = 2025;
        veiculo2.cor = "Verde";

        Animal animal1 = new Animal();
        animal1.nome = "Scooby-Doo";
        animal1.raca = "Dogue Alemão";
        animal1.idade = "1 Ano";
        animal1.cor = "Marron";
        animal1.peso = "16 Kg";

        Animal animal2 = new Animal();
        animal2.nome = "Rex";
        animal2.raca = "Pitbull";
        animal2.idade = "6 Messes";
        animal2.cor = "Preto";
        animal2.peso = "27 Kg";

        Casa casa = new Casa(2,2,2);
        casa.vetorDePessoas[0] = pessoa1;
        casa.vetorDePessoas[1] = pessoa2;
        casa.vetorDeCarros[0] = veiculo1;
        casa.vetorDeCarros[1] = veiculo2;
        casa.vetorDeAnimais[0] = animal1;
        casa.vetorDeAnimais[1] = animal2;

        System.out.println(casa);

    }
}