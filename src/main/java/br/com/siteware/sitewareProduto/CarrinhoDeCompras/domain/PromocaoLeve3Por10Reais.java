package br.com.siteware.sitewareProduto.CarrinhoDeCompras.domain;

import java.math.BigDecimal;

public class PromocaoLeve3Por10Reais implements PromocaoStrategy {
    @Override
    public BigDecimal aplicarPromocao(BigDecimal preco, Integer quantidadeProduto) {
        Integer gruposDe3 = quantidadeProduto / 3;
        Integer unidadesRestantes = quantidadeProduto % 3;

        BigDecimal precoTotal = (new BigDecimal(gruposDe3).multiply(new BigDecimal("10.0")))
                .add(new BigDecimal(unidadesRestantes).multiply(preco));

        return precoTotal;
    }
}
