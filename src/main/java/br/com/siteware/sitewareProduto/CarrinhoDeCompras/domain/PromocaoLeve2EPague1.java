package br.com.siteware.sitewareProduto.CarrinhoDeCompras.domain;

import java.math.BigDecimal;

public class PromocaoLeve2EPague1 implements PromocaoStrategy {
    @Override
    public BigDecimal aplicarPromocao(BigDecimal preco, Integer quantidadeProduto) {
            Integer quantidadePaga = quantidadeProduto - (quantidadeProduto / 2); // Calcula a quantidade a ser paga (1 em cada 2 produtos)
            return preco.multiply(new BigDecimal(quantidadePaga)); // Multiplica o valor original pela quantidade a ser paga
    }
}
