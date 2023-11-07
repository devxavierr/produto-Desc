package br.com.siteware.sitewareProduto.produto.domain;

import java.math.BigDecimal;

public interface PromocaoStrategy {
    BigDecimal aplicarPromocao(BigDecimal valor, Integer quantidadeProduto);

}
