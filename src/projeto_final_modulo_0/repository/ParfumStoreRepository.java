package projeto_final_modulo_0.repository;

import projeto_final_modulo_0.model.PerfumesDisponiveis;

import java.util.List;

public interface ParfumStoreRepository {

    void cadastrarPerfume(String nomePerfume, String marca, float preco);

    List <PerfumesDisponiveis> listarPerfumes ();

    void atualizarItem (String nomePerfume, String marca, float preco);

    void excluirItem (String nomePerfume);

}
