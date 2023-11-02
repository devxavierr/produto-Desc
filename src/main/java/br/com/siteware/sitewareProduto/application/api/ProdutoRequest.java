package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.domain.StatusPromocao;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class ProdutoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private double preco;
    private StatusPromocao statusPromocao;
}
