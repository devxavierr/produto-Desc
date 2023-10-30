package br.com.siteware.sitewareProduto.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Produto {
    @Id
    private UUID idProduto;
    @NotBlank
    private String nome;
    @NotBlank
    private double preco;
    private StatusPromocao statusPromocao;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

}
