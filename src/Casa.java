public class Casa {
    public Pessoa[] vetorDePessoas;
    public Carro[] vetorDeCarros;
    public Animal[] vetorDeAnimais;

    public Casa(){}

    public Casa(int qntPessoas, int qntCarros, int qntAnimais){
        vetorDePessoas = new Pessoa[qntPessoas];
        vetorDeCarros = new Carro[qntCarros];
        vetorDeAnimais = new Animal[qntAnimais];
    }

    public void mostrarPessoas(){
        for (int i = 0; i < vetorDePessoas.length; i++){
            System.out.println(vetorDePessoas[i]);
        }
    }

    public void mostrarCarros(){
        for (int i = 0; i < vetorDeCarros.length; i++){
            System.out.println(vetorDeCarros[i]);
        }
    }

    public void mostrarAnimais(){
        for (int i = 0; i < vetorDeAnimais.length; i++){
            System.out.println(vetorDeAnimais[i]);
        }
    }

    @Override
    public String toString() {
        mostrarCarros();
        mostrarPessoas();
        mostrarAnimais();
        return "";
    }
}
