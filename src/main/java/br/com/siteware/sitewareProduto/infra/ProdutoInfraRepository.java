package br.com.siteware.sitewareProduto.infra;

import br.com.siteware.sitewareProduto.application.repository.ProdutoRepository;
import br.com.siteware.sitewareProduto.domain.Produto;
import br.com.siteware.sitewareProduto.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Produto> buscaTodosProdutos() {
        log.info("[inicia] ProdutoInfraRepository - buscaTodosProdutos");
        List<Produto> todosProdutoss = produtoSpringDataJPARepository.findAll();
        log.info("[finaliza] ProdutoInfraRepository - buscaTodosProdutos");
        return todosProdutoss;
    }

    @Override
    public Produto buscaProdutoAtravesId(UUID idProduto) {
        log.info("[inicia] ProdutoInfraRepository - buscaProdutoAtravesId");
        Produto produto = produtoSpringDataJPARepository.findById(idProduto)
                .orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
        log.info("[finaliza] ProdutoInfraRepository - buscaProdutoAtravesId");
        return produto;
    }
}
