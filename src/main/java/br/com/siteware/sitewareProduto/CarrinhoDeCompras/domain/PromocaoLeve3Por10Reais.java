package br.com.siteware.sitewareProduto.CarrinhoDeCompras.domain;

import java.math.BigDecimal;

public class PromocaoLeve3Por10Reais implements PromocaoStrategy {
    @Override
    public BigDecimal aplicarPromocao(BigDecimal valor, Integer quantidadeProduto) {
        Integer gruposDe3 = quantidadeProduto / 3; // Divide a quantidade pelo tamanho do grupo (3 unidades)
        Integer unidadesRestantes = quantidadeProduto % 3; // Calcula as unidades restantes

        BigDecimal precoTotal = (new BigDecimal(gruposDe3).multiply(new BigDecimal("10.0")))
                .add(new BigDecimal(unidadesRestantes).multiply(valor));

        return precoTotal;
    }
}
