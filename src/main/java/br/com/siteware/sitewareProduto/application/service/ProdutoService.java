package br.com.siteware.sitewareProduto.application.service;

import br.com.siteware.sitewareProduto.application.api.ProdutoListResponse;
import br.com.siteware.sitewareProduto.application.api.ProdutoRequest;
import br.com.siteware.sitewareProduto.application.api.ProdutoResponse;

import java.util.List;

public interface ProdutoService {
    ProdutoResponse criaProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();
}
