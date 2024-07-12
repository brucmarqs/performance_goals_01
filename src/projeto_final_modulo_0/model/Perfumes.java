package projeto_final_modulo_0.model;

public class Perfumes {

    private String nomePerfume;
    private String marca;
    private float preco;

    public Perfumes(String nomePerfume, String marca, float preco) {
        this.nomePerfume = nomePerfume;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNomePerfume() {
        return nomePerfume;
    }

    public void setNomePerfume(String nomePerfume) {
        this.nomePerfume = nomePerfume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizarPerfumes() {
        System.out.println("Nome do Perfume: " + getNomePerfume());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço R$: " + getPreco());

    }

}
