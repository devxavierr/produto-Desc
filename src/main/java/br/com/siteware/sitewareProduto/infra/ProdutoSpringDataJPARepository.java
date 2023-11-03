package br.com.siteware.sitewareProduto.infra;

import br.com.siteware.sitewareProduto.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID> {
}
