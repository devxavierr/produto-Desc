package br.com.siteware.sitewareProduto.infra;

import br.com.siteware.sitewareProduto.application.repository.ProdutoRepository;
import br.com.siteware.sitewareProduto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutoInfraRepository implements ProdutoRepository {
    private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;

    @Override
    public Produto salva(Produto produto) {
        log.info("[inicia] ProdutoInfraRepository - salva");
        produtoSpringDataJPARepository.save(produto);
        log.info("[finaliza] ProdutoInfraRepository - salva");
        return produto;
    }
}
