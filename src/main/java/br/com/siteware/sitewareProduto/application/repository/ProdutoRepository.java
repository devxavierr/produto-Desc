package br.com.siteware.sitewareProduto.application.repository;

import br.com.siteware.sitewareProduto.domain.Produto;

public interface ProdutoRepository {
    Produto salva(Produto produto);
}
