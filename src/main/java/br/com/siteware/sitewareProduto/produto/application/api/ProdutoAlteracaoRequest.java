package br.com.siteware.sitewareProduto.produto.application.api;

import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.Value;

import javax.validation.constraints.NotBlank;
@Value
public class ProdutoAlteracaoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String preco;
    private StatusPromocao statusPromocao;
}
