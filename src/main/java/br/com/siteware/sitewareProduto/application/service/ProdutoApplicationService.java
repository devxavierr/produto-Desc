package br.com.siteware.sitewareProduto.application.service;

import br.com.siteware.sitewareProduto.application.api.ProdutoRequest;
import br.com.siteware.sitewareProduto.application.api.ProdutoResponse;
import br.com.siteware.sitewareProduto.domain.Produto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProdutoApplicationService implements ProdutoService {
    @Override
    public ProdutoResponse criaProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoApplicationService - criaProduto");
        Produto produto = produtoRepository.salva(new Produto(produtoRequest));
        log.info("[finaliza] ProdutoApplicationService - criaProduto");
        return null;
    }
}
