package br.com.siteware.sitewareProduto.CarrinhoDeCompras.domain;

import java.math.BigDecimal;

public interface PromocaoStrategy {
    BigDecimal aplicarPromocao(BigDecimal valor, Integer quantidadeProduto);

}
