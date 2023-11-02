package br.com.siteware.sitewareProduto.infra;

import br.com.siteware.sitewareProduto.application.repository.ProdutoRepository;
import br.com.siteware.sitewareProduto.domain.Produto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class ProdutoInfraRepository implements ProdutoRepository {
    @Override
    public Produto salva(Produto produto) {
        log.info("[inicia] ProdutoInfraRepository - salva");
        log.info("[finaliza] ProdutoInfraRepository - salva");
        return produto;
    }
}
