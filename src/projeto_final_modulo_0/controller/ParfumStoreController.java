package projeto_final_modulo_0.controller;

import projeto_final_modulo_0.model.Perfumes;
import projeto_final_modulo_0.repository.ParfumStoreRepository;

import java.util.ArrayList;
import java.util.List;

public class ParfumStoreController implements ParfumStoreRepository {

    private List<Perfumes> perfumes = new ArrayList<>();
    @Override
    public void cadastrarPerfume(String nomePerfume, String marca, float preco) {
        Perfumes perfume = new Perfumes(nomePerfume, marca, preco);
        perfumes.add(perfume);
    }

    @Override
    public List<Perfumes> listarPerfumes() {
        try {
            perfumes.stream().forEach(Perfumes::visualizarPerfumes);
        }catch (Exception e) {
            System.out.println("Erro ao listar reservas nacionais: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void atualizarItem(String nomePerfume, String marca, float preco) {
        boolean encontrado = false;
        for (Perfumes perfume : perfumes) {
            if (perfume.getNomePerfume().equalsIgnoreCase(nomePerfume)) {
                perfume.setMarca(marca);
                perfume.setPreco(preco);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("Perfume não encontrado: " + nomePerfume);
        }
    }

        @Override
        public void excluirItem (String nomePerfume){
            perfumes.removeIf(perfumes -> perfumes.getNomePerfume().equalsIgnoreCase(nomePerfume));

        }
    }

