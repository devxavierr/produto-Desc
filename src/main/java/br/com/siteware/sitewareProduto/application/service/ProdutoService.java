package br.com.siteware.sitewareProduto.application.service;

import br.com.siteware.sitewareProduto.application.api.ProdutoRequest;
import br.com.siteware.sitewareProduto.application.api.ProdutoResponse;

public interface ProdutoService {
    ProdutoResponse criaProduto(ProdutoRequest produtoRequest);
}
