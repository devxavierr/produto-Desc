package br.com.siteware.sitewareProduto.application.service;

import br.com.siteware.sitewareProduto.application.api.ProdutoDetalhadoResponse;
import br.com.siteware.sitewareProduto.application.api.ProdutoListResponse;
import br.com.siteware.sitewareProduto.application.api.ProdutoRequest;
import br.com.siteware.sitewareProduto.application.api.ProdutoResponse;
import br.com.siteware.sitewareProduto.application.repository.ProdutoRepository;
import br.com.siteware.sitewareProduto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Override
    public ProdutoResponse criaProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoApplicationService - criaProduto");
        Produto produto = produtoRepository.salva(new Produto(produtoRequest));
        log.info("[finaliza] ProdutoApplicationService - criaProduto");
        return ProdutoResponse.builder()
                .idProduto(produto.getIdProduto())
                .build();
    }

    @Override
    public List<ProdutoListResponse> buscaTodosProdutos() {
        log.info("[inicia] ProdutoApplicationService - buscaTodosProdutos");
        List<Produto> produtos = produtoRepository.buscaTodosProdutos();
        log.info("[finaliza] ProdutoApplicationService - buscaTodosProdutos");
        return ProdutoListResponse.converte(produtos);
    }

    @Override
    public ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto) {
        log.info("[inicia] ProdutoApplicationService - buscaProdutoAtravesId");
        Produto produto = produtoRepository.buscaProdutoAtravesId(idProduto);
        log.info("[finaliza] ProdutoApplicationService - buscaProdutoAtravesId");
        return new ProdutoDetalhadoResponse(produto);
    }
}
