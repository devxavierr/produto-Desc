package br.com.siteware.sitewareProduto.produto.domain;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public enum StatusPromocao {
     LEVE2EPAGUE1(new PromocaoLeve2EPague1()), LEVE3POR10REAIS( new PromocaoLeve3Por10Reais());

    private final PromocaoStrategy promocaoStrategy;
    public BigDecimal aplicarPromocao(ProdutoAlteracaoRequest produto){
        return promocaoStrategy.aplicarPromocao(produto.getPreco(), produto.getQuantidadeProduto());
    }
}
