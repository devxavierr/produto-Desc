package br.com.siteware.sitewareProduto.produto.application.service;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoDetalhadoResponse;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoListResponse;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.siteware.sitewareProduto.produto.application.api.ProdutoResponse;
import br.com.siteware.sitewareProduto.produto.application.repository.ProdutoRepository;
import br.com.siteware.sitewareProduto.produto.domain.Produto;
import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Override
    public ProdutoResponse criaProduto(ProdutoAlteracaoRequest produtoRequest) {
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

    @Override
    public void deletaProdutoAtravesId(UUID idProduto) {
        log.info("[inicia] ProdutoApplicationService - deletaProdutoAtravesId");
        Produto produto = produtoRepository.buscaProdutoAtravesId(idProduto);
        produtoRepository.deletaProduto(produto);
        log.info("[finaliza] ProdutoApplicationService - deletaProdutoAtravesId");
    }

    @Override
    public void patchAlteraProduto(UUID idProduto, ProdutoAlteracaoRequest produtoAlteracaoRequest) {
        log.info("[inicia] ProdutoApplicationService - patchAlteraProduto");
        Produto produto = produtoRepository.buscaProdutoAtravesId(idProduto);
        produto.altera(produtoAlteracaoRequest);
        produtoRepository.salva(produto);
        log.info("[finaliza] ProdutoApplicationService - patchAlteraProduto");
    }
}
