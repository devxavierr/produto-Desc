package br.com.siteware.sitewareProduto.produto.application.api;

import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Value
public class ProdutoAlteracaoRequest {
    @NotBlank
    private String nome;
    private Integer quantidadeProduto;
    @NotNull
    private BigDecimal preco;
    private StatusPromocao statusPromocao;
}
