package br.com.siteware.sitewareProduto.CarrinhoDeCompras.domain;

import java.math.BigDecimal;

public class PromocaoLeve2EPague1 implements PromocaoStrategy {
    @Override
    public BigDecimal aplicarPromocao(BigDecimal preco, Integer quantidadeProduto) {
            Integer quantidadePaga = quantidadeProduto - (quantidadeProduto / 2);
            return preco.multiply(new BigDecimal(quantidadePaga));
    }
}
