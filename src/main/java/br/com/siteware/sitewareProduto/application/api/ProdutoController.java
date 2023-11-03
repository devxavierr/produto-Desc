package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
