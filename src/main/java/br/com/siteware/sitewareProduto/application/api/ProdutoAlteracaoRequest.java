package br.com.siteware.sitewareProduto.application.api;

import lombok.Value;

import br.com.siteware.sitewareProduto.domain.StatusPromocao;

import javax.validation.constraints.NotBlank;
@Value
public class ProdutoAlteracaoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String preco;
    private StatusPromocao statusPromocao;
}
