package br.com.siteware.sitewareProduto.produto.infra;

import br.com.siteware.sitewareProduto.produto.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID> {
}
