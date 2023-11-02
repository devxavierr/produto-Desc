package br.com.siteware.sitewareProduto.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ProdutoController implements ProdutoAPI {
    @Override
    public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoController - postProduto");
        log.info("[finaliza] ProdutoController - postProduto");
        return null;
    }
}
