package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.domain.StatusPromocao;
import lombok.Value;

import javax.validation.constraints.NotBlank;
@Value
public class ProdutoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String preco;
    private StatusPromocao statusPromocao;
}
