package br.com.siteware.sitewareProduto.produto.application.repository;

import br.com.siteware.sitewareProduto.produto.domain.Produto;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository {
    Produto salva(Produto produto);
    List<Produto> buscaTodosProdutos();
    Produto buscaProdutoAtravesId(UUID idProduto);
    void deletaProduto(Produto produto);
}
