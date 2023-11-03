package br.com.siteware.sitewareProduto.application.repository;

import br.com.siteware.sitewareProduto.domain.Produto;

import java.util.List;

public interface ProdutoRepository {
    Produto salva(Produto produto);
    List<Produto> buscaTodosProdutos();
}
