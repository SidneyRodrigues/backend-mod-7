public class Hotel {

    // Propriedades
    private String nome;
    private String endereco;
    private int numeroDeQuartos;
    private int numeroDeEstrelas;
    private boolean temPiscina;

    // Construtor
    public Hotel(String nome, String endereco, int numeroDeQuartos, int numeroDeEstrelas, boolean temPiscina){
        this.nome = nome;
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeEstrelas = numeroDeEstrelas;
        this.temPiscina = temPiscina;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public int getNumeroDeEstrelas() {
        return numeroDeEstrelas;
    }

    public void setNumeroDeEstrelas(int numeroDeEstrelas) {
        this.numeroDeEstrelas = numeroDeEstrelas;
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    // Método para exibir detalhes do hotel
    public void exibirDetalhes(){
        System.out.println("Nome do Hotel: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Números de Quartos: " + numeroDeQuartos);
        System.out.println("Números de Estrelas: " + numeroDeEstrelas);
        System.out.println("Tem piscina: " + (temPiscina ? "Sim" : "Não"));
    }

    // Método principal para testar a classe Hotel
    public static void main(String[] args) {
        Hotel meuHotel = new Hotel(
                "Hotel Mandacaru",
                "Avenida 11 de Novembro, 500", 50, 4, true);

        meuHotel.exibirDetalhes();
    }
}
