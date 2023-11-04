package br.com.siteware.sitewareProduto.produto.application.service;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoDetalhadoResponse;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoListResponse;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoResponse;

import java.util.List;
import java.util.UUID;

public interface ProdutoService {
    ProdutoResponse criaProduto(ProdutoAlteracaoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();
    ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto);
    void deletaProdutoAtravesId(UUID idProduto);
    void patchAlteraProduto(UUID idProduto, ProdutoAlteracaoRequest produtoAlteracaoRequest);
}
