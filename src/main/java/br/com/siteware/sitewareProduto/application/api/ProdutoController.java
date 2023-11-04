package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI {
    private final ProdutoService produtoService;

    @Override
    public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoController - postProduto");
        ProdutoResponse produtoCriado = produtoService.criaProduto(produtoRequest);
        log.info("[finaliza] ProdutoController - postProduto");
        return produtoCriado;
    }

    @Override
    public List<ProdutoListResponse> getTodosProdutos() {
        log.info("[inicia] ProdutoController - getTodosProdutos");
        List<ProdutoListResponse> produtos = produtoService.buscaTodosProdutos();
        log.info("[finaliza] ProdutoController - getTodosProdutos");
        return produtos;
    }

    @Override
    public ProdutoDetalhadoResponse getProdutoAtravesId(UUID idProduto) {
        log.info("[inicia] ProdutoController - getProdutoAtravesId");
        ProdutoDetalhadoResponse produtoDetalhado = produtoService.buscaProdutoAtravesId(idProduto);
        log.info("[finaliza] ProdutoController - getProdutoAtravesId");
        return produtoDetalhado;
    }

    @Override
    public void deletaProdutoAtravesId(UUID idProduto) {
        log.info("[inicia] ProdutoController - deletaProdutoAtravesId");
        log.info("[finaliza] ProdutoController - deletaProdutoAtravesId");
    }

}
