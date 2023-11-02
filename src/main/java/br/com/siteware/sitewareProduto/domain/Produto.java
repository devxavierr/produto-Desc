package br.com.siteware.sitewareProduto.domain;

import br.com.siteware.sitewareProduto.application.api.ProdutoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idProduto;
    @NotBlank
    private String nome;
    @NotBlank
    private String preco;
    private StatusPromocao statusPromocao;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Produto(ProdutoRequest produtoRequest) {
        this.nome = produtoRequest.getNome();
        this.preco = produtoRequest.getPreco();
        this.statusPromocao = produtoRequest.getStatusPromocao();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }


}
